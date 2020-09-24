package com.fleetapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleetapp.model.Employee;
import com.fleetapp.model.User;
import com.fleetapp.repository.EmployeeRepository;
import com.fleetapp.repository.UserRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private UserRepository userRepository;

	// List of Employees
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

	// Save new Employee
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	// Get Employee by id
	public Optional<Employee> findById(int id) {
		return employeeRepository.findById(id);
	}

	// Delete Employee
	public void delete(Integer id) {
		employeeRepository.deleteById(id);
	}

	// Get Employees by keyword
	public List<Employee> findByKeyword(String keyword) {
		return employeeRepository.findByKeyword(keyword);
	}

	public Employee findByUsername(String un) {
		return employeeRepository.findByUsername(un);
	}

	public void assignUsername(int id) {
		Employee employee = employeeRepository.findById(id).orElse(null);
		User user = userRepository.findByFirstnameAndLastname(employee.getFirstname(), employee.getLastname());
		employee.setUsername(user.getUsername());
		employeeRepository.save(employee);
	}
}
