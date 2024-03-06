package com.example.demo.dao;

import java.util.List;

import com.example.demo.entiry.Product;

public interface ProductDao {
    public void AddProduct(String key,Product p);
    public List<Product> getAll(String value);
}
