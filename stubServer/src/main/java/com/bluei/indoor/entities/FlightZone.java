package com.bluei.indoor.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.bluei.indoor.dto.FlightZoneDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class FlightZone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private double x;
	private double y;
	private double z;
	private double x1;
	private double y1;
	private double z1;
	@JsonIgnore
	@ManyToOne
	private Structure structure;
	
	public FlightZone() {
		super();
	}
	public FlightZone(FlightZoneDTO dto) {
		super();
		this.id = dto.getId();
		this.x= dto.getFirstPoint().getX();
		this.y= dto.getFirstPoint().getY();
		this.z= dto.getFirstPoint().getZ();
		this.x1= dto.getSecondPoint().getX();
		this.y1= dto.getSecondPoint().getY();
		this.z1= dto.getSecondPoint().getZ();
		this.structure= new Structure();
		this.structure.setId(dto.getStructureId());
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getX1() {
		return x1;
	}
	public void setX1(double x1) {
		this.x1 = x1;
	}
	public double getY1() {
		return y1;
	}
	public void setY1(double y1) {
		this.y1 = y1;
	}
	public double getZ1() {
		return z1;
	}
	public void setZ1(double z1) {
		this.z1 = z1;
	}
	public Structure getStructure() {
		return structure;
	}
	public void setStructure(Structure structure) {
		this.structure = structure;
	}
	

}
