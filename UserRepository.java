package com.drhg.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.drhg.entity.User;

public interface UserRepository  extends JpaRepository<User, Integer>{
	
	
	
	
}
