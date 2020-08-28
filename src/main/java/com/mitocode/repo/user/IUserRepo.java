package com.mitocode.repo.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mitocode.model.user.User;

public interface IUserRepo extends JpaRepository<User, Integer> {

}
