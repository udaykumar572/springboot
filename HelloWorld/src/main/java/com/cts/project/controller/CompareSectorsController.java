package com.cts.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.dao.CompareSectorsRepository;
import com.cts.project.pojos.CompareSectors;



@RestController
public class CompareSectorsController 
{
	@Autowired
	private CompareSectorsRepository sectorRepository;
	@RequestMapping("/getAllsectors")
	public Iterable<CompareSectors> getAllsectors() {
		return sectorRepository.findAll();
	}
	@PostMapping("/saveCompareSector")
	public CompareSectors saveCompareSectors(@RequestBody CompareSectors sector)
	{
		System.out.println(sector);
		sectorRepository.save(sector);
		return sector;	
	}
	@PutMapping("/updateCompareSector/{id}")
	public CompareSectors updateCompareSectors(@RequestBody CompareSectors sector, @PathVariable("id") int id)
	{
		sector.setId(id);
		System.out.println(sector);
		sectorRepository.save(sector);
		return sector;	
	}
}
