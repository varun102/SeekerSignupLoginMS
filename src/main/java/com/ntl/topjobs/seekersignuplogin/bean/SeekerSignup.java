/**
 * 
 */
package com.ntl.topjobs.seekersignuplogin.bean;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.ntl.topjobs.seekersignuplogin.service.ServiceClass;

/**
 * @author Training
 *
 */
@Entity
public class SeekerSignup {
	
	
	private String firstName;
	private String lastName;
	private String password;
	private String emailId;
	private LocalDate  dob;
	@Transient
	private String address;
    private long mobileno;
    @Column(name="gender")
	private String Gender;
	private String bio;
	@Column(name="city")
	private String City;
	private String zipcode;
	private String country;
	private String states;
	
	@Id
	private String username;
	private String resumeid;
	/**
	 * 
	 */
	
	
	
	
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



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	public LocalDate getDob() {
		return dob;
	}



	public void setDob(LocalDate dob) {
		this.dob = dob;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public long getMobileno() {
		return mobileno;
	}



	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}



	public String getGender() {
		return Gender;
	}



	public void setGender(String gender) {
		Gender = gender;
	}



	public String getBio() {
		return bio;
	}



	public void setBio(String bio) {
		this.bio = bio;
	}



	public String getCity() {
		return City;
	}



	public void setCity(String city) {
		City = city;
	}



	public String getZipcode() {
		return zipcode;
	}



	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getStates() {
		return states;
	}



	public void setStates(String states) {
		this.states = states;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getResumeid() {
		return resumeid;
	}



	public void setResumeid(String resumeid) {
		this.resumeid = resumeid;
	}



	
	

	
	public SeekerSignup() {
		super();
		
	}
		 
	
		
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SeekerSignup " + " firstName=" + firstName + ", lastName=" + lastName
				+ ", password=" + password + ", emailId=" + emailId + ", dob=" + dob + ", address=" + address
				+ ", mobileno=" + mobileno + ", Gender=" + Gender + ", bio=" + bio + ", City=" + City + ", zipcode="
				+ zipcode + ", country=" + country + ", states=" + states + ", username=" + username + ", resumeid="
				+ resumeid + "]";
	}
	
	
	
}