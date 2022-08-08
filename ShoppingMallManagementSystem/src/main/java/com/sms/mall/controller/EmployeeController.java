package com.sms.mall.controller;

import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sms.mall.model.Employee;
import com.sms.mall.service.EmployeeService;

import antlr.collections.List;


@RestController
public class EmployeeController 
{
 @Autowired
private EmployeeService service;
private Employee emp;
 
 // RESTful API methods for Retrieval operations
 @GetMapping("/emp")
 
 public java.util.List<Employee> list() 
 {
 return service.listAll();
 }
 @GetMapping("/Employee/{id}")
 public ResponseEntity<Employee> get(@PathVariable Integer id) 
 {
 try
 {
 Employee emp = service.get(id);
 return new ResponseEntity<Employee>(emp, HttpStatus.OK);
 } 
 catch (NoSuchElementException e) 
 {
 return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
 } 
 }
 // RESTful API method for Create operation
 @PostMapping("/emp")
 public void add(@RequestBody Employee emp) 
 {
	 service.save(emp);
 }
 
 // RESTful API method for Update operation
 @PutMapping("/emp/{id}")
 public ResponseEntity<?> update(@RequestBody Employee emp, @PathVariable Integer id) 
 {
 try
 {
 Employee  existEmployee = service.get(id);
 service.save(emp);
 return new ResponseEntity<>(HttpStatus.OK);
 } 
 catch (NoSuchElementException e) 
 {
 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
 } 
 }
 // RESTful API method for Delete operation
 @DeleteMapping("/emp/{id}")
 public void delete(@PathVariable Integer id) 
 {
 service.delete(id);
 }
}