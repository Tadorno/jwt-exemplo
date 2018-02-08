package com.example.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jwt.model.AppRole;

public interface AppRoleRepository extends JpaRepository<AppRole, Integer>{
}
