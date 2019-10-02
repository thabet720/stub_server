package com.bluei.indoor.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Waypoint {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double x;
    private double y;
    private double z;
    private double angle;
    @Column(name = "ind")
    private int index;
    @ManyToOne
    @JsonIgnore
    private Path trajectory;

    public Waypoint() {
    }

    public Waypoint(int id, double x, double y, double z, double angle, int index) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.z = z;
        this.angle = angle;
        this.index = index;
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

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    

 

	public Path getTrajectory() {
		return trajectory;
	}

	public void setTrajectory(Path trajectory) {
		this.trajectory = trajectory;
	}

	@Override
    public String toString() {
        return "Waypoint{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", angle=" + angle +
                ", index=" + index +
                '}';
    }
}
