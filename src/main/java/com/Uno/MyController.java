package com.Uno;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired
	private EmployeeRepository repository;
	
	@PostMapping("/employee")
	public Employee addEmployee( @RequestBody Employee employee ) {
		
		return repository.save(employee);
	}
	
	@GetMapping("/employees")
	public List<Employee> name() {
		return repository.findAll();
		
	}
}
