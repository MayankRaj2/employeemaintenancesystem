package com.cg.ems.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component("leave")
@Entity
@Table(name = "user_leave")
public class Leave {

	@Column(name = "leave_id")
	private String leaveId;
	
	@Column(name = "leave_days")
	private String noOfDays;
	
	@Column(name = "leave_reason")
	private String reason;
	
	@Column(name = "leave_status")
	private String leaveStatus;
	
	@Column(name = "leave_balance")
	private String leaveBalance;
	
}
