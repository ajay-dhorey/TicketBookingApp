package com.ticket.book.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="MOVIE")
public class Movie {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MOVIE_ID")
	private long movie_id ;
	
	@Column(name="MOVIE_NAME", nullable=false )
	private String movieName;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="language_id")
	private Language language;
	
	@Column(name="MOVIE_LENGTH")
	private int movieLength;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="MOVIE_RATING_ID")
	private MovieRating movieRatingId;
	
}
