package com.example.restservice;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ExternalRequestController {

    @GetMapping("/external")
    public static String executeExternalRequests() {
        String uri;

        uri = "https://university.dynatrace.com";
        executeRequest(uri);

        uri = "https://assistant.dynatrace.com";
        executeRequest(uri);

        uri = "https://help.dynatrace.com";
        executeRequest(uri);

        return "External requests were called.";
    }

    private static void executeRequest(String uri) {
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> request = new HttpEntity<>("");
        ResponseEntity<String> response = restTemplate.exchange(uri, HttpMethod.GET, request, String.class);

        System.out.println(response.getStatusCode());
    }
}
