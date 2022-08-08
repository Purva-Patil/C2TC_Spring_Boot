package com.sms.mall.service;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.mall.model.User;
import com.sms.mall.repository.UserRepository;

import antlr.collections.List;

@Service
@Transactional
	public class UserService 
	{
	 @Autowired
	 private UserRepository repo;
	 
	 public java.util.List<User> listAll() 
	 {
	 return repo.findAll();
	 }
	 
	 public void save(User user) 
	 {
	 repo.save(user);
	 }
	 
	 public User get(Integer id) 
	 {
	 return repo.findById(id).get();
	 }
	 
	 public void delete(Integer id) 
	 {
	 repo.deleteById(id);
	 }
	}


