package com.example.TDD_with_Mockito.services;


import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class IndexService {

    public String getWelcomeMessage(String guest){
        return String.format("You are welcome, %s", guest);
    }
}
