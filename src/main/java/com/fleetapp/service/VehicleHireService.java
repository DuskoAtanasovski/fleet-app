package com.fleetapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleetapp.model.VehicleHire;
import com.fleetapp.repository.VehicleHireRepository;

@Service
public class VehicleHireService {

	@Autowired
	private VehicleHireRepository vehicleHireRepository;

	// List of Vehicle Hires
	public List<VehicleHire> getVehicleHires() {
		return vehicleHireRepository.findAll();
	}

	// Save new Vehicle Hire
	public void save(VehicleHire vehicleHire) {
		vehicleHireRepository.save(vehicleHire);
	}

	// Get Vehicle Hire by id
	public Optional<VehicleHire> findById(int id) {
		return vehicleHireRepository.findById(id);
	}

	// Delete Vehicle Hire
	public void delete(Integer id) {
		vehicleHireRepository.deleteById(id);
	}

}
