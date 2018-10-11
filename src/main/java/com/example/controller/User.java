package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.UserDTO;
import com.example.services.UserServices;
//import com.example.services.impl.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class User {

	@Autowired
	private UserServices userService;
	
	@GetMapping("/all")
	public List<UserDTO> allUser() {
		return userService.findAllUsers();
	}
	
	@PostMapping("/add")
	public String addUser(@RequestBody UserDTO Userdata) {
		return userService.saveData(Userdata);
		
		
	}
}
