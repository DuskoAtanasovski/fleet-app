package com.fleetapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleetapp.model.Vehicle;
import com.fleetapp.repository.VehicleRepository;

@Service
public class VehicleService {

	@Autowired
	private VehicleRepository vehicleRepository;

	// List of Vehicles
	public List<Vehicle> getVehicles() {
		return vehicleRepository.findAll();
	}

	// Save new Vehicle
	public void save(Vehicle vehicle) {
		vehicleRepository.save(vehicle);
	}

	// Get Vehicle by id
	public Optional<Vehicle> findById(int id) {
		return vehicleRepository.findById(id);
	}

	// Delete Vehicle
	public void delete(Integer id) {
		vehicleRepository.deleteById(id);
	}

}
