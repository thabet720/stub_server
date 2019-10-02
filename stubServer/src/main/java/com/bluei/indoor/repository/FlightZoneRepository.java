package com.bluei.indoor.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bluei.indoor.entities.FlightZone;

public interface FlightZoneRepository extends CrudRepository<FlightZone,Integer>{
	public List<FlightZone> findByStructureId(String structure);

}
