package com.fleetapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleetapp.model.Invoice;
import com.fleetapp.repository.InvoiceRepository;

@Service
public class InvoiceService {

	@Autowired
	private InvoiceRepository invoiceRepository;

	// List of invoices
	public List<Invoice> getInvoices() {
		return invoiceRepository.findAll();
	}

	// Save new invoice
	public void save(Invoice invoice) {
		invoiceRepository.save(invoice);
	}

	// Get invoice by id
	public Optional<Invoice> findById(int id) {
		return invoiceRepository.findById(id);
	}

	public void delete(Integer id) {
		invoiceRepository.deleteById(id);
	}

}
