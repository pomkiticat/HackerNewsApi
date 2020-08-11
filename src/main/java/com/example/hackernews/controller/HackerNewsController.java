package com.example.hackernews.controller;

import com.example.hackernews.exception.HackerException;
import com.example.hackernews.model.Comment;
import com.example.hackernews.model.Story;
import com.example.hackernews.services.HackerServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v0")
public class HackerNewsController {
    private static final Logger logger = LoggerFactory.getLogger(HackerNewsController.class);

    @Autowired
    public HackerServices services;

    @GetMapping("/best-stories")
    public List<Story> getBestStroies() throws HackerException {
       // CacheControl cc = new CacheControl();
       // cc.setMaxAge(86400);
        List<Story> stories=services.getStories();
        logger.info("best-stories");
        System.out.println("best-stories");
        return stories;
    }

    @GetMapping("/past-stories")
    public List<Story> getPastStroies()throws HackerException{
        List<Story> stories=new ArrayList<>();
        System.out.println("past-stories");
        return stories;
    }
    @GetMapping("/comments/{id}")
    public List<Comment> getCommants(@PathVariable int id)throws HackerException{
        List<Comment> comments=services.getCommant(id);

        return comments;
    }
}
