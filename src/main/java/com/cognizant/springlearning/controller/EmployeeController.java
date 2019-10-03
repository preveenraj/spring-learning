package com.cognizant.springlearning.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.springlearning.dao.EmployeeDao;
import com.cognizant.springlearning.service.EmployeeService;


@Component
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
	
	

}
