package com.SpringBootCRUDApi.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootCRUDApi.Dao.EmployeeDaoImp;
import com.SpringBootCRUDApi.model.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeDaoImp employeeDaoImp;

	@Transactional
	@Override
	public List<Employee> get() {
		return employeeDaoImp.get();
	}

	@Transactional
	@Override
	public Employee get(int id) {
		return employeeDaoImp.get(id);
	}

	@Transactional
	@Override
	public void save(Employee employee) {
		employeeDaoImp.save(employee);
	}

	@Transactional
	@Override
	public void delete(int id) {

		employeeDaoImp.delete(id);
	}

}
