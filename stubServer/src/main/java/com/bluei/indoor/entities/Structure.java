package com.bluei.indoor.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.bluei.indoor.dto.FlightZoneDTO;
import com.bluei.indoor.dto.StructureDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Structure {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	@OneToMany(mappedBy="structure", cascade = CascadeType.ALL	)
	private List<FlightPlan> flightPlans;
	@JsonIgnore
	@OneToMany(mappedBy="structure", cascade = CascadeType.ALL	)
	private List<Path> paths;
	@OneToMany(mappedBy="structure", cascade = CascadeType.ALL,orphanRemoval = true	)
	private List<FlightZone> flightZones;
	@ManyToOne( cascade = CascadeType.ALL)
	private Area area;
	
	public Structure() {
		super();
	}
	
	public Structure(StructureDTO dto) {
		super();
		flightZones = new ArrayList<FlightZone>();
		area = new Area();
		this.id = dto.getId();
		this.name= dto.getName();
		this.area.setId(dto.getAreaId());
		for(FlightZoneDTO flightZone: dto.getFlightZones()) {
			flightZones.add(new FlightZone(flightZone));
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
	public List<FlightPlan> getFlightPlans() {
		return flightPlans;
	}
	public void setFlightPlans(List<FlightPlan> flightPlans) {
		this.flightPlans = flightPlans;
	}
	public List<Path> getPaths() {
		return paths;
	}
	public void setPaths(List<Path> paths) {
		this.paths = paths;
	}
	public List<FlightZone> getFlightZones() {
		return flightZones;
	}
	public void setFlightZones(List<FlightZone> flightZones) {
		this.flightZones = flightZones;
	}
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	
	
	
	
}
