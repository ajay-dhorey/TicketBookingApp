package com.ticket.book.app.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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

	public Set<Theater> getTheaters() {
		return theaters;
	}

	public void setTheaters(Set<Theater> theaters) {
		this.theaters = theaters;
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", locationName=" + locationName + ", pincode=" + pincode +
				"]";
	}

	@OneToMany(mappedBy = "location", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	Set<Theater> theaters;

	public Location(String locationName, String pincode) {
		super();
		this.locationName = locationName;
		this.pincode = pincode;
	}
	
	public Location() {
		super();
	}
}