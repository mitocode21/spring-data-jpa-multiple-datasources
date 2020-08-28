package com.mitocode.repo.admin;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mitocode.model.admin.Admin;

public interface IAdminRepo extends JpaRepository<Admin, Integer>{

}
