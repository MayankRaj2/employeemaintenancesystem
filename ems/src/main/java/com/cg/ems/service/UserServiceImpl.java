/**
 * 
 */
package com.cg.ems.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ems.dao.UserRepository;
import com.cg.ems.dto.User;
import com.cg.ems.exception.EmployeeNotFoundException;

/**
 * @author Mayank
 *
 */

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> viewAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User viewUser(Integer userId) {
		return userRepository.findById(userId).get();
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> searchByFirstName(String fname) {
		return userRepository.findByFirstName(fname);
	}

	@Override
	public List<User> searchByLastName(String lname) {
		// TODO Auto-generated method stub
		return userRepository.findByLastName(lname);
	}

	@Override
	public List<User> searchByuserId(Integer userId) {
		// TODO Auto-generated method stub
		return userRepository.findByUserId(userId);
	}

	@Override
	public List<User> searchByDepartment(String department) {
		// TODO Auto-generated method stub
		return userRepository.findByDepartment(department);
	}

	@Override
	public List<User> searchByGrade(String grade) {
		// TODO Auto-generated method stub
		return userRepository.findByGrade(grade);
	}

	@Override
	public List<User> searchByMaritalStatus(String mstatus) {
		// TODO Auto-generated method stub
		return userRepository.findByMaritalStatus(mstatus);
	}
	
	
	/**
	 * Function to authenticate user credentials - userId and password.
	 * Delegates call to UserRepo where User having the input userId and password gets fetched.
	 * If not found, EmployeeNotFoundException is thrown.
	 * @param userId
	 * @param password
	 * @return
	 * @throws EmployeeNotFoundException
	 */
	@Override
	public User loginUser(Integer userId, String password) throws EmployeeNotFoundException {
		//logger.info("In loginEmployee method of service");
		User user = userRepository.loginUser(userId, password);
		 if(user == null) {
			 //logger.error("Object not retrieved from repo. Login denied.");
			 throw new EmployeeNotFoundException("Employee not present. Login denied."); 
		 }
		 else {
			// logger.info("Object retrieved from repo. Login allowed.");
			 return user;
		 }
		 
	}

}
