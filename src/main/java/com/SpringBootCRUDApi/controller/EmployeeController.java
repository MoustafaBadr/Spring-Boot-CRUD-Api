package com.SpringBootCRUDApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootCRUDApi.model.Employee;
import com.SpringBootCRUDApi.services.EmployeeServiceImp;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImp employeeServiceImp;

	@GetMapping("/employee")
	public List<Employee> getAllEmployee() {
		return employeeServiceImp.get();
	}

	@PostMapping("/save")
	public Employee SaveEmployee(@RequestBody Employee employee) {
		employeeServiceImp.save(employee);
		return employee;
	}

	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable int id) {
		Employee employee = employeeServiceImp.get(id);

		if (employee == null) {
			throw new RuntimeException("Employee with id " + id + " is not found");
		}
		return employee;
	}

	@DeleteMapping("/delete/{id}")
	public String DeleteEmployee(@PathVariable int id) {
		employeeServiceImp.delete(id);
		return "Employee Deleted successfully with id : " + id;
	}
	
	@PutMapping("/employee/update")
	public Employee UpdateEmployee(@RequestBody Employee employee) {
		employeeServiceImp.save(employee);
		
		return employee;
	}
}
