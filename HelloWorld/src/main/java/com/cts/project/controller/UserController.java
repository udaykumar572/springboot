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

import com.cts.project.dao.UserRepository;
import com.cts.project.pojos.User;



@RestController
public class UserController 
{
	@Autowired
	private UserRepository userRepository;
	@RequestMapping("/getAllusers")
	public Iterable<User> getAllusers() {
		return userRepository.findAll();
	}
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user)
	{
		System.out.println(user);
		userRepository.save(user);
		return user;	
	}
	@PutMapping("/updateUser/{username}")
	public User updateUser(@RequestBody User user, @PathVariable("username") String username)
	{
		user.setUsername(username);
		System.out.println(user);
		userRepository.save(user);
		return user;	
	}
	@DeleteMapping("/deleteUser/{username}")

	 public User deleteUser(@RequestBody User user, @PathVariable("username") String username) {



	 System.out.println(user);

	 userRepository.deleteById(username);

	 return user;

	 }



	 @GetMapping("/findOneInAll6/{username}")

	 public User findoneinall(@PathVariable("username") String username) {



	 Optional<User> user = userRepository.findById(username);

	 return user.get();



	 }
}
