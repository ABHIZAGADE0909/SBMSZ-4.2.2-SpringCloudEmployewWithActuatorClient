package com.abhay.sb.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
	
	
	@GetMapping("/show")
	public ResponseEntity<String> showMsg() {
		return ResponseEntity.ok("Hello");
	}

}


