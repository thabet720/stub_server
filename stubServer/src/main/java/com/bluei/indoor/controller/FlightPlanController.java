package com.bluei.indoor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bluei.indoor.dto.ErrorDTO;
import com.bluei.indoor.dto.MultipleObjectDTO;
import com.bluei.indoor.entities.FlightPlan;
import com.bluei.indoor.service.FlightPlanService;


@RestController
@RequestMapping("/backend/1/flightPlans")
public class FlightPlanController {
	
	@Autowired
	private FlightPlanService service;
	
	@PostMapping("/")
	public MultipleObjectDTO createFlightPlan(@RequestBody FlightPlan flightPlan) {
		service.insertFlightPlan(flightPlan);
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
	}
	@PutMapping("/")
	public MultipleObjectDTO updateFlightPlan(@RequestBody FlightPlan flightPlan) {
		service.insertFlightPlan(flightPlan);
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
	}
	
	@GetMapping("/")
	public MultipleObjectDTO getAllFlightPlans() {
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setData(service.findAllFlightPlans());
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
	}
	@GetMapping("/{id}")
	public MultipleObjectDTO getFlightById(@PathVariable("id") String id) {
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setData(service.findFlightPlanById(id));
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
	}
	@GetMapping("/getByStructure")
	public MultipleObjectDTO getFlightByStructure(@RequestParam String structureId) {
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setData(service.findFlightPlanByStructureId(structureId));
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
	}
}
