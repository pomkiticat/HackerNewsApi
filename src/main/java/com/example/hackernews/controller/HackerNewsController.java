package com.example.hackernews.controller;

import com.example.hackernews.exception.HackerException;
import com.example.hackernews.model.Comment;
import com.example.hackernews.model.Stroy;
import com.example.hackernews.services.HackerServices;
import com.example.hackernews.services.HackersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v0")
public class HackerNewsController {

    @Autowired
    public HackerServices services;

    @GetMapping("/best-stories")
    public List<Stroy> getBestStroies() throws HackerException {
        List<Stroy> stories=services.getStories();
        System.out.println("best-stories");
        return stories;
    }

    @GetMapping("/past-stories")
    public List<Stroy> getPastStroies()throws HackerException{
        List<Stroy> stories=new ArrayList<>();
        System.out.println("past-stories");
        return stories;
    }
    @GetMapping("/comments")
    public List<Comment> getCommants()throws HackerException{
        List<Comment> comments=services.getCommant();

        return comments;
    }
}
