package com.SpringBootSecurity.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SpringBootSecurity.Entity.UserEntity;
import com.SpringBootSecurity.Repository.UserRepository;
import com.SpringBootSecurity.Service.ServiceClass;

@Controller
public class LoginController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ServiceClass userService;
      
	@GetMapping("/")
	public String userLogin() {
		
//		UserEntity userEntity = new UserEntity();
//		
//		userEntity.setName("Testing");
//		userEntity.setPassword("Test@123");
//		userEntity.setUsername("Test40");
//		
//		userRepository.save(userEntity);
	
		
		return "loginPage";
	}
	
	@GetMapping("/signup")
	public String signupPage() {
		System.out.println("---------inside register controller-----------");
		return "register";
	}
	
	@RequestMapping("/registerUrl")
	public ResponseEntity<Object>  registeration(@RequestParam String name, @RequestParam String username, 
			 @RequestParam String password) {
		
		try {
			System.out.println("---------name---------: "+name);
			System.out.println("---------username-----: "+username);
			System.out.println("---------password-----: "+password);
			
			userService.savedata(name, username, password);
		}
		catch(Exception ex) {
			ex.printStackTrace();
			 return new ResponseEntity<Object>(new Error("Cannot be saved!! for : " + username + "!"),HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<Object>(null, HttpStatus.OK);
	}
	
	
}
