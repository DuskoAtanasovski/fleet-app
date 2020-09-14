package com.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceStatusController {
	
	@GetMapping("/inoviceStatuses")
	public String getInvoiceStatuses() {
		return "invoiceStatus";
	}

}
