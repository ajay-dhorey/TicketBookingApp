package com.ticket.book.app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="LOCATION")
public class Location {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="LOC_ID")
	private long locationId;
	
	@Column(name="LOC_NAME", length=10)
	private String locationName;

	@Column(name="PINCODE", length=6)
	private String pincode;
	
	public long getLocationId() {
		return locationId;
	}

	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public List<Theater> getTheaters() {
		return theaters;
	}

	public void setTheaters(List<Theater> theaters) {
		this.theaters = theaters;
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", locationName=" + locationName + ", pincode=" + pincode
				+ ", theaters=" + theaters + "]";
	}

	@ManyToOne(targetEntity=Theater.class)
	List<Theater> theaters;

	public Location(String locationName, String pincode) {
		super();
		this.locationName = locationName;
		this.pincode = pincode;
	}
	
	public Location() {
		super();
	}
}