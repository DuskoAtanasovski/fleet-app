package com.fleetapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleetapp.model.VehicleModel;
import com.fleetapp.repository.VehicleModelRepository;

@Service
public class VehicleModelService {

	@Autowired
	private VehicleModelRepository vehicleModelRepository;

	// List of vehicleModels
	public List<VehicleModel> getVehicleModels() {
		return vehicleModelRepository.findAll();
	}

	// Save new vehicleModel
	public void save(VehicleModel vehicleModel) {
		vehicleModelRepository.save(vehicleModel);
	}

	// Get vehicleModel by id
	public Optional<VehicleModel> findById(int id) {
		return vehicleModelRepository.findById(id);
	}

	// Delete vehicleModel
	public void delete(Integer id) {
		vehicleModelRepository.deleteById(id);

	}

}
