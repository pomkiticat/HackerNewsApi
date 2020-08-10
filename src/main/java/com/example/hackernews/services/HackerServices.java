package com.example.hackernews.services;

import com.example.hackernews.model.Comment;
import com.example.hackernews.model.Stroy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HackerServices {

    public List<Stroy>getStories(){
        List<Stroy> stroyList=new ArrayList<>();
        return stroyList;
    }

    public  List<Comment> getCommant(){
        List<Comment> commentList=new ArrayList<>();
        return commentList;
    }
}
