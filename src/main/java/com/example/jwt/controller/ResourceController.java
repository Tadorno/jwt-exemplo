package com.example.jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.jwt.model.AppUser;
import com.example.jwt.repository.AppUserRepository;

@RestController
@RequestMapping("/api")
public class ResourceController {
	
	@Autowired
	private AppUserRepository userService;

	@RequestMapping(value = "/standard-or-admin", method = RequestMethod.GET)
	@PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
	public List<AppUser> getUser() {
		return userService.findAll();
	}

	@RequestMapping(value = "/admin-only", method = RequestMethod.GET)
	@PreAuthorize("hasAuthority('ADMIN_USER')")
	public List<AppUser> recursoAdmin() {
		return userService.findAll();
	}
}
