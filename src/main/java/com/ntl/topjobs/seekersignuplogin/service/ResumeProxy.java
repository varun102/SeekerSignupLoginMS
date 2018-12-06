package com.ntl.topjobs.seekersignuplogin.service;

import java.util.Map;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;


@FeignClient("zuul-app")
public interface ResumeProxy {
	@PostMapping("/seeker-service/resume")
	public ResponseEntity<String> addResumeDetails(Map<String,String> queryMap );
	
	
	
}
