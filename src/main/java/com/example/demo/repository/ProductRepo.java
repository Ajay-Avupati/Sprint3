package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Products;
@Repository
public interface ProductRepo extends JpaRepository<Products,String>{
	
	@Query(value =  "select * from Products where productname =?" , nativeQuery = true)
	Products findByProductname(String productname);

	
	

}
