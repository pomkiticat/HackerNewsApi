package com.example.hackernews.controller;

import com.example.hackernews.model.Comment;
import com.example.hackernews.model.Stroy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v0")
public class HackerNewsController {

    @GetMapping("/best-stories")
    public List<Stroy> getBestStroies(){
        List<Stroy> stories=new ArrayList<>();
        return stories;
    }

    @GetMapping("/past-stories")
    public List<Stroy> getPastStroies(){
        List<Stroy> stories=new ArrayList<>();
        return stories;
    }
    @GetMapping("/comments")
    public List<Comment> getCommants(){
        List<Comment> comments=new ArrayList<>();
        return comments;
    }
}
