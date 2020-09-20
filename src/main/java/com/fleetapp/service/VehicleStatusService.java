package com.fleetapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleetapp.model.VehicleStatus;
import com.fleetapp.repository.VehicleStatusRepository;

@Service
public class VehicleStatusService {

	@Autowired
	private VehicleStatusRepository vehicleStatusRepository;

	// List of vehicleStatuss
	public List<VehicleStatus> getVehicleStatuses() {
		return vehicleStatusRepository.findAll();
	}

	// Save new vehicleStatus
	public void save(VehicleStatus vehicleStatus) {
		vehicleStatusRepository.save(vehicleStatus);
	}

	// Get vehicleStatus by id
	public Optional<VehicleStatus> findById(int id) {
		return vehicleStatusRepository.findById(id);
	}

	// Delete vehicleStatus
	public void delete(Integer id) {
		vehicleStatusRepository.deleteById(id);

	}
}
