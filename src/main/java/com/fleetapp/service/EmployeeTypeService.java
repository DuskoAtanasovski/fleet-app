package com.fleetapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleetapp.model.EmployeeType;
import com.fleetapp.repository.EmployeeTypeRepository;

@Service
public class EmployeeTypeService {

	@Autowired
	private EmployeeTypeRepository employeeTypeRepository;

	// List of employeeTypes
	public List<EmployeeType> getEmployeeTypes() {
		return employeeTypeRepository.findAll();
	}

	// Save new employeeType
	public void save(EmployeeType employeeType) {
		employeeTypeRepository.save(employeeType);
	}

	// Get employeeType by id
	public Optional<EmployeeType> findById(int id) {
		return employeeTypeRepository.findById(id);
	}

	// Delete employeeType
	public void delete(Integer id) {
		employeeTypeRepository.deleteById(id);

	}
}
