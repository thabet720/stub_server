package com.bluei.indoor.dto;

import java.util.ArrayList;
import java.util.List;

import com.bluei.indoor.entities.FlightZone;
import com.bluei.indoor.entities.Structure;


public class StructureDTO {

	private int id;
	private String name;
	private List<FlightZoneDTO> flightZones;
	private int areaId;
	
	public StructureDTO() {
		super();
	}
	
	public StructureDTO(Structure structure) {
		super();
		flightZones= new ArrayList<FlightZoneDTO>();
		this.id = structure.getId();
		this.name = structure.getName();
		this.areaId = structure.getArea().getId();
		for(FlightZone flightZone: structure.getFlightZones()) {
			flightZones.add(new FlightZoneDTO(flightZone));
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<FlightZoneDTO> getFlightZones() {
		return flightZones;
	}
	public void setFlightZones(List<FlightZoneDTO> flightZones) {
		this.flightZones = flightZones;
	}
	
	public int getAreaId() {
		return areaId;
	}
	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}
	@Override
	public String toString() {
		return "StructureDTO [id=" + id + ", name=" + name + ", flightZones=" + flightZones + ", area_id=" + areaId
				+ "]";
	}
	
	
	
	
	
	
	
}
