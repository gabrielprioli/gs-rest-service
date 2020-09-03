package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

	private static final String template = "%s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/echo")
	public Greeting echoRequest(@RequestParam(value = "message", defaultValue = "nothing to say") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
