package com.sms.mall.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.mall.model.Employee;
import com.sms.mall.repository.EmployeeRepository;

import antlr.collections.List;

@Service
@Transactional
	public class EmployeeService 
	{
	 @Autowired
	 private EmployeeRepository repo;
	 
	 public java.util.List<Employee> listAll() 
	 {
	 return repo.findAll();
	 }
	 
	 public void save(Employee emp) 
	 {
	 repo.save(emp);
	 }
	 
	 public Employee get(Integer id) 
	 {
	 return repo.findById(id).get();
	 }
	 
	 public void delete(Integer id) 
	 {
	 repo.deleteById(id);
	 }
	}
