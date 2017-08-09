package com.ticket.book.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="SHOWS")
public class TheaterShows {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SHOW_ID")
	private long show_id;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="THEATER_ID", nullable=false)
	private Theater theater;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="MOVIE_ID", nullable=false)
	private Movie movie;
	
	@Temporal(TemporalType.TIME)
	@Column(name="SHOW_START_TIME",nullable=false)
	private Date showStartTime;
	
	@Temporal(TemporalType.TIME)
	@Column(name="SHOW_END_TIME")
	private Date showEndTime;

	public long getShow_id() {
		return show_id;
	}

	public void setShow_id(long show_id) {
		this.show_id = show_id;
	}

	public Theater getTheater() {
		return theater;
	}

	public void setTheater(Theater theater) {
		this.theater = theater;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Date getShowStartTime() {
		return showStartTime;
	}

	public void setShowStartTime(Date showStartTime) {
		this.showStartTime = showStartTime;
	}

	public Date getShowEndTime() {
		return showEndTime;
	}

	public void setShowEndTime(Date showEndTime) {
		this.showEndTime = showEndTime;
	}
		
}
