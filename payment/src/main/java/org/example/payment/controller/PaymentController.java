package org.example.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class PaymentController {

    @GetMapping ("/payment")
    public String payment() {
        return "payment";
    }
}
