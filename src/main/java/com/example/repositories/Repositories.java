package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.UserDTO;

public interface Repositories extends JpaRepository<UserDTO, Integer>{

}
 