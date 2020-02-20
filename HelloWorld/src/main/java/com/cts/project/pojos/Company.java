package com.cts.project.pojos;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Entity;

import javax.persistence.Table;

import javax.persistence.Id;

import javax.persistence.Column;

@Entity

@Table(name="company")

public class Company {
	@Override
	public String toString() {
		return "Company [companyname=" + companyname + ", turnover=" + turnover + ", ceo=" + ceo + ", boardofdirectors="
				+ boardofdirectors + ", listedinstockexchange=" + listedinstockexchange + ", sector=" + sector
				+ ", stockcode=" + stockcode + "]";
	}

	@Id
	  private String companyname;

	  

	  private int turnover;

	  private String ceo;

	  private String boardofdirectors;

	  private String listedinstockexchange;

	  private String sector;
	  
	  @Column(name="stockcode",nullable=false,length=100)
	  
	  private int stockcode;

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public int getTurnover() {
		return turnover;
	}

	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getBoardofdirectors() {
		return boardofdirectors;
	}

	public void setBoardofdirectors(String boardofdirectors) {
		this.boardofdirectors = boardofdirectors;
	}

	public String getListedinstockexchange() {
		return listedinstockexchange;
	}

	public void setListedinstockexchange(String listedinstockexchange) {
		this.listedinstockexchange = listedinstockexchange;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public int getStockcode() {
		return stockcode;
	}

	public void setStockcode(int stockcode) {
		this.stockcode = stockcode;
	}
	  

}
