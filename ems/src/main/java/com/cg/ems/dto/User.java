package com.cg.ems.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "user_details")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Integer userId;
	
	@Column(name= "userfirstname")
	private String userFirstName;
	
	@Column(name= "userlastname")
	private String userLastName;
	
	@Column(name= "pass")
	private String password;
	
	@Column(name= "usertype")
	private String userType;
	
	@Column(name= "dob")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateOfBirth;
	
	@Column(name= "doj")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateOfJoining;
	
	@OneToOne
	private Department userDepartment;
	
	@OneToOne
	private Grade userGrade;
	
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
	
	@Column(name = "leave_balance")
	private String leaveBalance;
	
	@OneToMany
	List<Leave> leavesList;
	
	@Column(name= "managerid")
	private String managerId;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer userId, String userFirstName, String userLastName, String password, String userType,
			Date dateOfBirth, Date dateOfJoining, Department userDepartment, Grade userGrade, double basicPay,
			String gender, String maritalStatus, String homeAddress, String contactNo, String leaveBalance,
			List<Leave> leavesList, String managerId) {
		super();
		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.password = password;
		this.userType = userType;
		this.dateOfBirth = dateOfBirth;
		this.dateOfJoining = dateOfJoining;
		this.userDepartment = userDepartment;
		this.userGrade = userGrade;
		this.basicPay = basicPay;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.homeAddress = homeAddress;
		this.contactNo = contactNo;
		this.leaveBalance = leaveBalance;
		this.leavesList = leavesList;
		this.managerId = managerId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", password=" + password + ", userType=" + userType + ", dateOfBirth=" + dateOfBirth
				+ ", dateOfJoining=" + dateOfJoining + ", userDepartment=" + userDepartment + ", userGrade=" + userGrade
				+ ", basicPay=" + basicPay + ", gender=" + gender + ", maritalStatus=" + maritalStatus
				+ ", homeAddress=" + homeAddress + ", contactNo=" + contactNo + ", leaveBalance=" + leaveBalance
				+ ", leavesList=" + leavesList + ", managerId=" + managerId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(basicPay);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((contactNo == null) ? 0 : contactNo.hashCode());
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((dateOfJoining == null) ? 0 : dateOfJoining.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((homeAddress == null) ? 0 : homeAddress.hashCode());
		result = prime * result + ((leaveBalance == null) ? 0 : leaveBalance.hashCode());
		result = prime * result + ((leavesList == null) ? 0 : leavesList.hashCode());
		result = prime * result + ((managerId == null) ? 0 : managerId.hashCode());
		result = prime * result + ((maritalStatus == null) ? 0 : maritalStatus.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userDepartment == null) ? 0 : userDepartment.hashCode());
		result = prime * result + ((userFirstName == null) ? 0 : userFirstName.hashCode());
		result = prime * result + ((userGrade == null) ? 0 : userGrade.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userLastName == null) ? 0 : userLastName.hashCode());
		result = prime * result + ((userType == null) ? 0 : userType.hashCode());
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
		User other = (User) obj;
		if (Double.doubleToLongBits(basicPay) != Double.doubleToLongBits(other.basicPay))
			return false;
		if (contactNo == null) {
			if (other.contactNo != null)
				return false;
		} else if (!contactNo.equals(other.contactNo))
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (dateOfJoining == null) {
			if (other.dateOfJoining != null)
				return false;
		} else if (!dateOfJoining.equals(other.dateOfJoining))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (homeAddress == null) {
			if (other.homeAddress != null)
				return false;
		} else if (!homeAddress.equals(other.homeAddress))
			return false;
		if (leaveBalance == null) {
			if (other.leaveBalance != null)
				return false;
		} else if (!leaveBalance.equals(other.leaveBalance))
			return false;
		if (leavesList == null) {
			if (other.leavesList != null)
				return false;
		} else if (!leavesList.equals(other.leavesList))
			return false;
		if (managerId == null) {
			if (other.managerId != null)
				return false;
		} else if (!managerId.equals(other.managerId))
			return false;
		if (maritalStatus == null) {
			if (other.maritalStatus != null)
				return false;
		} else if (!maritalStatus.equals(other.maritalStatus))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userDepartment == null) {
			if (other.userDepartment != null)
				return false;
		} else if (!userDepartment.equals(other.userDepartment))
			return false;
		if (userFirstName == null) {
			if (other.userFirstName != null)
				return false;
		} else if (!userFirstName.equals(other.userFirstName))
			return false;
		if (userGrade == null) {
			if (other.userGrade != null)
				return false;
		} else if (!userGrade.equals(other.userGrade))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userLastName == null) {
			if (other.userLastName != null)
				return false;
		} else if (!userLastName.equals(other.userLastName))
			return false;
		if (userType == null) {
			if (other.userType != null)
				return false;
		} else if (!userType.equals(other.userType))
			return false;
		return true;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Department getUserDepartment() {
		return userDepartment;
	}

	public void setUserDepartment(Department userDepartment) {
		this.userDepartment = userDepartment;
	}

	public Grade getUserGrade() {
		return userGrade;
	}

	public void setUserGrade(Grade userGrade) {
		this.userGrade = userGrade;
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getLeaveBalance() {
		return leaveBalance;
	}

	public void setLeaveBalance(String leaveBalance) {
		this.leaveBalance = leaveBalance;
	}

	public List<Leave> getLeavesList() {
		return leavesList;
	}

	public void setLeavesList(List<Leave> leavesList) {
		this.leavesList = leavesList;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

}
