package com.cognizant.springlearning.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearning.bean.Employee;
import com.cognizant.springlearning.dao.EmployeeDao;
import com.cognizant.springlearning.service.EmployeeService;
import com.cognizant.springlearning.service.exception.EmployeeNotFoundException;


@RestController
@CrossOrigin("http://localhost:4200")
public class EmployeeController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDao.class);
	
	@Autowired
	EmployeeService employeeService;

	public EmployeeController() {
		LOGGER.info("Inside EmployeeController Constructor");
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	
	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping("/employees")
	public ResponseEntity<List> getAllEmployees(){
		return new ResponseEntity<List>(employeeService.getAllEmployees(),HttpStatus.OK);
	}
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") int id){
		return new ResponseEntity<Employee>(employeeService.getEmployee(id),HttpStatus.OK);
	}
	
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable("id") int id,@RequestBody @Valid Employee employee) throws EmployeeNotFoundException {
		return employeeService.updateEmployee(id,employee);
	}
	

}
