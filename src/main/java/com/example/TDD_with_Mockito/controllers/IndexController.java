package com.example.TDD_with_Mockito.controllers;

import com.example.TDD_with_Mockito.services.IndexService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class IndexController {

    private IndexService service;

    @GetMapping("/")
    public @ResponseBody String indexPath() {
        return "Welcome to TDD App";
    }

    @GetMapping("/welcome")
    public String alternativeIndexPath() {
        return service.getWelcomeMessage("Emmanuel");
    }


}
