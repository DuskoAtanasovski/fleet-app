package com.fleetapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleetapp.model.Location;
import com.fleetapp.repository.LocationRepository;

@Service
public class LocationService {

	@Autowired
	private LocationRepository locationRepository;

	// List of locations
	public List<Location> getLocations() {
		return locationRepository.findAll();
	}

	// Save new location
	public void save(Location location) {
		locationRepository.save(location);
	}

	// Get location by id
	public Optional<Location> findById(int id) {
		return locationRepository.findById(id);
	}

	// Delete location
	public void delete(Integer id) {
		locationRepository.deleteById(id);

	}
}
