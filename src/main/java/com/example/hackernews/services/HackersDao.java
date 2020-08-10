package com.example.hackernews.services;

import com.example.hackernews.exception.HackerException;
import com.example.hackernews.model.Comment;
import com.example.hackernews.model.Stroy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HackersDao {

    public List<Stroy> getStories() throws HackerException;
    public List<Comment> getCommant() throws HackerException;
}
