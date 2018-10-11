package com.example.services;

import java.util.List;

import com.example.domain.UserDTO;

public interface UserServices {

	List<UserDTO> findAllUsers();

	String saveData(UserDTO userdata);
}
