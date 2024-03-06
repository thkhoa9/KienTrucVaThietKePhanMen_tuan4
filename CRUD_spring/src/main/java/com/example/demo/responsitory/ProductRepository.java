package com.example.demo.responsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entity.Dan;


public interface ProductRepository extends JpaRepository<Dan,Integer> {
    public List<Dan> findAll();
}
