package com.SpringBootSecurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootSecurity.Entity.UserEntity;
import com.SpringBootSecurity.Repository.UserRepository;



@Service
public class ServiceClass {
	
	@Autowired
	private UserRepository userRepository;
	
	public String savedata(String name, String username, String password) {
		
		System.out.println("-----i'm inside service-----of saveddata-----");
		
		UserEntity userEntity = new UserEntity();
		
		userEntity.setUsername(username);
        userEntity.setName(name);
        userEntity.setPassword(password);
        
        
        userRepository.save(userEntity);
        
		return "saved";
	}

}
