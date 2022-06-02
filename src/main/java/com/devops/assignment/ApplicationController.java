package com.devops.assignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
@GetMapping("/controller/{value}") 
public String getPathParamValue(@PathVariable String value) {
	return value;
	
}
}
