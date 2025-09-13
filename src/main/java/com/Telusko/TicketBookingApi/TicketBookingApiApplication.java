package com.Telusko.TicketBookingApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Ticket Booking Api",
                version = "v1.0",
                description = "This API will take user details and generate tickets"
        ),
        servers = @Server(
                url = "http://localhost:9001/TicketBookingApi",
                description = "This app is deployed on the following server"
        )
)
public class TicketBookingApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketBookingApiApplication.class, args);
    }
}
