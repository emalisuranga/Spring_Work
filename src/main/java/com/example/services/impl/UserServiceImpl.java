package com.example.services.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.UserDTO;
import com.example.repositories.Repositories;
import com.example.services.UserServices;

@Service
public class UserServiceImpl implements UserServices {

	@Override
	public String saveData(UserDTO userdata) {
		repositories.save(userdata);
		return "Data Save";
	}

	@Autowired
	private Repositories repositories;
	
	@Override
	public List<UserDTO> findAllUsers() {
	
		java.util.List<UserDTO> allUser =repositories.findAll();
		return allUser;
	}

}
