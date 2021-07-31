package com.example.TDD_with_Mockito.controllers;

import com.example.TDD_with_Mockito.services.IndexService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class IndexController {

    private IndexService service;

    @GetMapping("/")
    public ResponseEntity<String> indexPath() {
        return ResponseEntity.ok("Welcome to TDD App");
    }

    @GetMapping("/welcome")
    public String alternativeIndexPath() {
        return service.getWelcomeMessage("Emmanuel");
    }


}
