package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Login;
import com.example.demo.service.AnimeStoreService;

@RestController
public class AnimeStoreController {
	
	
	@Autowired
	AnimeStoreService animestoreservice;
	
	
	@GetMapping("/login")
	public Login login(@RequestHeader String username, @RequestHeader String password) {
		
		return animestoreservice.login(username,password);
	}
	
	
	/*@PostMapping("/post")
	public Login addLogin(Login login) {
		return animestoreservice.addLogin(login);
	}*/
	
	/*@PutMapping("/update")
	public Login update(@RequestHeader String username,@RequestBody String password) {
		
		return animestoreservice.updatedb(username, password);
		
		
	}*/
	
	/*@DeleteMapping("/delete")
	public String delete(@RequestHeader String  username) {
		animestoreservice.Delete(username);
		
		return "data deleted";
	

}*/
}
