package com.ticket.book.app.model.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticket.book.app.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {


	Collection<Location> findByLocationName(String locationName);
	
	Collection<Location> findByLocationId(long locationId);
}