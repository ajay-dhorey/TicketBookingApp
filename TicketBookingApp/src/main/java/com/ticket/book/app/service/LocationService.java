package com.ticket.book.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.book.app.model.Location;
import com.ticket.book.app.model.repositories.LocationRepository;

@Service
public class LocationService implements ILocationService{

	@Autowired
	LocationRepository locationRepo;
	
	public Location addLocation(Location loc){
		
		return locationRepo.saveAndFlush(loc);
	}
	
}
