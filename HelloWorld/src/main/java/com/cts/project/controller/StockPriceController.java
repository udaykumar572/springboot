package com.cts.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.dao.StockPriceRepository;
import com.cts.project.dao.UserRepository;
import com.cts.project.pojos.ManageExchange;
import com.cts.project.pojos.StockPrice;
import com.cts.project.pojos.User;



@RestController
public class StockPriceController 
{
	@Autowired
	private StockPriceRepository stockpriceRepository;
	@RequestMapping("/getAllstockprices")
	public Iterable<StockPrice> getAllstockprices() {
		return stockpriceRepository.findAll();
	}
	@PostMapping("/saveStockPrice")
	public StockPrice saveStockPrice(@RequestBody StockPrice stockprice)
	{
		System.out.println(stockprice);
		stockpriceRepository.save(stockprice);
		return stockprice;	
	}
	@PutMapping("/updateStockPrice/{companycode}")
	public StockPrice updateStockPrice(@RequestBody StockPrice stockprice, @PathVariable("companycode") int companycode)
	{
		stockprice.setCompanycode(companycode);
		System.out.println(stockprice);
		stockpriceRepository.save(stockprice);
		return stockprice;	
	}

	@DeleteMapping("/deleteStockprice/{companycode}")

	 public StockPrice deleteStockprice(@RequestBody StockPrice stockprice, @PathVariable("companycode") Integer companycode) {



	 System.out.println(stockprice);

	 stockpriceRepository.deleteById(companycode);

	 return stockprice;

	 }



	 @GetMapping("/findOneInAll/{companycode}")

	 public StockPrice findoneinall(@PathVariable("companycode") Integer companycode) {



	 Optional<StockPrice> stockprice = stockpriceRepository.findById(companycode);

	 return stockprice.get();



	 }
}
