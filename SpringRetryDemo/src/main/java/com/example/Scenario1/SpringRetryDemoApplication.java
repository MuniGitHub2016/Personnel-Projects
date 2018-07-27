package com.example.Scenario1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.retry.backoff.FixedBackOffPolicy;
import org.springframework.retry.policy.SimpleRetryPolicy;
import org.springframework.retry.support.RetryTemplate;

@SpringBootApplication
@EnableRetry
public class SpringRetryDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRetryDemoApplication.class, args);
	}
	
	@Bean
	public RetryTemplate retryTemplate() {
		SimpleRetryPolicy retryPolicy = new SimpleRetryPolicy();
		retryPolicy.setMaxAttempts(5);

		FixedBackOffPolicy backOffPolicy = new FixedBackOffPolicy();
		backOffPolicy.setBackOffPeriod(2000);

		RetryTemplate template = new RetryTemplate();
		template.setRetryPolicy(retryPolicy);
		template.setBackOffPolicy(backOffPolicy);

		return template;
	}
}
