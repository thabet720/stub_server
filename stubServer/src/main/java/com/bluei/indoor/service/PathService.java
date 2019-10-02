package com.bluei.indoor.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bluei.indoor.entities.Path;
import com.bluei.indoor.entities.Waypoint;
import com.bluei.indoor.repository.PathRepository;


@Service
public class PathService {

	private final PathRepository repo;

	public PathService(PathRepository repo) {
		super();
		this.repo = repo;
	}

	public void insertPath(Path path) {
		for(Waypoint waypoint: path.getWaypoints())
			waypoint.setTrajectory(path);
		repo.save(path);
	}
	
	public void deletePath (int id) {
		repo.delete(repo.findById(id).get());
	}
	
	public List<Path> findAllPaths(){
		List<Path> list = new ArrayList<Path>();
		for(Path p: repo.findAll())
			list.add(p);
		
		return list;
	}
	
	public Path findPathById(int id) {
		return repo.findById(id).get();
	}
	 public Path getByName(String name) {
		 return repo.findByName(name);
	 }

}
