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
	
	@Id
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="SEAT_ID")
	private SeatingArrangement seat;
	
	
	@Column(name="BOOKING_STATUS")
	private BookingStatus bookingStatus;
	
	
	public static enum BookingStatus{
		BOOKED,
		AVAILABLE,
		NOT_AVAILABLE,
	}


	public TheaterShows getTheaterShow() {
		return theaterShow;
	}


	public void setTheaterShow(TheaterShows theaterShow) {
		this.theaterShow = theaterShow;
	}


	public SeatingArrangement getSeat() {
		return seat;
	}


	public void setSeat(SeatingArrangement seat) {
		this.seat = seat;
	}


	public BookingStatus getBookingStatus() {
		return bookingStatus;
	}


	public void setBookingStatus(BookingStatus bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	
	
	
}
