package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Products;
import com.example.demo.service.ProductService;
@RestController
public class ProductController {
	
	@Autowired
	ProductService productservice;
	
	
	
	
	@PostMapping("/post")
	public Products addProducts( @RequestBody Products products) {
		return productservice.addProducts(products);
	}
	
	@PutMapping("/update")
	public Products update(@RequestHeader String productname,@RequestBody Products products) {
		
		return productservice.updatedb(productname, products);
		
		
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestHeader String  productname) {
        productservice.Delete(productname);
		
		return "data deleted";
	

}

}
