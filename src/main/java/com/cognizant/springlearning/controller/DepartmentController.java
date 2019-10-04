package com.cognizant.springlearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearning.bean.Department;
import com.cognizant.springlearning.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@GetMapping("/departments")
	public ResponseEntity<Department[]> getAllDepartments(){
		return new ResponseEntity<Department[]>(departmentService.getAllDepartments(),HttpStatus.OK);	
		
	}

}
