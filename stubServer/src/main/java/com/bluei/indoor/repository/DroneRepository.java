package com.bluei.indoor.repository;

import org.springframework.data.repository.CrudRepository;

import com.bluei.indoor.entities.Drone;

public interface DroneRepository extends CrudRepository<Drone, Integer> {
	public Drone findByDroneCode(String droneCode);

}
