package com.cts.project.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="sectors")


public class CompareSectors {
	
	
	
	@Override
	public String toString() {
		return "CompareSectors [id=" + id + ", sectorname=" + sectorname + ", brief=" + brief + "]";
	}
	@Id 
	private int id;
	private String sectorname;
	private String brief;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSectorname() {
		return sectorname;
	}
	public void setSectorname(String sectorname) {
		this.sectorname = sectorname;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	

}
