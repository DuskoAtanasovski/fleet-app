package com.fleetapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleetapp.model.VehicleMake;
import com.fleetapp.repository.VehicleMakeRepository;

@Service
public class VehicleMakeService {
	
	@Autowired
	private VehicleMakeRepository vehicleMakeRepository;

	// List of vehicleMakes
	public List<VehicleMake> getVehicleMakes() {
		return vehicleMakeRepository.findAll();
	}

	// Save new vehicleMake
	public void save(VehicleMake vehicleMake) {
		vehicleMakeRepository.save(vehicleMake);
	}

	// Get vehicleMake by id
	public Optional<VehicleMake> findById(int id) {
		return vehicleMakeRepository.findById(id);
	}

	// Delete vehicleMake
	public void delete(Integer id) {
		vehicleMakeRepository.deleteById(id);

	}

}
