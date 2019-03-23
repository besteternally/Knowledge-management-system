package com.demo.service;

import java.util.List;

import com.demo.pojo.Users;

public interface UsersService {
	
	void addUser(Users users);
	List<Users> findUserAll();
	Users findUserById(Integer id);
	void updateUser(Users users);
	void deleteUserById(Integer id);
} 
