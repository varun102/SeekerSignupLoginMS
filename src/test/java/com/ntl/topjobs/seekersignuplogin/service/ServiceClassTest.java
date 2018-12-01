package com.ntl.topjobs.seekersignuplogin.service;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;
import org.mockito.quality.Strictness;

import static org.mockito.Mockito.when;

import com.ntl.topjobs.seekersignuplogin.bean.SeekerLogin;
import com.ntl.topjobs.seekersignuplogin.bean.SeekerSignup;
import com.ntl.topjobs.seekersignuplogin.dao.LoginDao;
import com.ntl.topjobs.seekersignuplogin.dao.SignUpDao;
import com.ntl.topjobs.seekersignuplogin.service.ServiceClass;


@RunWith(MockitoJUnitRunner.class)
public class ServiceClassTest {
	public MockitoRule rule = MockitoJUnit.rule().strictness(Strictness.STRICT_STUBS);

	@Mock
	LoginDao logindb;
	@Mock
	SignUpDao signdb;
	
	SeekerSignup seeker=new SeekerSignup();
	SeekerLogin seek=new SeekerLogin();
	
	@Test
	public void testGenerateEmpId() {
		ServiceClass service=new ServiceClass();
		assertNotNull(service.generateEmpId("Varun"));
		//fail("Not yet implemented");
	}

	@Test
	public void testAddEmployee() {
		seeker.setAddress("asd");
		seeker.setBio("ASd");
		seeker.setCity("Hyd");
		seeker.setCountry("Inf");
		seeker.setDob(LocalDate.of(1997, 12, 12));
		seeker.setFirstName("Varun");
		Mockito.lenient().when(logindb.save(seek)).thenReturn(seek);
		Mockito.lenient().when(signdb.save(seeker)).thenReturn(seeker);
		ServiceClass sc=new ServiceClass(signdb,logindb);
		assertEquals(seeker, sc.addEmployee(seeker));
		
		//fail("Not yet implemented");
	}

	@Test
	public void testGetUser() {
		seeker.setAddress("asd");
		seeker.setBio("ASd");
		seeker.setCity("Hyd");
		seeker.setCountry("Inf");
		seeker.setDob(LocalDate.of(1997, 12, 12));
		seeker.setFirstName("Varun");
		seeker.setUsername("VK123");
		
		Mockito.lenient().when(logindb.findById("VK123")).thenReturn(null);
		ServiceClass sc=new ServiceClass(signdb,logindb);
		assertEquals(false,sc.getUser("Varun", "Kashyap"));
		
	}

}
