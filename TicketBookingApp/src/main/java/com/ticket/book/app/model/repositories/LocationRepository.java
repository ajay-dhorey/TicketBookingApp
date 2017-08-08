package com.ticket.book.app.model.repositories;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ticket.book.app.model.Location;

@RepositoryRestResource(collectionResourceRel = "location", path = "location")
public interface LocationRepository extends JpaRepository<Location, Long> {


	Collection<Location> findByLocationName(String locationName);
	
	Collection<Location> findByLocationId(long locationId);
}