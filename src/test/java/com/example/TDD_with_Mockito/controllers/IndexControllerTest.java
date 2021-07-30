package com.example.TDD_with_Mockito.controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(IndexController.class)
class IndexControllerTest {

    @Autowired
    private MockMvc mvc;
    @Test
    @DisplayName("A test to assert the index controller")
    void indexPath() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        String expected ="Welcome to TDD App";
        String actual = result.getResponse().getContentAsString();
        assertEquals(expected, actual);
    }

    @DisplayName("should test a controller method like a regular java se method")
    @Test
    void alternativeIndexPathTest(){
        IndexController controller = new IndexController();
        String expected =  "you are welcome to the alternative index path for testing";
        assertEquals(expected, controller.alternativeIndexPath());
    }
}