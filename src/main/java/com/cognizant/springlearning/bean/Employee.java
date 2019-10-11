package com.cognizant.springlearning.bean;

import java.util.Arrays;
import java.util.Date;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonFormat;



public class Employee {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Employee.class);
	
	@NotNull
	private int id;
	@NotNull
	@NotBlank(message="Name should not be null")
	@Size(min=1, max=30, message="Country code should be between 1 and 30 characters")
	private String name;
	@NotNull
	@DecimalMin(value = "0")
	private double salary;
	@NotNull
	private boolean permanent;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	private Date dateOfBirth;
	private Department department;
	private Skill[] skills;
	
	
	public Skill[] getSkills() {
		return skills;
	}


	public void setSkills(Skill[] skills) {
		this.skills = skills;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public Employee() {
		LOGGER.debug("Inside Employee Constructor");
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isPermanent() {
		return permanent;
	}
	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", permanent=" + permanent
				+ ", dateOfBirth=" + dateOfBirth + ", department=" + department + ", skills=" + Arrays.toString(skills)
				+ "]";
	}
	
}
