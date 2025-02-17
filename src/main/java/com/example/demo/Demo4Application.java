package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo4Application {
	
	@Autowired
	private  EmployeeRepository repository;
	@GetMapping("/all")
	public List<Employee>getAllEmployees(){
		return repository.findAll();
	}
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee e) {
		return repository.save(e);
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo4Application.class, args);
	}

}
