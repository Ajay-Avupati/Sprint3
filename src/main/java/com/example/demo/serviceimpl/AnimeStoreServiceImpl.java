package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Login;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.AnimeStoreRepo;
import com.example.demo.service.AnimeStoreService;

@Service
public  class AnimeStoreServiceImpl implements AnimeStoreService {
    @Autowired
    AnimeStoreRepo animestorerepo;
	@Override
	public Login login(String username, String password) {
		// TODO Auto-generated method stub
		Login lo = animestorerepo.findByUsername(username);
		 if(lo!=null) {
			 if(lo.getUsername().equals(username)) {
				 return lo;
			 }else {
				throw new ResourceNotFoundException();
			}
		 }else {
			 throw new ResourceNotFoundException();
		 }
	}
	/*@Override
	public Login addLogin(Login login) {
		// TODO Auto-generated method stub
		return null;
	}*/
	/*@Override
	public Login updatedb(String username, String password) {
		// TODO Auto-generated method stub
		Login lo1 = animestorerepo.findByUsername(username);
		
		if (lo1 != null) {
			
			lo1.setUsername(lo1.getUsername());
			lo1.setPassword(lo1.getPassword());
			return animestorerepo.save(lo1);
		} else {
			throw new ResourceNotFoundException();
		}
	}*/
	/*@Override
	public void Delete(String username) {
		// TODO Auto-generated method stub
		
	}
	*/
	

}
