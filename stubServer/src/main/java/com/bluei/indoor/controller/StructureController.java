package com.bluei.indoor.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bluei.indoor.dto.ErrorDTO;
import com.bluei.indoor.dto.MultipleObjectDTO;
import com.bluei.indoor.dto.StructureDTO;
import com.bluei.indoor.service.StructureService;


@RestController
@RequestMapping("/backend/1/structures")
public class StructureController {
	@Autowired
	private StructureService service;
	
	@PutMapping("/")
	public MultipleObjectDTO updateStructure (@RequestBody StructureDTO structure) {
		service.insertStructure(structure);
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
	}
	
	@GetMapping("/{id}")
	public MultipleObjectDTO getStructureById (@PathVariable("id") int id ) {
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setData( service.findStructureById(id));
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
	}
	
	@GetMapping("/getByArea")
	public MultipleObjectDTO getStructureByArea (@RequestParam int id ) {
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setData(service.findStructureByArea(id).get(0));
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
		
	}
}
