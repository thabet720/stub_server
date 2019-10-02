package com.bluei.indoor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bluei.indoor.dto.ErrorDTO;
import com.bluei.indoor.dto.MultipleObjectDTO;
import com.bluei.indoor.entities.Path;
import com.bluei.indoor.service.PathService;


@RestController
@RequestMapping("/backend/1/paths")
public class PathController {
	@Autowired
	private PathService service;

	@GetMapping("/")
	public MultipleObjectDTO getAllPaths() {
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setData( service.findAllPaths());
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
	}
	@GetMapping("/{id}")
	public MultipleObjectDTO getDroneById(@PathVariable("id") int id) {
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setData( service.findPathById(id));
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
	}
	
	@DeleteMapping("/{id}")
	public MultipleObjectDTO deleteDrone(@PathVariable("id") int id) {
		service.deletePath(id);
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
	}
	@PostMapping("/")
	public MultipleObjectDTO createDrone(@RequestBody Path path) {
		service.insertPath(path);
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
	}
	@PutMapping("/")
	public MultipleObjectDTO updateDrone(@RequestBody  Path path) {
		service.insertPath(path);
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
	}
}
