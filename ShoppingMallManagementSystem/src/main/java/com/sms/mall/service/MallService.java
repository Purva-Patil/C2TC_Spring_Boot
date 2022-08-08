package com.sms.mall.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.mall.model.Mall;
import com.sms.mall.repository.MallRepository;

import antlr.collections.List;

@Service
@Transactional
	public class MallService 
	{
	 @Autowired
	 private MallRepository repo;
	 
	 public java.util.List<Mall> listAll() 
	 {
	 return repo.findAll();
	 }
	 
	 public void save(Mall mall) 
	 {
	 repo.save(mall);
	 }
	 
	 public Mall get(Long id) 
	 {
	 return repo.findById(id).get();
	 }
	 
	 public void delete(Long id) 
	 {
	 repo.deleteById(id);
	 }
	}



