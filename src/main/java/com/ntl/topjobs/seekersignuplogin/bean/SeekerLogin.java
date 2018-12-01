/**
 * 
 */
package com.ntl.topjobs.seekersignuplogin.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Training
 *
 */
@Entity
public class SeekerLogin {
@Id
private String username;
private String emailId;
private String password;
public SeekerLogin() {
	super();
	
}
/**
 * @return the userId
 */
public String getusername() {
	return username;
}
/**
 * @param userId the userId to set
 */
public void setusername(String username) {
	this.username = username;
}
/**
 * @return the emailId
 */
public String getEmailId() {
	return emailId;
}
/**
 * @param emailId the emailId to set
 */
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
/**
 * @return the password
 */
public String getPassword() {
	return password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}


}
