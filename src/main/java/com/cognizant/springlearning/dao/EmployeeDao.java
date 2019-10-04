package com.cognizant.springlearning.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.springlearning.bean.Employee;




@Repository
public class EmployeeDao {
	
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDao.class);
	
	public EmployeeDao(){
		
		 LOGGER.info("Inside EmployeeDao Constructor");
		
		
	}

	public List getEmployees() {

		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		List employees = (ArrayList<Employee>) context.getBean("employeeList",ArrayList.class);
		System.out.println(employees);
		return employees;
	}
	
	public Employee getEmployee(int id){
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		List<Employee> employees = (ArrayList<Employee>) context.getBean("employeeList",ArrayList.class);
		for(int i=0;i<employees.size();i++){
			if(employees.get(i).getId()==id){
				return employees.get(i);
			}
		}
		return null;
	}

}
