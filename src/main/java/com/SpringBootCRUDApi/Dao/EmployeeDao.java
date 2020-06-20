package com.SpringBootCRUDApi.Dao;

import java.util.List;

import com.SpringBootCRUDApi.model.Employee;


public interface EmployeeDao {

	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
}
