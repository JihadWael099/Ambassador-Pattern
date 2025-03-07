package org.example.flight.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class FlightController {


    @RequestMapping("/flight")
    public String bookFlight(){
        return "flight booked";
    }
}
