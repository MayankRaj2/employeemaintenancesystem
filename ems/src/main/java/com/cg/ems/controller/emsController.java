package com.cg.ems.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.cg.ems.dto.User;
import com.cg.ems.exception.EmployeeNotFoundException;
import com.cg.ems.service.DepartmentService;
import com.cg.ems.service.GradeService;
import com.cg.ems.service.UserService;

@RestController
@RequestMapping(value = "/ems")
@CrossOrigin(origins = "http://localhost:4201")
public class emsController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	GradeService gradeService;
	
	@Autowired
	DepartmentService departmentService;
	
	//Logger object for logging various activities
		private static final Logger logger = LoggerFactory.getLogger(emsController.class);
	
	
	@PostMapping(value="/adduser")
	public ResponseEntity<User> addData(@ModelAttribute User user, @RequestParam String dept, @RequestParam String grade) {
		user.setUserGrade(gradeService.findGrade(grade));
		user.setUserDepartment(departmentService.findDepartment(dept));
		user = userService.addUser(user);
		if (user == null) {
			return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
		} else {
			return new ResponseEntity<User>(user, HttpStatus.OK);
		}
	}
	
	@GetMapping(value = "/showusers")

	public ResponseEntity<List<User>> showAllUsers() {
		List<User> userList = userService.viewAllUsers();
		if (userList.isEmpty()) {
			return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
		} else {
			return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
		}
	}


	@GetMapping("/findByFirstName")
	public ResponseEntity<List<User>> findByFirstName(@RequestParam String fname){
		return new ResponseEntity<List<User>>(userService.searchByFirstName(fname), HttpStatus.OK);
	}
	

	@GetMapping("/findByLastName")
	public ResponseEntity<List<User>> findByLastName(@RequestParam String lname){
		return new ResponseEntity<List<User>>(userService.searchByLastName(lname), HttpStatus.OK);
	}
	
	@GetMapping("/findById")
	public ResponseEntity<List<User>> findById(@RequestParam Integer id){
		return new ResponseEntity<List<User>>(userService.searchByuserId(id), HttpStatus.OK);
	}
	
	@GetMapping("/findByDepartment")
	public ResponseEntity<List<User>> findByDepartment(@RequestParam String department){
		return new ResponseEntity<List<User>>(userService.searchByDepartment(department), HttpStatus.OK);
	}
	
	
	@GetMapping("/findByGrade")
	public ResponseEntity<List<User>> findByGrade(@RequestParam String grade){
		return new ResponseEntity<List<User>>(userService.searchByGrade(grade), HttpStatus.OK);
	}
	
	
	@GetMapping("/findByMaritalStatus")
	public ResponseEntity<List<User>> findByMaritalStatus(@RequestParam String mstatus){
		return new ResponseEntity<List<User>>(userService.searchByMaritalStatus(mstatus), HttpStatus.OK);
	}
	
	/**
	 * Function to check login credentials and allow access to other functions.
	 * @param empId
	 * @param password
	 * @return
	 */
	@GetMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public User loginUser(@RequestParam Integer userId, @RequestParam String password)   {
		logger.info("Trying for Login");
		try {
			logger.info("Successful Employee login");
			return userService.loginUser(userId, password);
		} catch (EmployeeNotFoundException ex) {
			logger.error("Employees login not successful ");
			System.out.println(ex.getMessage());
			return null;
		}
	}
	
	
}
