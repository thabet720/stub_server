package com.bluei.indoor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bluei.indoor.dto.ErrorDTO;
import com.bluei.indoor.dto.FlightZoneDTO;
import com.bluei.indoor.dto.MultipleObjectDTO;
import com.bluei.indoor.service.FlightZoneService;


@RestController
@RequestMapping("/backend/1/flightZone")
public class FlightZoneController {
	
	@Autowired
	private FlightZoneService service;
	
	@GetMapping("/{id}")
	public MultipleObjectDTO getFlightZoneById(@PathVariable("id") int id) {
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setData( service.getFlightZoneByID(id));
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
	}
	@DeleteMapping("/{id}")
	public MultipleObjectDTO deleteSingleFlightZone(@PathVariable("id")int id) {
		service.deletFlightZone(id);
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
	}
	@DeleteMapping("/deleteMultiple")
	public MultipleObjectDTO deleteSingleFlightZone(@RequestParam List<Integer> ids) {
		service.deleteMultipleFlightZones(ids);
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
	}
	
	@PostMapping("/insertMultiple")
	public MultipleObjectDTO saveMultipleZones(@RequestBody List<FlightZoneDTO> list) {
		service.insertFlightZones(list);
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
	}

}
