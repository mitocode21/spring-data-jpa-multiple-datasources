package com.mitocode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.admin.Admin;
import com.mitocode.model.user.User;
import com.mitocode.service.AdminService;
import com.mitocode.service.UserService;

@RestController
@RequestMapping("/databases")
public class TestController {

	@Autowired
	private AdminService adminService; 
	
	@Autowired
	private UserService userService; 
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/admin")
	public void registrarAdmin(@RequestBody Admin admin) {
		adminService.registrar(admin);
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/user")
	public void registrarUser(@RequestBody User usuario) {
		userService.registrar(usuario);
	}
}
