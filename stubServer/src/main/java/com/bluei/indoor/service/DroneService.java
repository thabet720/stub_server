package com.bluei.indoor.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bluei.indoor.entities.Drone;
import com.bluei.indoor.repository.DroneRepository;


@Service
public class DroneService {

	private final DroneRepository repo;

	public DroneService(DroneRepository repo) {
		super();
		this.repo = repo;
	}
	
	public void insertDrone(Drone drone) {
		repo.save(drone);
	}
	
	public void deleteDrone(int id) {
		repo.delete(repo.findById(id).get());
	}
	
	public List<Drone> findAllDrones(){
		List<Drone> list = new ArrayList<Drone>();
		for(Drone drone: repo.findAll())
			list.add(drone);
		
		return list;
	}
	
	public Drone findDroneById(int id) {
		return repo.findById(id).get();
	}
	public Drone findDroneByCode(String code) {
		return repo.findByDroneCode(code);
	}
}
