package com.mitocode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.admin.Admin;
import com.mitocode.repo.admin.IAdminRepo;

@Service
public class AdminService{

	@Autowired
	private IAdminRepo repo;
	
	public void registrar(Admin t) {
		repo.save(t);
	}
}
