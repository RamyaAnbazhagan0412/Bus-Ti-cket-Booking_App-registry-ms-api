package com.bus_ticket_booking_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BusTicketBookingApiRegistryMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusTicketBookingApiRegistryMsApiApplication.class, args);
	}

}
