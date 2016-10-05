package com.evoke.researchlabs.row.employee.model;

/**
 * 
 * 
 * Employee pojo class
 * @author P A VISHAL
 * @version 1.0
 * 
 */
public class Employee {

	private String userName;
	private String emailId;

	public Employee() {
	}

	public Employee(String userName, String emailId) {
		super();
		this.userName = userName;
		this.emailId = emailId;
	}

	public String getuserName() {
		return userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Employee [userName=" + userName + ", emailId=" + emailId + "]";
	}

}
