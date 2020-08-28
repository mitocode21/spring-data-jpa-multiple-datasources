package com.mitocode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.user.User;
import com.mitocode.repo.user.IUserRepo;

@Service
public class UserService{

	@Autowired
	private IUserRepo repo;

	public void registrar(User t) {
		repo.save(t);
	}
}
