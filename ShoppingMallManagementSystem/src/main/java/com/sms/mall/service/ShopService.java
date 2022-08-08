package com.sms.mall.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.mall.model.Shop;
import com.sms.mall.repository.ShopRepository;

@Service
@Transactional
public class ShopService {
	@Autowired
	private ShopRepository repo;

	public List<Shop> listAll() {
		return repo.findAll();
	}

	public Shop save(Shop shop) {
		repo.save(shop);
		return shop;
	}

	public Shop get(Integer id) {
		Shop shop = repo.findById(id).get();
		return shop;
	}

	public Shop delete(Integer id) {
		Shop shop = repo.findById(id).get();
		repo.deleteById(id);
		return shop;
	}
}