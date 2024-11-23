package com.aiabdelwahab.serviceA.controller;
import com.aiabdelwahab.serviceA.Models.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController {

    @GetMapping("/serviceA/data")
    public ResponseEntity<Response> getData() {
        return ResponseEntity.ok(new Response(123,"Hello from Service A"));
    }

}