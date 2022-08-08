package com.sms.mall.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.mall.model.MallAdmin;
import com.sms.mall.repository.MallAdminRepository;

import antlr.collections.List;

@Service
@Transactional
	public class MallAdminService 
	{
	 @Autowired
	 private MallAdminRepository repo;
	 
	 public java.util.List<MallAdmin> listAll() 
	 {
	 return repo.findAll();
	 }
	 
	 public void save(MallAdmin malladmin) 
	 {
	 repo.save(malladmin);
	 }
	 
	 public MallAdmin get(Integer id) 
	 {
	 return repo.findById(id).get();
	 }
	 
	 public void delete(Integer id) 
	 {
	 repo.deleteById(id);
	 }
	}


