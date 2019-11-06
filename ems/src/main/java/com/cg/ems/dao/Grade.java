package com.cg.ems.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component("grade")
@Entity
@Table(name = "user_grade")
public class Grade {

	@Column(name = "grade_code")
	private String gradeCode;
	
	@Column(name = "grade_desc")
	private String Description;
	
	@Column(name = "grade_minsal")
	private Double minSalary;
	
	@Column(name = "grade_maxsal")
	private Double maxSalary;
}
