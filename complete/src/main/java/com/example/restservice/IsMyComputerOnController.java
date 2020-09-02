package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IsMyComputerOnController {

	private static final String template = "%s";

    @GetMapping("/ismycomputeron")
    public String info(){
        return "Yes.";
    }
}
