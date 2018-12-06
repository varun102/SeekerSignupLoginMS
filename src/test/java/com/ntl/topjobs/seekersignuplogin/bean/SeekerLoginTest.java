package com.ntl.topjobs.seekersignuplogin.bean;

import static org.junit.Assert.*;

import org.junit.Test;

public class SeekerLoginTest {

	SeekerLogin seeker;

	
	
	@Test
	public void testGetEmpId() {
	seeker=new SeekerLogin();
	seeker.setusername("grawat465");
	assertEquals(seeker.getusername(),"grawat465");
	}
	
	
	
	@Test
	public void testGetEmailId() {
		seeker=new SeekerLogin();
		seeker.setEmailId("grawat465@gmail.com");
		assertEquals(seeker.getEmailId(),"grawat465@gmail.com");

	}
	@Test
	public void testGetPassword() {
		seeker=new SeekerLogin();
		seeker.setPassword("Captain123!");
		assertEquals(seeker.getPassword(),"Captain123!");

	}


}
