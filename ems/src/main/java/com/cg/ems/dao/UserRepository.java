package com.cg.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.ems.dto.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
