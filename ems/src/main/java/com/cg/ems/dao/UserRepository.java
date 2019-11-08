package com.cg.ems.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.ems.dto.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	//@Query("FROM User WHERE userFirstName LIKE '%e%'")
	@Query("FROM User WHERE userFirstName = ?1")
	 List<User> findByFirstName(String userFirstName);
	
	@Query("FROM User WHERE userLastName = ?1")
	 List<User> findByLastName(String userLastName);
	
	@Query("FROM User WHERE userId = ?1")
	 List<User> findByUserId(Integer userId);
	
	@Query("FROM User WHERE userDepartment.deptId = ?1")
	 List<User> findByDepartment(String userDepartment);
	
	@Query("FROM User WHERE userGrade.gradeCode = ?1")
	 List<User> findByGrade(String userGrade);
	
	@Query("FROM User WHERE maritalStatus = ?1")
	 List<User> findByMaritalStatus(String maritalStatus);
	
}
