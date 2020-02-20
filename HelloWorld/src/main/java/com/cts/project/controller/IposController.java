package com.cts.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.dao.IposRepository;
import com.cts.project.dao.UserRepository;
import com.cts.project.pojos.Ipos;
import com.cts.project.pojos.User;



@RestController
public class IposController 
{
	@Autowired
	private IposRepository iposRepository;
	@RequestMapping("/getAllipos")
	public Iterable<Ipos> getAllipos() {
		return iposRepository.findAll();
	}
	@PostMapping("/saveIpos")
	public Ipos saveIpos(@RequestBody Ipos ipos)
	{
		System.out.println(ipos);
		iposRepository.save(ipos);
		return ipos;	
	}
	@PutMapping("/updateIpos/{id}")
	public Ipos updateIpos(@RequestBody Ipos ipos, @PathVariable("id") int id)
	{
		ipos.setId(id);
		System.out.println(ipos);
		iposRepository.save(ipos);
		return ipos;	
	}
}
