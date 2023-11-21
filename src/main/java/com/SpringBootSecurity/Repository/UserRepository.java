package com.SpringBootSecurity.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootSecurity.Entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

	List<UserEntity> findByUsername(String username);
}
