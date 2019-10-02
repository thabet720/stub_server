package com.bluei.indoor.dto;

import com.bluei.indoor.entities.FlightZone;
import com.bluei.indoor.entities.MapPosition;

public class FlightZoneDTO {
	private int id;
    private MapPosition firstPoint ;
    private MapPosition secondPoint;
    private int structureId;
    
    
    public FlightZoneDTO() {
		super();
	}

	public FlightZoneDTO(FlightZone flightZone) {
    	this.firstPoint = new MapPosition();
    	this.secondPoint = new MapPosition();
    	this.id= flightZone.getId();
    	this.firstPoint.setX(flightZone.getX());
    	this.firstPoint.setY(flightZone.getY());
    	this.firstPoint.setZ(flightZone.getZ());
    	this.secondPoint.setX(flightZone.getX1());
    	this.secondPoint.setY(flightZone.getY1());
    	this.secondPoint.setZ(flightZone.getZ1());
    	this.structureId= flightZone.getStructure().getId();
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MapPosition getFirstPoint() {
		return firstPoint;
	}

	public void setFirstPoint(MapPosition firstPoint) {
		this.firstPoint = firstPoint;
	}

	public MapPosition getSecondPoint() {
		return secondPoint;
	}

	public void setSecondPoint(MapPosition secondPoint) {
		this.secondPoint = secondPoint;
	}

	@Override
	public String toString() {
		return "FlightZoneDTO [id=" + id + ", firstPoint=" + firstPoint + ", secondPoint=" + secondPoint
				+ ", structureId=" + structureId + "]";
	}

	public int getStructureId() {
		return structureId;
	}

	public void setStructureId(int structureId) {
		this.structureId = structureId;
	}
	
    
    

}
