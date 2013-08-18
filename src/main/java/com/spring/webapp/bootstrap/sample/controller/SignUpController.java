package com.spring.webapp.bootstrap.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignUpController {

	private static final Logger log = LoggerFactory.getLogger(SignUpController.class);

	@RequestMapping(value="/web/signup.do", method=RequestMethod.GET)
	public String singup(@RequestParam("username") String username,
							@RequestParam("password") String password,
							@RequestParam("confirmPassword") String confirmPassword,
							@RequestParam("email") String email) {
		log.info("username: " + username +", password: " + password + ", confirm: " + confirmPassword + ", email: " + email);
		return "index";
	}

}
