package com.example.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.jwt.model.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Integer>{
	
	@Query("SELECT u FROM #{#entityName} u LEFT JOIN FETCH u.roles WHERE u.username = ?1")
	public AppUser findByUsername(String username);
}
