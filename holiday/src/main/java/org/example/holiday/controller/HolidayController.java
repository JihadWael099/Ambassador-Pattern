package org.example.holiday.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1")
public class HolidayController {


    private final RestTemplate restTemplate;

    public HolidayController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @GetMapping("/holiday")
    public String bookHoliday(){

        String response=restTemplate.getForObject("http://FLIGHT/api/v1/flight", String.class);
        String response2=restTemplate.getForObject("http://PAYMENT/api/v1/payment", String.class);
        return "holiday Booked"+response2+response;
    }
}
