package com.cts.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.dao.ManageExchangeRepository;
import com.cts.project.pojos.ManageExchange;
import com.cts.project.pojos.User;



@RestController
public class ManageExchangeController 
{
	@Autowired
	private ManageExchangeRepository manageExchangeRepository;
	@RequestMapping("/getAllexchanges")
	public Iterable<ManageExchange> getAllexchangess() {
		return manageExchangeRepository.findAll();
	}
	@PostMapping("/saveManageExchange")
	public ManageExchange saveManageExchange(@RequestBody ManageExchange exchange)
	{
		System.out.println(exchange);
		manageExchangeRepository.save(exchange);
		return exchange;	
	}
	@PutMapping("/updateManageExchange/{id}")
	public ManageExchange updateManageExchange(@RequestBody ManageExchange exchange, @PathVariable("id") int id)
	{
		exchange.setId(id);
		System.out.println(exchange);
		manageExchangeRepository.save(exchange);
		return exchange;	
	}
}
