package com.bluei.indoor.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bluei.indoor.entities.Waypoint;
import com.bluei.indoor.repository.WaypointRepository;
@Service
public class WaypointService {
	private final WaypointRepository repo ;

	public WaypointService(WaypointRepository repo) {
		super();
		this.repo = repo;
	}

	public void insertWaypoint(Waypoint waypoint) {
		repo.save(waypoint);
	}
	
	public void deleteWaypoint(int id) {
		repo.delete(repo.findById(id).get());
	}
	
	public List<Waypoint> findAllWaypoints(){
		List<Waypoint> list = new ArrayList<Waypoint>();
		for (Waypoint waypoint: repo.findAll())
			list.add(waypoint);
		return list;
	}
	
	public Waypoint findWaypointById(int id) {
		return repo.findById(id).get();
	}
}
