package com.bluei.indoor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
import com.bluei.indoor.entities.Drone;
import com.bluei.indoor.service.DroneService;


@CrossOrigin
@RestController
@RequestMapping("/backend/1/drones")
public class DroneController {
	
	@Autowired
	private DroneService service;
	
	@PostMapping("/")
	public MultipleObjectDTO createDrone(@RequestBody Drone drone) {
		service.insertDrone(drone);
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
	}
	@PutMapping("/")
	public MultipleObjectDTO updateDrone(@RequestBody Drone drone) {
		service.insertDrone(drone);
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
	}
	
	@DeleteMapping("/{id}")
	public MultipleObjectDTO deleteDrone(@PathVariable("id") int id) {
		service.deleteDrone(id);
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
	}
	
	@GetMapping("/")
	public MultipleObjectDTO getAllDrones() {
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setData(service.findAllDrones());
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
	}
	@GetMapping("/{id}")
	public MultipleObjectDTO getDroneById(@PathVariable("id") int id) {
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setData(service.findDroneById(id));
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
	}
	@GetMapping("/getByCode")
	public MultipleObjectDTO getDroneByCode(@RequestParam String code) {
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setData(service.findDroneByCode(code));
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
	}
	

}
