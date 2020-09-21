package com.fleetapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleetapp.model.Employee;
import com.fleetapp.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

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
}
