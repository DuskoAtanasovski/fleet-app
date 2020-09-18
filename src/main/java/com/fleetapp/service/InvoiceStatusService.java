package com.fleetapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleetapp.model.InvoiceStatus;
import com.fleetapp.repository.InvoiceStatusRepository;

@Service
public class InvoiceStatusService {

	@Autowired
	private InvoiceStatusRepository invoiceStatusRepository;

	// List of invoiceStatuss
	public List<InvoiceStatus> getInvoiceStatuses() {
		return invoiceStatusRepository.findAll();
	}

	// Save new invoiceStatus
	public void save(InvoiceStatus invoiceStatus) {
		invoiceStatusRepository.save(invoiceStatus);
	}

	// Get invoiceStatus by id
	public Optional<InvoiceStatus> findById(int id) {
		return invoiceStatusRepository.findById(id);
	}

	// Delete invoiceStatus
	public void delete(Integer id) {
		invoiceStatusRepository.deleteById(id);

	}
}
