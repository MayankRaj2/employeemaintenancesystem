package com.cg.ems.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.ems.dto.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query("FROM User WHERE userFirstName LIKE ?1")
    List<User> findByFirstName(String userFirstName);
	
}
