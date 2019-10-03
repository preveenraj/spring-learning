package com.cognizant.springlearning.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;




@Component
public class EmployeeDao {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDao.class);
	
	public EmployeeDao(){
		
		 LOGGER.info("Inside EmployeeDao Constructor");
		
		
	}

}
