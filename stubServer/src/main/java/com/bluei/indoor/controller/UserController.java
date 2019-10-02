package com.bluei.indoor.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bluei.indoor.dto.ErrorDTO;
import com.bluei.indoor.dto.MultipleObjectDTO;
import com.bluei.indoor.entities.User;
import com.bluei.indoor.service.UserService;
@CrossOrigin
@RestController
@RequestMapping("/backend/1/users")
public class UserController {
	@Autowired
	private UserService service;
	

	@GetMapping("/")
	public MultipleObjectDTO getAllUsers (){
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setData(service.findAllUsers());
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
	
	}
	
	@PostMapping("/")
	public MultipleObjectDTO createUser(@RequestBody User user) {
		service.createUser(user);
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
	}

	@GetMapping("/{id}")
	public MultipleObjectDTO getById(@PathVariable int id) {
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setData(service.findUserById(id));
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
	}
	
	@DeleteMapping("/{id}")
	public MultipleObjectDTO deleteUser(@PathVariable int id) {
		service.deleteUser(service.findUserById(id));
		MultipleObjectDTO dto = new MultipleObjectDTO();
		dto.setResult("success");
		dto.setError(new ErrorDTO(0,""));
		return dto;
	}

}
