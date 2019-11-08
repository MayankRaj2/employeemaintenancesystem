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

}
