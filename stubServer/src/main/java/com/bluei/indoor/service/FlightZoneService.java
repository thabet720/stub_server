package com.bluei.indoor.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bluei.indoor.dto.FlightZoneDTO;
import com.bluei.indoor.entities.FlightZone;
import com.bluei.indoor.repository.FlightZoneRepository;

@Service
public class FlightZoneService {
	
	private final FlightZoneRepository repo;

	public FlightZoneService(FlightZoneRepository repo) {
		super();
		this.repo = repo;
	}
	
	  public List<FlightZone> getAllFlightZones(){
		  List<FlightZone> list = new ArrayList<FlightZone>();
		  for(FlightZone flightZone: repo.findAll())
			  list.add(flightZone);
		  return list;
	  }
	  
	  public void deletFlightZone(int id) {
		  repo.delete(repo.findById(id).get());
	  }
	  
	  public void insertFlightZone(FlightZone flightZone) {
		  repo.save(flightZone);
	  }
	  public void insertFlightZones(List<FlightZoneDTO> dtos) {
		  List<FlightZone> list = new ArrayList<FlightZone>();
		  for(FlightZoneDTO d: dtos)
			  list.add(new FlightZone(d));
		  repo.saveAll(list);
	  }
	  public FlightZoneDTO getFlightZoneByID(int id) {
		  return new FlightZoneDTO(repo.findById(id).get());
	  }
	  public List<FlightZone> getFlightZoneByStructure(String structure){
		  return repo.findByStructureId(structure);
	  }
	  
	  public void deleteMultipleFlightZones(List<Integer> ids) {
		  repo.deleteAll(repo.findAllById(ids));
	  }
	  

}
