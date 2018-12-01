/**
 * 
 */
package com.ntl.topjobs.seekersignuplogin.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ntl.topjobs.seekersignuplogin.bean.SeekerLogin;
import com.ntl.topjobs.seekersignuplogin.bean.SeekerSignup;
import com.ntl.topjobs.seekersignuplogin.dao.SignUpDao;
import com.ntl.topjobs.seekersignuplogin.dao.LoginDao;
//import com.ntl.topjobs.jobseekermicroservice/src/main/java/com/ntl/topjobs/jobseekermicroservice/model/

/**
 * @author Training
 *
 */
@Service
public class ServiceClass {

	@Autowired
	SignUpDao dao;
	@Autowired
	LoginDao loginDao;
	@Autowired
	ResumeProxy proxy;

	SeekerLogin loginBean;

	public ServiceClass() {
		super();
		loginBean = new SeekerLogin();
	}

	public ServiceClass(SignUpDao d, LoginDao logindb) {
		super();
		loginBean = new SeekerLogin();
		dao = d;
		loginDao = logindb;
	}

	public String generateEmpId(String firstName) {
		int x = (int) (Math.random() * ((9999 - 1000) + 1)) + 1000;
		String str = Integer.toString(x);
		char a[] = { firstName.charAt(0), firstName.charAt(1), str.charAt(0), str.charAt(1), str.charAt(2),
				str.charAt(3) };
		return (new String(a));
	}

	public SeekerSignup addEmployee(SeekerSignup signupBean) {
		loginBean.setEmailId(signupBean.getEmailId());
		loginBean.setusername(signupBean.getUsername());
		loginBean.setPassword(signupBean.getPassword());

		String userid = generateEmpId(signupBean.getUsername());
		// signupBean.setResumeid(userid);

		loginDao.save(loginBean);
		Map<String, String> resume = new HashMap<>();
		resume.put("name", signupBean.getFirstName());
		resume.put("email", signupBean.getEmailId());
		resume.put("contact", Long.toString(signupBean.getMobileno()));
		resume.put("gender", signupBean.getGender());
		resume.put("dob", signupBean.getDob().toString());
		resume.put("seekerId", signupBean.getUsername());
		// Resume obj;
		// ResponseEntity<Object> responseEntity=new
		// RestTemplate().getForEntity("http://localhost:8765/seeker-service/resume",Object.class,resume);
		// Object response=responseEntity.getBody();
		
		proxy.addResumeDetails(resume);
		
		// System.out.println(response.toString());
		return dao.save(signupBean);
	}

	public boolean getUser(String username, String password) {
		try {
			SeekerLogin tempLogin = loginDao.findById(username).get();
			if (tempLogin.getPassword().equals(password)) {

				return true;
			} else
				return false;
		} catch (Exception e) {
			System.out.println("fail");
			return false;
		}

	}
	
	public String getSeekerBody(String id) {
		try {
			SeekerSignup seek= dao.findById(id).get();
			return seek.getResumeid();
		}
		catch(Exception e) {
			return "";
		}
	}

}
