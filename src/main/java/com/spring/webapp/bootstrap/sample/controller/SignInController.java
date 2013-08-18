package com.spring.webapp.bootstrap.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignInController {

	private static final Logger log = LoggerFactory.getLogger(SignInController.class);

	@RequestMapping(value="/web/signin.do", method=RequestMethod.POST)
	public String signin(@RequestParam("username") String username, @RequestParam("password") String password) {
		log.info("username: " + username + ", password: " + password);
		return "index";
	}

}
