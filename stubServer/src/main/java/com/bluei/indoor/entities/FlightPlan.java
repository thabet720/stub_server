package com.bluei.indoor.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class FlightPlan {
	@Id
    private String id;
    private String name;
    private Date startTime;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "drone_id")
    private  Drone drone;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "path_id", nullable = true)
    private Path path;
    @ManyToOne
    @JsonIgnore
    private Structure structure;

    public FlightPlan() {
    }

  

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }



    public Drone getDrone() {
		return drone;
	}



	public void setDrone(Drone drone) {
		this.drone = drone;
	}

	
	public Path getPath() {
		return path;
	}



	public void setPath(Path path) {
		this.path = path;
	}



	public Structure getStructure() {
		return structure;
	}

	public void setStructure(Structure structure) {
		this.structure = structure;
	}

	@Override
    public String toString() {
        return "FlightPlan{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", startTime=" + startTime +
                ", droneId=" + drone +
                ", pathId=" + path +
                '}';
    }
}
