package com.ticket.book.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.book.app.model.Location;
import com.ticket.book.app.service.ILocationService;

@RestController
public class LocationController {

	@Autowired
	ILocationService locationService;
	
	@PostMapping(value="/location")
	public ResponseEntity<Location> addLocation(@RequestBody Location loc){
		
		return new ResponseEntity<Location>(locationService.addLocation(loc),HttpStatus.OK);
	}
	@RequestMapping(value="getloc")
	public ResponseEntity<Integer>	getLoc(){
		
	   return new ResponseEntity<Integer>(new Integer(12), HttpStatus.OK);
	}
		
	
}
