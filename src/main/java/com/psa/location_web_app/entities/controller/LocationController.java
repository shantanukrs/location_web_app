package com.psa.location_web_app.entities.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.psa.location_web_app.entities.Location;
import com.psa.location_web_app.entities.repositories.LocationRepository;

@Controller
public class LocationController {
	
	@Autowired
	private LocationRepository locationRepo;

//	to call jsp file location
	@RequestMapping("/showLocation")
	public String showLocation() {
		return "showLocation";
	}
	
	@RequestMapping("/saveLoc")
	public String saveLoc(@ModelAttribute("location") Location location, ModelMap modelMap) {
		locationRepo.save(location);
		modelMap.addAttribute("msg", "location saved!");
		return "showLocation";
	}
}
