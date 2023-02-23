package com.demo.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.restapi.entity.LogInDetails;
import com.demo.restapi.service.LogInService;

@RestController
public class LoginController {

	@Autowired
	LogInService logInService;

	@GetMapping("/getAllLoginDetails")
	private List<LogInDetails> getAllLogInDetails() {

		return logInService.getAllLoginDetails();

	}

	@GetMapping("/getLoginByemail/{email}")
	private List<LogInDetails> getLongInDetailsByEmail(@PathVariable("email") String email) {

		return logInService.getLongInDetailsByEmail(email);

	}

	@PostMapping("/saveLogInDetails")
	private int saveLogInDetails(@RequestBody LogInDetails signup) {

		logInService.saveLogInDetails(signup);
		return signup.getId();

	}

}
