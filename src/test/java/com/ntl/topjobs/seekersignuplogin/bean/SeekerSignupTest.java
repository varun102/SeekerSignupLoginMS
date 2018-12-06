package com.ntl.topjobs.seekersignuplogin.bean;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class SeekerSignupTest {
	
	
	SeekerSignup seeker;
	
	
	@Test
	public void testGetFirstName() {
	seeker=new SeekerSignup();
	seeker.setFirstName("Govind");
	assertEquals(seeker.getFirstName(),"Govind");
	}
	
	
	@Test
	public void testGetlastName() {
		seeker=new SeekerSignup();
		seeker.setLastName("Rawat");
		assertEquals(seeker.getLastName(),"Rawat");
	}
	
	@Test
	public void testGetPassword() {
		seeker=new SeekerSignup();
		seeker.setPassword("Captain123!");
		assertEquals(seeker.getPassword(),"Captain123!");
	}

	
	@Test
	public void testGetEmailId() {
		seeker=new SeekerSignup();
		seeker.setEmailId("grawat465@gmail.com");
		assertEquals(seeker.getEmailId(),"grawat465@gmail.com");
	}

	
	@Test
	public void testGetMobileNo() {
		seeker=new SeekerSignup();
		seeker.setMobileno(1234567890);
		assertEquals(seeker.getMobileno(),1234567890);
	}

	@Test
	public void testGender() {
		seeker=new SeekerSignup();
		seeker.setGender("male");
		
		assertEquals(seeker.getGender(),"male");
	}

	
	@Test
	public void testZipcode() {
		seeker=new SeekerSignup();
		seeker.setZipcode("123456");
		
		assertEquals(seeker.getZipcode(),"123456");
	}
	
	
	@Test
	public void testStates() {
		seeker=new SeekerSignup();
		seeker.setStates("Haryana");
		
		assertEquals(seeker.getStates(),"Haryana");
	}
	
	
	@Test
	public void testCountry() {
		seeker=new SeekerSignup();
		seeker.setCountry("India");
		
		assertEquals(seeker.getCountry(),"India");
	}
	
	@Test
	public void testBio() {
		seeker=new SeekerSignup();
		seeker.setBio("Asfg");
		
		assertEquals(seeker.getBio(),"Asfg");
	}
	
	
	@Test
	public void testDob() {
		seeker=new SeekerSignup();
		seeker.setDob(LocalDate.of(1997, 12, 11));
		
		assertEquals(seeker.getDob(),LocalDate.of(1997,12,11));
		
	}
	
	
}
