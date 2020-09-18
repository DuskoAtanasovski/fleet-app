package com.fleetapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleetapp.model.Contact;
import com.fleetapp.repository.ContactRepository;

@Service
public class ContactService {

	@Autowired
	private ContactRepository contactRepository;

	// List of contacts
	public List<Contact> getContacts() {
		return contactRepository.findAll();
	}

	// Save new contact
	public void save(Contact contact) {
		contactRepository.save(contact);
	}

	// Get contact by id
	public Optional<Contact> findById(int id) {
		return contactRepository.findById(id);
	}

	// Delete contact
	public void delete(Integer id) {
		contactRepository.deleteById(id);
	}

}
