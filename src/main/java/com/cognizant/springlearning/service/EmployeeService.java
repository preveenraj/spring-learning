package com.cognizant.springlearning.service;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.springlearning.bean.Employee;
import com.cognizant.springlearning.dao.EmployeeDao;
import com.cognizant.springlearning.service.exception.EmployeeNotFoundException;


@Service
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
	
	
	public List getAllEmployees(){
		return employeeDao.getEmployees();
	}
	
	public Employee getEmployee(int id){
		return employeeDao.getEmployee(id);	
	}
	
	public Employee updateEmployee(int id, Employee employee) throws EmployeeNotFoundException{
		return employeeDao.updateEmployee(id,employee);
	}

	
	
}
