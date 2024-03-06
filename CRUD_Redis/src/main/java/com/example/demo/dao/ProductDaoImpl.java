package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entiry.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private RedisTemplate template;
	private HashOperations hashOperations;
	
	public ProductDaoImpl(RedisTemplate template) {
		
		this.template = template;
		this.hashOperations= template.opsForHash();
	}
	@Override
	public void AddProduct(String key, Product p) {
		// TODO Auto-generated method stub
		hashOperations.put(key,p.getId(),p);
	}

	@Override
	public List<Product> getAll(String value) {
		// TODO Auto-generated method stub
		System.out.println("Find All: " + hashOperations.values(value));
		return hashOperations.values(value);
	}
    
}
