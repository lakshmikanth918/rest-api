package com.demo.restapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.restapi.entity.LogInDetails;
import com.demo.restapi.repository.LogInRepository;

@Service
public class LogInService {

	@Autowired
	LogInRepository logInRepository;

	public List<LogInDetails> getAllLoginDetails() {

		List<LogInDetails> list = new ArrayList<LogInDetails>();
		logInRepository.findAll().forEach(logInDetails1 -> list.add(logInDetails1));

		return list;
	}

	public List<LogInDetails> getLongInDetailsByEmail(String email) {

		return logInRepository.findByEmail(email);
	
	}

	public void saveLogInDetails(LogInDetails logInDetails) {
		logInRepository.save(logInDetails);

	}

}
