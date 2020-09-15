package com.fleetapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleetapp.model.State;
import com.fleetapp.repository.StateRepository;

@Service
public class StateService {

	@Autowired
	private StateRepository stateRepository;

	// List of states
	public List<State> getStates() {
		return stateRepository.findAll();
	}

	// Save new state
	public void save(State state) {
		stateRepository.save(state);
	}

	// Get state by id
	public Optional<State> findById(int id) {
		return stateRepository.findById(id);
	}

	// Delete state
	public void delete(Integer id) {
		stateRepository.deleteById(id);

	}
}
