package com.devops.assignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
@GetMapping(value={"/controller", "/controller/{id}"}) 
public String getPathParamValue(@PathVariable(required = false) String id) {
	if(id !=null) {
	return "Value = "+ id;
	} else {
		return "Path value missing";
	}
	
}
}
