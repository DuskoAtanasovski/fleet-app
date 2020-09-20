package com.fleetapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleetapp.model.Vehicle;
import com.fleetapp.repository.VehicleRepository;

@Service
public class VehicleService {

	@Autowired
	private VehicleRepository vehicleRepository;

	public List<Vehicle> getVehicles() {
		return vehicleRepository.findAll();
	}

}
