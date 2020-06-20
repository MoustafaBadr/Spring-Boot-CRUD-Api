package com.SpringBootCRUDApi.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String Name;
	
	@Column(name = "gender")
	private String Gender;
	
	@Column(name = "department")
	private String Department;
	
	@Column(name = "dob")
	private Date dop;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String gender, String department, Date dop) {
		Name = name;
		Gender = gender;
		Department = department;
		this.dop = dop;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", Gender=" + Gender + ", Department=" + Department + ", dop="
				+ dop + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public Date getDop() {
		return dop;
	}

	public void setDop(Date dop) {
		this.dop = dop;
	}
	
	

}
