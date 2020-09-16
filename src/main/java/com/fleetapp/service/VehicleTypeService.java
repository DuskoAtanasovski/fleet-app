package com.fleetapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleetapp.model.VehicleType;
import com.fleetapp.repository.VehicleTypeRepository;

@Service
public class VehicleTypeService {

	@Autowired
	private VehicleTypeRepository vehicleTypeRepository;

	// List of vehicleTypes
	public List<VehicleType> getVehicleTypes() {
		return vehicleTypeRepository.findAll();
	}

	// Save new vehicleType
	public void save(VehicleType vehicleType) {
		vehicleTypeRepository.save(vehicleType);
	}

	// Get vehicleType by id
	public Optional<VehicleType> findById(int id) {
		return vehicleTypeRepository.findById(id);
	}

	// Delete vehicleType
	public void delete(Integer id) {
		vehicleTypeRepository.deleteById(id);

	}
}
