package com.fleetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMakeController {

	@GetMapping("/vehicleMakes")
	public String getVehicleMakes() {
		return "vehicleMake";
	}
}
