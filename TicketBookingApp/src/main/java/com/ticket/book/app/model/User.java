package com.ticket.book.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	
	@Id
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="mobile_number", nullable=false, length=10, unique=true)
	private String mobile_number;
	
	@Column(name="user_name")
	private String userName;

}
