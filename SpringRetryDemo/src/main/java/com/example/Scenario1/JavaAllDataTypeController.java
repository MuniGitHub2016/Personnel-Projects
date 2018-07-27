package com.example.Scenario1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaAllDataTypeController {

	@Autowired
	JavaAllDataTypeService JavaAllDataTypeService;

	@RequestMapping(value = "/springReTryTestScenario1", method = RequestMethod.GET)
	public ResponseEntity<String> springReTryTestScenario1() {

		System.out.println("springReTryTest controller");

		try {
			JavaAllDataTypeService.springReTryTestScenario1();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ResponseEntity<String>("abcd", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/springReTryTestScenario2", method = RequestMethod.GET)
	public ResponseEntity<String> springReTryTestScenario2() {

		System.out.println("springReTryTest controller");

		try {
			JavaAllDataTypeService.springReTryTestScenario2();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ResponseEntity<String>("abcd", HttpStatus.OK);
	}

}
