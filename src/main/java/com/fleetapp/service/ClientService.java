package com.fleetapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleetapp.model.Client;
import com.fleetapp.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	// List of clients
	public List<Client> getClients() {
		return clientRepository.findAll();
	}

	// Save new client
	public void save(Client client) {
		clientRepository.save(client);
	}

	// Get client by id
	public Optional<Client> findById(int id) {
		return clientRepository.findById(id);
	}
	
	// Delete client
	public void delete(Integer id) {
		clientRepository.deleteById(id);
	}

}
