package com.fleetapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleetapp.model.VehicleMovement;
import com.fleetapp.repository.VehicleMovementRepository;

@Service
public class VehicleMovementService {

	@Autowired
	private VehicleMovementRepository vehicleMovementRepository;

	// List of Vehicle Movements
	public List<VehicleMovement> getVehicleMovements() {
		return vehicleMovementRepository.findAll();
	}

	// Save new Vehicle Movement
	public void save(VehicleMovement vehicleMovement) {
		vehicleMovementRepository.save(vehicleMovement);
	}

	// Get Vehicle Movement by id
	public Optional<VehicleMovement> findById(int id) {
		return vehicleMovementRepository.findById(id);
	}

	// Delete Vehicle Movement
	public void delete(Integer id) {
		vehicleMovementRepository.deleteById(id);
	}
}
