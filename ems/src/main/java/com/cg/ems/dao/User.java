package com.cg.ems.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;



@EntityListeners(AuditingEntityListener.class)
@Component("user")
@Entity
@Table(name = "user_details")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private String userId;
	
	@Column(name= "userfirstname")
	private String userFirstName;
	
	@Column(name= "userlastname")
	private String userLastName;
	
	@Column(name= "pass")
	private String password;
	
	@Column(name= "usertype")
	private String userType;
	
	@Column(name= "dob")
	private Date dateOfBirth;
	
	@Column(name= "doj")
	private Date dateOfJoining;
	
	@Column(name= "userdepartment")
	private String userDepartment;
	
	@Column(name= "usergrade")
	private String userGrade;
	
	@Column(name= "basicpay")
	private double basicPay;
	
	@Column(name= "gender")
	private String gender;
	
	@Column(name= "maritalstatus")
	private String maritalStatus;
	
	@Column(name= "homeaddress")
	private String homeAddress;
	
	@Column(name= "contactno")
	private String contactNo;
	
	@Column(name= "managerid")
	private String managerId;

}
