package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.entity.Login;

public interface AnimeStoreRepo extends JpaRepository <Login,Integer>{
	@Query(value =  "select * from Login where username =?" , nativeQuery = true)
	Login findByUsername(String username);

}
