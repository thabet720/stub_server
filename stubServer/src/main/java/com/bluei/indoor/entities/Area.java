package com.bluei.indoor.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Area {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    private double width;
    private double height;
    @JsonProperty("location_id")
    private int locationId;
    @OneToMany(mappedBy="area", cascade = CascadeType.ALL	)
    private List<Structure> structures;
    @OneToOne
    @JsonProperty("origin_on_map")
    @JoinColumn(name = "map_position_id")
    private MapPosition originOnMap;
	public Area() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public List<Structure> getStructures() {
		return structures;
	}
	public void setStructures(List<Structure> structures) {
		this.structures = structures;
	}
	public MapPosition getOriginOnMap() {
		return originOnMap;
	}
	
	public void setOriginOnMap(MapPosition originOnMap) {
		this.originOnMap = originOnMap;
	}

    

}
