package com.SpringBootCRUDApi.Dao;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SpringBootCRUDApi.model.Employee;

import net.bytebuddy.asm.Advice.Enter;

@Repository
public class EmployeeDaoImp implements EmployeeDao {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Employee> get() {
		Session currentSession = entityManager.unwrap(Session.class);

		Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
		List<Employee> emp = query.getResultList();

		return emp;
	}

	@Override
	public Employee get(int id) {
		Session session = entityManager.unwrap(Session.class);

		Employee employee = session.get(Employee.class, id);
		return employee;
	}

	@Override
	public void save(Employee employee) {
		Session session = entityManager.unwrap(Session.class);

		session.saveOrUpdate(employee);

	}

	@Override
	public void delete(int id) {
		Session session = entityManager.unwrap(Session.class);
		Employee employee = session.get(Employee.class, id);
		session.delete(employee);

	}

}
