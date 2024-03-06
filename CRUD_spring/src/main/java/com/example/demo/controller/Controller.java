package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Dan;
import com.example.demo.responsitory.ProductRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class Controller {
@Autowired
private ProductRepository productRepository;
@GetMapping("getAllProduct")
public String Product() throws JsonProcessingException{
	List<Dan> D = productRepository.findAll();
	ObjectMapper mapper = new ObjectMapper();
	return mapper.writeValueAsString(D);
}
}
