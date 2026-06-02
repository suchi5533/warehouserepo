package com.ats.warehouse.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@PostMapping("/github-webhook")
    public ResponseEntity<String> githubWebhook(
            @RequestBody(required = false) String payload) {

        System.out.println("===== GitHub Webhook Received =====");
        System.out.println(payload);

        return ResponseEntity.ok("Webhook received successfully");
    }
	
@GetMapping("/test")
public String testApi()
{
    return "warehouse management system in Fiat ASRS";
}
@GetMapping("/home")
public String homeScrren()
{
	return "home screen of asrs"; 
}


@GetMapping("/dashboard")
public String dashScrren()
{
	return "Dashboard screen of asrs WMS";
}

}