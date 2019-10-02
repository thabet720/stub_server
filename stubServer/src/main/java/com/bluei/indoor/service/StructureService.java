package com.bluei.indoor.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bluei.indoor.dto.StructureDTO;
import com.bluei.indoor.entities.FlightZone;
import com.bluei.indoor.entities.Structure;
import com.bluei.indoor.repository.AreaRepository;
import com.bluei.indoor.repository.StructureRepository;


@Service
public class StructureService {

	private final StructureRepository repo;

	
	public StructureService(StructureRepository repo, AreaRepository areaRepository) {
		super();
		this.repo = repo;
	}

	public void insertStructure(StructureDTO structureDTO) {
		Structure structure =  new Structure(structureDTO);

		for(FlightZone flightZone: structure.getFlightZones())
			flightZone.setStructure(structure);
		repo.save(structure);
	}
	
	public void deleteStructure(int id) {
		repo.delete(repo.findById(id).get());
	}
	
	public List<Structure> findAllStructures(){
		List<Structure> list = new ArrayList<Structure>();
		for(Structure structure: repo.findAll())
			list.add(structure);
		
		return list;
					
	}
	
	public Structure findStructureById (int id) {
		return repo.findById(id).get();
	}
	public List<StructureDTO> findStructureByArea(int id){
		List<StructureDTO> list = new ArrayList<StructureDTO>();
		for(Structure structure: repo.findByAreaId(id))
			list.add(new StructureDTO(structure));
		return list;
	}

}	
