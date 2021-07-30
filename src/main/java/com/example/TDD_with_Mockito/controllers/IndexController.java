package com.example.TDD_with_Mockito.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public ResponseEntity<String> indexPath(){
        return ResponseEntity.ok( "Welcome to TDD App");
    }

    @GetMapping("/welcome")
    public String alternativeIndexPath(){
        return  "you are welcome to the alternative index path for testing";
    }
}
