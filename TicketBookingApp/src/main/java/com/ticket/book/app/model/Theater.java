package com.ticket.book.app.model;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="THEATER")
public class Theater {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="THEATER_ID")
	private long theaterId;
	
	@Column(name="ADDRESS", length=100)
	private String address;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="LOC_ID")
	private Location location;

	public Theater(String address, Location location) {
		super();
		this.address = address;
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Theater [theaterId=" + theaterId + ", address=" + address + ", location=" + location + "]";
	}

	public Theater() {
		super();
	}

	public long getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(long theaterId) {
		this.theaterId = theaterId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
}