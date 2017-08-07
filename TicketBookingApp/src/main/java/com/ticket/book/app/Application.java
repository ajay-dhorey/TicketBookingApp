package com.ticket.book.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ticket.book.app.model.Location;
import com.ticket.book.app.model.Theater;
import com.ticket.book.app.model.repositories.LocationRepository;
import com.ticket.book.app.model.repositories.TheaterRepository;





@SpringBootApplication
public class Application {
	
	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	@Autowired
	private LocationRepository locationRepostiory;

	@Autowired
	private TheaterRepository theaterRepostiory;
	

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String args[]) {
		SpringApplication.run(Application.class);
	}
	
	@Bean
	public CommandLineRunner init(){
		
		return (args) -> {
			Location location = locationRepostiory.save(new Location("Kothrud","411008"));
			Theater theater1 = theaterRepostiory.save( new Theater("Krisna Colony",location)); 
			Theater theater2 = theaterRepostiory.save( new Theater("Vidya Nagar",location));
			logger.info("location found with findAll");
			logger.info("-------------------------");
			for(Location loc:locationRepostiory.findAll()) {
				logger.info(loc.toString());
				logger.info("-------------------------");
				logger.info("Theaters found at location : " + loc.getLocationName());
				for(Theater theater:theaterRepostiory.findByLocation(loc)) {
					logger.info(theater.toString());
					logger.info("-------------------------");
					
				}
				logger.info("-------------------------");
			}
			logger.info("-------------------------");
			
			
		};
	}	
}
