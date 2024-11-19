package com.dev_davi.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.dev_davi.course.entities.User;
import com.dev_davi.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}

}
