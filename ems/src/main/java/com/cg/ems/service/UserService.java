/**
 * 
 */
package com.cg.ems.service;

import java.util.List;

import com.cg.ems.dto.User;

/**
 * @author Mayank
 *
 */
public interface UserService {

	public User addUser(User user);
	
	public List<User> viewAllUsers();
	
	public User viewUser(Integer userId);
	
	public User updateUser(User user);
	
	public List<User> searchByFirstName(String fname);
	
}
