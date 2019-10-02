package com.bluei.indoor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bluei.indoor.dto.ErrorDTO;
import com.bluei.indoor.dto.MultipleObjectDTO;
import com.bluei.indoor.service.AreaService;


@CrossOrigin
@RestController
@RequestMapping("/backend/1/areas")
public class AreaController {
	@Autowired
	private AreaService service;
	
	@GetMapping("/")
	public MultipleObjectDTO  getAllAreas() {
		MultipleObjectDTO dto =  new MultipleObjectDTO();
		dto.setResult("success");
		ErrorDTO e=new ErrorDTO();
		e.setCode(0);
		e.setMessage("");
		dto.setError(e);
		dto.setData( service.findAllAreas());
		return dto ;
	}
	
	@GetMapping("/{id}")
	public MultipleObjectDTO getArea(@PathVariable("id") int id) {
		MultipleObjectDTO dto =  new MultipleObjectDTO();
		dto.setResult("success");
		ErrorDTO e=new ErrorDTO();
		e.setCode(0);
		e.setMessage("");
		dto.setError(e);
		dto.setData( service.findAreaById(id));
		return dto ;
		
	}
	@GetMapping("/api")
	public MultipleObjectDTO getFromApi() {
		RestTemplate template = new RestTemplate();
		return template.getForObject("http://localhost:3000/areas/1", MultipleObjectDTO.class);
	}

}
