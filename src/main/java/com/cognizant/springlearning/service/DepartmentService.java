package com.cognizant.springlearning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.springlearning.bean.Department;
import com.cognizant.springlearning.dao.DepartmentDao;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentDao departmentDao;

	
	public Department[] getAllDepartments(){
		return departmentDao.getAllDepartments();
	}
}
