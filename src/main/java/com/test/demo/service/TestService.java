package com.test.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.model.TestModel;
import com.test.demo.repository.TestRepository;

@Service
public class TestService {
	
	@Autowired
	TestRepository testModel;
	
	@Autowired
	TestRepository testRepository;

	public List<TestModel> giveResponse() {
		//TestModel testModel = new TestModel("Puneet", "puneet@gmail.com");
		
		//testRepository.save(testModel);
		
		List<TestModel> response =  (List<TestModel>) testModel.findAll(); 
		
		return response;
	}

}
