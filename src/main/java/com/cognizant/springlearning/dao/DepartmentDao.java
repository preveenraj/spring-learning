package com.cognizant.springlearning.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.springlearning.bean.Department;

@Repository
public class DepartmentDao {
	
	static Department[] departments;


	public static Department[] getDepartments() {
		return departments;
	}


	public static void setDepartments(Department[] departments) {
		DepartmentDao.departments = departments;
	}


	public Department[] getAllDepartments() {
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		
		return departments;
	}

}
