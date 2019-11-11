/**
 * 
 */
package com.cg.ems.service;

import java.util.List;

import com.cg.ems.dto.User;
import com.cg.ems.exception.EmployeeNotFoundException;

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
	
	public List<User> searchByLastName(String lname);
	
	public List<User> searchByuserId(Integer userId);
	
	public List<User> searchByDepartment(String department);
	
	public List<User> searchByGrade(String grade);
	
	public List<User> searchByMaritalStatus(String mstatus);
	
	public User loginUser(Integer userId, String password) throws EmployeeNotFoundException;
	
}
