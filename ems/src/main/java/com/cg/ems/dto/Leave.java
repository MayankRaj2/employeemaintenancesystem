package com.cg.ems.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_leave")
public class Leave {

	@Id
	@Column(name = "leave_id")
	private String leaveId;
	
	@Column(name = "leave_days")
	private String noOfDays;
	
	@Column(name = "leave_reason")
	private String reason;
	
	@Column(name = "leave_status")
	private String leaveStatus;

	public Leave() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Leave(String leaveId, String noOfDays, String reason, String leaveStatus) {
		super();
		this.leaveId = leaveId;
		this.noOfDays = noOfDays;
		this.reason = reason;
		this.leaveStatus = leaveStatus;
	}

	@Override
	public String toString() {
		return "Leave [leaveId=" + leaveId + ", noOfDays=" + noOfDays + ", reason=" + reason + ", leaveStatus="
				+ leaveStatus + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((leaveId == null) ? 0 : leaveId.hashCode());
		result = prime * result + ((leaveStatus == null) ? 0 : leaveStatus.hashCode());
		result = prime * result + ((noOfDays == null) ? 0 : noOfDays.hashCode());
		result = prime * result + ((reason == null) ? 0 : reason.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Leave other = (Leave) obj;
		if (leaveId == null) {
			if (other.leaveId != null)
				return false;
		} else if (!leaveId.equals(other.leaveId))
			return false;
		if (leaveStatus == null) {
			if (other.leaveStatus != null)
				return false;
		} else if (!leaveStatus.equals(other.leaveStatus))
			return false;
		if (noOfDays == null) {
			if (other.noOfDays != null)
				return false;
		} else if (!noOfDays.equals(other.noOfDays))
			return false;
		if (reason == null) {
			if (other.reason != null)
				return false;
		} else if (!reason.equals(other.reason))
			return false;
		return true;
	}

	public String getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(String leaveId) {
		this.leaveId = leaveId;
	}

	public String getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(String noOfDays) {
		this.noOfDays = noOfDays;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getLeaveStatus() {
		return leaveStatus;
	}

	public void setLeaveStatus(String leaveStatus) {
		this.leaveStatus = leaveStatus;
	}
	
	
}
