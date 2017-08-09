package com.ticket.book.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MOVIE")
public class Movie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MOVIE_ID")
	private long movie_id ;
	
	@Column(name="MOVIE_NAME", nullable=false )
	private String movieName;

	@Enumerated
	@Column(name="LANGUAGE")
	private Language language;
	
	@Column(name="MOVIE_LENGTH")
	private int movieLength;
	
	public long getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(long movie_id) {
		this.movie_id = movie_id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public int getMovieLength() {
		return movieLength;
	}

	public void setMovieLength(int movieLength) {
		this.movieLength = movieLength;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public MovieCertificate getMovieCertificate() {
		return movieCertificate;
	}

	public void setMovieCertificate(MovieCertificate movieCertificate) {
		this.movieCertificate = movieCertificate;
	}

	@Column(name="RELEASE_DATE")
	private Date releaseDate;
	
	@Enumerated
	@Column(name="MOVIE_CERTIFICATE")
	private MovieCertificate movieCertificate;
	
	public static enum MovieCertificate {
		U,
		A,
		U_A,
		S
	}
	
	public static enum Language {
		ENGLISH,
		HINDI,
		MARATHI
	}
	

}
