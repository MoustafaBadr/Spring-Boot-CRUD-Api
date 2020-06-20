package com.SpringBootCRUDApi.services;

import java.util.List;

import com.SpringBootCRUDApi.model.Employee;


public interface EmployeeService {
	List<Employee> get();

	Employee get(int id);

	void save(Employee employee);

	void delete(int id);
}
