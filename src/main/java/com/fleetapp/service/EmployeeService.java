package com.fleetapp.service;

import java.util.List;

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

}
