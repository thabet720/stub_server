package com.bluei.indoor.repository;

import org.springframework.data.repository.CrudRepository;

import com.bluei.indoor.entities.FlightPlan;


public interface FlightPlanRepository extends CrudRepository<FlightPlan, String>{
	public FlightPlan findByStructureId(String structure);
}
