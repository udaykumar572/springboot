package com.cts.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.dao.AdminRepository;
import com.cts.project.dao.UserRepository;
import com.cts.project.pojos.Admin;
import com.cts.project.pojos.User;



@RestController
public class AdminController 
{
	@Autowired
	private AdminRepository adminRepository;
	@RequestMapping("/getAlladmins")
	public Iterable<Admin> getAllusers() {
		return adminRepository.findAll();
	}
	@PostMapping("/saveAdmin")
	public Admin saveUser(@RequestBody Admin admin)
	{
		System.out.println(admin);
		adminRepository.save(admin);
		return admin;	      
	}
	@PutMapping("/updateAdmin/{adminname}")
	public Admin updateUser(@RequestBody Admin admin, @PathVariable("adminname") String adminname)
	{
		admin.setAdminname(adminname);
		System.out.println(admin);
		adminRepository.save(admin);
		return admin;	
	}
}
