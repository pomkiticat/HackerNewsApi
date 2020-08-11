package com.example.hackernews.controller;

import com.example.hackernews.exception.HackerException;
import com.example.hackernews.services.HackerServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

//@WebMvcTest(HackerNewsController.class)
public class HackerNewsControllerTest {

    @MockBean
    public HackerServices services;

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void getBestStroies_test() throws HackerException {
        RequestBuilder request = MockMvcRequestBuilders
                .get("/best-stories")
                .accept(MediaType.APPLICATION_JSON);

    }

    @Test
    public void getPastStroies_test() throws HackerException {

        RequestBuilder request = MockMvcRequestBuilders
                .get("/past-stories")
                .accept(MediaType.APPLICATION_JSON);
    }

    @Test
    public void getCommants_test() throws HackerException {
        RequestBuilder request = MockMvcRequestBuilders
                .get("/comments")
                .accept(MediaType.APPLICATION_JSON);
    }

}
