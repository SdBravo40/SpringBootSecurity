package com.SpringBootSecurity.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.SpringBootSecurity.Entity.UserEntity;
import com.SpringBootSecurity.Repository.UserRepository;

@Service
public class UserService  implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		
		String userName,Password=null;
		List<GrantedAuthority> authorities = null;
		List<UserEntity> userEntity = userRepository.findByUsername(username);
		
		if(userEntity.size()==0) {
			throw new UsernameNotFoundException("user details not found for " + username);
		}
		else {
			userName = userEntity.get(0).getUsername();
			Password = userEntity.get(0).getPassword();
			authorities = new ArrayList<>();
			authorities.add(new SimpleGrantedAuthority("admin"));
		}
		
		return new User(userName,Password,authorities);
	}
}
