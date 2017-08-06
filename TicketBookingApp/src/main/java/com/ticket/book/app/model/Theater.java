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
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="LOC_ID")
	private Location location;
}