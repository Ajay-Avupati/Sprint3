package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Products;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.ProductRepo;
import com.example.demo.service.ProductService;
@Service
public class ProductServiceImpl  implements ProductService{
    @Autowired
    ProductRepo productrepo;
	
	
    @Override
	public Products addProducts(Products products) {
		// TODO Auto-generated method stub
		return productrepo.save(products);
	}

	@Override
	public Products updatedb(String productname,Products products) {
		// TODO Auto-generated method stub
		Products p1 = productrepo.findByProductname(productname);
		
		if( p1 != null ) {
			p1.setProductname(products.getProductname());
			p1.setProductdes(products.getProductdes());
			p1.setProducturl(products.getProducturl());
			
			return productrepo.save(p1);
			
		}else {
			throw new ResourceNotFoundException();
		}
	}

	@Override
	public void Delete(String productname) {
		// TODO Auto-generated method stub
	
		Products p2 = productrepo.findByProductname(productname);
		
		if(p2!= null) {
			productrepo.delete(p2);
			
		}else {
			throw new ResourceNotFoundException();
		}
		
		
		
		
	}
	
	

}
