package com.cognizant.springlearning.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.springlearning.dao.EmployeeDao;


@Component
public class EmployeeService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);
	
	@Autowired
	EmployeeDao employeeDao;
	

	public EmployeeService() {
		LOGGER.info("Inside EmployeeService Constructor");   

	
		
	}


	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}


	@Autowired
	public void setEmployeeDao(EmployeeDao employeeDao) {
		
		this.employeeDao = employeeDao;
	}

	
	
}
