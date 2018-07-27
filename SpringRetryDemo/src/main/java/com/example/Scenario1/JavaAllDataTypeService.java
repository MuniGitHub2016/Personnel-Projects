package com.example.Scenario1;

import org.springframework.retry.annotation.Retryable;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Backoff;
import org.springframework.stereotype.Service;


@Service
public class JavaAllDataTypeService {
	
	@Autowired
	private RetryTemplate retryTemplate;

	//Case1 - using @Retryable
	// try the method 9 times with 2 seconds delay.
	@Retryable(maxAttempts = 9, value = Exception.class, backoff = @Backoff(delay = 2000))
	public void springReTryTestScenario1() throws Exception {

		System.out.println("Using @Retryable!");
		throw new Exception();
	}
	
	
	//Case2 - using RetryTemplate
	public void springReTryTestScenario2() throws Exception {

		
		retryTemplate.execute(arg0 -> {
			System.out.println("Using RetryTemplate!");
			throw new Exception();
		});

	}

}
