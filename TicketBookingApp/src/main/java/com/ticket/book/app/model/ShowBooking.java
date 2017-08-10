package com.ticket.book.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SHOW_BOOKING")
public class ShowBooking {
	
	@Id
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="SHOW_ID")
	private TheaterShows theaterShow;
	
	public TheaterShows getTheaterShow() {
		return theaterShow;
	}


	public void setTheaterShow(TheaterShows theaterShow) {
		this.theaterShow = theaterShow;
	}
	
}
