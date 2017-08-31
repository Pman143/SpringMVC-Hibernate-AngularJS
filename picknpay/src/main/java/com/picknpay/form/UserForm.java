package com.picknpay.form;


public class UserForm {
	
        private int userID;
	private String firstName;

	private String lastName;
	
	private String emailAddress;
        private String password;

	
	

	
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
        @Override
	public String toString() {
		return "User [userID=" + userID + ", firstName=" + firstName + 
                            ", emailAddress=" + emailAddress +", lastName=" + lastName + "]";
	}
	

}
