package org.vehiclemanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "partsdetails")
public class Parts {
	@Id
	@Column(length=20)
	private String username;
	private String brake;
	private String door;
	private String steering;
	private String mirror;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getBrake() {
		return brake;
	}

	public void setBrake(String brake) {
		this.brake = brake;
	}

	public String getDoor() {
		return door;
	}

	public void setDoor(String door) {
		this.door = door;
	}

	public String getSteering() {
		return steering;
	}

	public void setSteering(String steering) {
		this.steering = steering;
	}

	public String getMirror() {
		return mirror;
	}

	public void setMirror(String mirror) {
		this.mirror = mirror;
	}

}
