package com.example.demo.service;


import com.example.demo.entity.Products;

public interface ProductService {
	
	
	Products addProducts(Products products);
	Products updatedb(String productname,Products products);
	void Delete(String productname);

}
