package com.cts.project.pojos;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity

@Table(name="stockPrice")
public class StockPrice {
	@Id
	private Integer companycode;
	private  Integer stockexchange;
	private Integer currentprice;

	private Date date;
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	private Time time;
	
	
	
	
	
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "StockPrice [companycode=" + companycode + ", stockexchange=" + stockexchange + ", currentprice="
				+ currentprice + ", date=" + date + ", time=" + time + "]";
	}
	public Integer getCompanycode() {
		return companycode;
	}
	public void setCompanycode(Integer companycode) {
		this.companycode = companycode;
	}
	public Integer getStockexchange() {
		return stockexchange;
	}
	public void setStockexchange(Integer stockexchange) {
		this.stockexchange = stockexchange;
	}
	public Integer getCurrentprice() {
		return currentprice;
	}
	public void setCurrentprice(Integer currentprice) {
		this.currentprice = currentprice;
	}
	

	
	
}

