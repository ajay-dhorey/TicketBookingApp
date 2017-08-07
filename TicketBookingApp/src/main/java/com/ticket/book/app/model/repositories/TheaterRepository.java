package com.ticket.book.app.model.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticket.book.app.model.Location;
import com.ticket.book.app.model.Theater;

public interface TheaterRepository extends JpaRepository<Theater, Long> {
	Collection<Theater> findByLocation(Location locationId);
	Collection<Theater> findByTheaterId(long theaterId);
	
}
