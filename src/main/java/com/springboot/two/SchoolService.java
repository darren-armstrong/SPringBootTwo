package com.springboot.two;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping(value="/rest/school")
public class SchoolService {
	
	@RequestMapping(value="/students/{id}")
	public Student getStudent(@PathVariable String id){
		
		String URL = "http://localhost:8080/rest/student/" + id;
		
		RestTemplate template = new RestTemplate();
		
		Student student = template.getForObject(URL, Student.class);
		
		return student;
	}

}
