package com.SpringBootSecurity.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

	// first approach : where we user withDefaultPasswordEncoder()
	//deprecated means it is not for production uses
	
//	@Bean
//	public InMemoryUserDetailsManager userDetailService() {
//		
//		UserDetails admin = User.withDefaultPasswordEncoder()
//				.username("Sdbravo40")
//				.password("Noor@123")
//				.authorities("admin")
//				.build();
//		
//		UserDetails user = User.withDefaultPasswordEncoder()
//				.username("Sam40")
//				.password("Sam@123")
//				.authorities("read")
//				.build();
//		
//		
//		return new InMemoryUserDetailsManager(admin,user);
//	}
	
	
	
	
	
	
	//Second approach : where we user NoOpPasswordEncoder()
	// it is also not for production use
//	@Bean
//	public InMemoryUserDetailsManager userDetailService() {
//		
//		UserDetails admin = User.withUsername("Sdbravo40").
//				password("Noor@123").
//				authorities("admin").
//				build();
//		UserDetails user = User.withUsername("Sam40")
//				.password("Sam@123")
//				.authorities("read")
//				.build();
//		
//		return new InMemoryUserDetailsManager(admin,user);
//	}

	
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	
	
	
	
	
}
