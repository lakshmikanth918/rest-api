package com.demo.restapi.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;


import com.demo.restapi.entity.LogInDetails;

public interface LogInRepository extends CrudRepository<LogInDetails, Integer> {
	
	List<LogInDetails> findByEmail(String email);

}
