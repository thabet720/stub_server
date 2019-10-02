package com.bluei.indoor.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bluei.indoor.entities.Area;
import com.bluei.indoor.repository.AreaRepository;

@Service
public class AreaService {
	
	private final AreaRepository repo;

	public AreaService(AreaRepository repo) {
		super();
		this.repo = repo;
	}
	
	public void insertArea(Area area) {
		 repo.save(area);
	}
	
	public void deleteArea(int id) {
		repo.delete(repo.findById(id).get());
	}
	
	public List<Area> findAllAreas(){
		List<Area> list = new ArrayList<Area>();
		for(Area area: repo.findAll())
			list.add(area);
		return list;
	}
	
	public Area findAreaById(int id) {
		return repo.findById(id).get();
	}

}
