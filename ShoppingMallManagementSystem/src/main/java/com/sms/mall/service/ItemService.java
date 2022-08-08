package com.sms.mall.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.mall.model.Item;
import com.sms.mall.repository.ItemRepository;

import antlr.collections.List;

@Service
@Transactional
	public class ItemService 
	{
	 @Autowired
	 private ItemRepository repo;
	 
	 public java.util.List<Item> listAll() 
	 {
	 return repo.findAll();
	 }
	 
	 public void save(Item item) 
	 {
	 repo.save(item);
	 }
	 
	 public Item get(Long id) 
	 {
	 return repo.findById(id).get();
	 }
	 
	 public void delete(Long id) 
	 {
	 repo.deleteById(id);
	 }
	}
