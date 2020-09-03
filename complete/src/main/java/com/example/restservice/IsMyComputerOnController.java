package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IsMyComputerOnController {

    @GetMapping("/ismycomputeron")
    public String ismycomputeronRequest(){
        return "Yes.";
    }
}
