package com.ticket.book.app.model.repositories;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import com.ticket.book.app.model.Location;

public interface LocationRepository extends CrudRepository<Location, Long> {


	Collection<Location> findByLocationName(String locationName);
	
	Collection<Location> findByLocationId(long locationId);
}