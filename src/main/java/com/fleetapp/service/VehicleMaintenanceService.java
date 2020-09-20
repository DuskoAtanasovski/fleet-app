package com.fleetapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleetapp.model.VehicleMaintenance;
import com.fleetapp.repository.VehicleMaintenanceRepository;

@Service
public class VehicleMaintenanceService {

	@Autowired
	private VehicleMaintenanceRepository vehicleMaintenanceRepository;

	// List of Vehicle Maintenances
	public List<VehicleMaintenance> getVehicleMaintenance() {
		return vehicleMaintenanceRepository.findAll();
	}

	// Save new Vehicle Maintenance
	public void save(VehicleMaintenance vehicleMaintenance) {
		vehicleMaintenanceRepository.save(vehicleMaintenance);
	}

	// Get Vehicle Maintenance by id
	public Optional<VehicleMaintenance> findById(int id) {
		return vehicleMaintenanceRepository.findById(id);
	}

	// Delete Vehicle Maintenance
	public void delete(Integer id) {
		vehicleMaintenanceRepository.deleteById(id);
	}

}
