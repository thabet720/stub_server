package com.bluei.indoor.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Drone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String droneCode;
	private int timesUsed;

	public Drone() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDroneCode() {
		return droneCode;
	}

	public void setDroneCode(String droneCode) {
		this.droneCode = droneCode;
	}

	public int getTimesUsed() {
		return timesUsed;
	}

	public void setTimesUsed(int timesUsed) {
		this.timesUsed = timesUsed;
	}
}
