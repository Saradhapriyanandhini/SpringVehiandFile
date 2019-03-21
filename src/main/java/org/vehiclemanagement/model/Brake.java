package org.vehiclemanagement.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "brakedetails")
public class Brake {
	@Id
	@GeneratedValue
	private int BrakeId;
	private String brakeDetails;
	public int getBrakeId() {
		return BrakeId;
	}
	public void setBrakeId(int brakeId) {
		BrakeId = brakeId;
	}
	public String getBrakeDetails() {
		return brakeDetails;
	}
	public void setBrakeDetails(String brakeDetails) {
		this.brakeDetails = brakeDetails;
	}
	
}
