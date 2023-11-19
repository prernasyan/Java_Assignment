package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.customer.model.AuthResponse;
import com.customer.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	AuthResponse authResponse;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String viewLoginPage(ModelMap map) {
		return "login";
	}
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
    public String authenticateUser(ModelMap model, @RequestParam String loginId, @RequestParam String password){
 
        String token = loginService.authenticateUser(loginId, password);
        
        authResponse.setToken("Bearer " + token);
        
        return "welcome";
    }
	
	@RequestMapping(value="/addCustomer")
	public String addCustomer(ModelMap map) {
		return "AddCustomer";
	}
	
	@RequestMapping(value="/viewAllCustomers")
	public String viewAllCustomers(ModelMap map) {
		return "ViewAllCustomers";
	}
	
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
    public String showLogoutPage(ModelMap model){
        return "login";
    }
 
}
