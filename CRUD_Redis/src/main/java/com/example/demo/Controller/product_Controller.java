package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ProductDao;
import com.example.demo.entiry.Product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class product_Controller {
    @Autowired
    private ProductDao productDao;
    
    @GetMapping("/add")
    public void addProduct(@RequestBody Product p, @RequestParam("key") String key) {
        System.out.println("add"+key);
       
    	productDao.AddProduct(key, p);
        
    }
    @GetMapping("/findAll")
    public List<Product> getAllProduct(@RequestParam("key")String key){
    	System.out.println("find"+key);
    	return productDao.getAll(key);
    }
    
} 
