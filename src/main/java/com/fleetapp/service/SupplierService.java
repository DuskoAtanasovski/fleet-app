package com.fleetapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleetapp.model.Supplier;
import com.fleetapp.repository.SupplierRepository;

@Service
public class SupplierService {

	@Autowired
	private SupplierRepository supplierRepository;

	// List of suppliers
	public List<Supplier> getSuppliers() {
		return supplierRepository.findAll();
	}

	// Save new supplier
	public void save(Supplier supplier) {
		supplierRepository.save(supplier);
	}

	// Get supplier by id
	public Optional<Supplier> findById(int id) {
		return supplierRepository.findById(id);
	}

	// Delete supplier
	public void delete(Integer id) {
		supplierRepository.deleteById(id);
	}

}
