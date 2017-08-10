package com.ticket.book.app.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="THEATER_SEATING_ARRANGEMENT")
public class SeatingArrangement {

	@Id
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="THEATER_ID")
	private Theater theater;
	
	@Column(name="SEAT_ARRANGEMENT")
	private String seatArrangement;
	
	public Theater getTheater() {
		return theater;
	}

	public void setTheater(Theater theater) {
		this.theater = theater;
	}	
}
