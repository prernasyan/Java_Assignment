package com.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.customer.model.AuthRequest;
import com.customer.model.AuthResponse;

@Service
public class LoginService {
	
	 @Autowired
	    private RestTemplate restTemplate;

	    @Value("${auth.api.url}")
	    private String authApiUrl;

	    public String authenticateUser(String loginId, String password) {
	        String authUrl = authApiUrl;

	        HttpHeaders headers = new HttpHeaders();
	        headers.set("Content-Type", "application/json");

	        String requestBody = String.format("{\"login_id\":\"%s\",\"password\":\"%s\"}", loginId, password);

	        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);

	        ResponseEntity<String> responseEntity = restTemplate.exchange(authUrl, HttpMethod.POST, requestEntity, String.class);

	        if (responseEntity.getStatusCode().is2xxSuccessful()) {
	            return responseEntity.getBody();
	        } else {
	            throw new RuntimeException("Authentication failed");
	        }
	    }
 
 
}