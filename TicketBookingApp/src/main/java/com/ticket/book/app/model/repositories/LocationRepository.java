package com.ticket.book.app.model.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.ticket.book.app.model.Location;


@RepositoryRestResource(collectionResourceRel = "loc", path = "loc")
@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {


	Collection<Location> findByLocationName(@Param(value="locationName") String locationName);
	
	Collection<Location> findByLocationId(long locationId);
}