package com.bluei.indoor.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.bluei.indoor.entities.FlightPlan;
import com.bluei.indoor.repository.FlightPlanRepository;


@Service
public class FlightPlanService {
	
	private final FlightPlanRepository repo;

	public FlightPlanService(FlightPlanRepository repo) {
		super();
		this.repo = repo;
	}
	
	public void insertFlightPlan(FlightPlan flightPlan) {
		repo.save(flightPlan);
	}
	
	public void deleteFlightPlan(String id) {
		repo.delete(repo.findById(id).get());
	}
	
	public List<FlightPlan> findAllFlightPlans(){
		List<FlightPlan> list= new ArrayList<FlightPlan>();
		for(FlightPlan plan : repo.findAll())
			list.add(plan);
		
		return list;
		
	}
	
	public FlightPlan findFlightPlanById (String id) {
		return repo.findById(id).get();
	}
	
	public FlightPlan findFlightPlanByStructureId(String id) {
		return repo.findByStructureId(id);
	}

}
