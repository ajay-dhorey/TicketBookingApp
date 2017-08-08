package com.ticket.book.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="MOVIE_RATING")
public class MovieRating {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private int id;
	
	@Column(name="NAME", nullable=false)
	private String name;
	
	@Column(name="DESCRIPTION")
	private String description;
}
