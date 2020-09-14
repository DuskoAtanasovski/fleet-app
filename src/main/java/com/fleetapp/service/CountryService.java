package com.fleetapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleetapp.model.Country;
import com.fleetapp.repository.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	
	// List of countries
	public List<Country> getCountries(){
		return countryRepository.findAll();
	}
	
	// Save new country
	public void save(Country country) {
		countryRepository.save(country);
	}

}
