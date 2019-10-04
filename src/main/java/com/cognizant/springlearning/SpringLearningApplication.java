package com.cognizant.springlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearning.controller.EmployeeController;

@SpringBootApplication
@ComponentScan({"com.cognizant.springlearning.bean","com.cognizant.springlearning.controller","com.cognizant.springlearning.dao","com.cognizant.springlearning.service"})
public class SpringLearningApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringLearningApplication.class, args);
		
		
		displayEmployeeControllerAnnotation(context);
		
//		getEmployeeController();
		
	}
	
	
	public static void getEmployeeController(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		EmployeeController empController = (EmployeeController) context.getBean("employeeController",EmployeeController.class);
		
		
	}
	
	public static void displayEmployeeControllerAnnotation(ApplicationContext applicationContext){
		
		EmployeeController employeeController = (EmployeeController) applicationContext.getBean("employeeController");
		
	}

}
