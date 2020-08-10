package com.example.hackernews.services;

import com.example.hackernews.dto.ItemsDTO;
import com.example.hackernews.exception.HackerException;
import com.example.hackernews.model.Comment;
import com.example.hackernews.model.Stroy;
import com.example.hackernews.repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class HackerServices implements HackersDao {

    @Autowired
    ItemsRepository itemsRepository;

    public List<Stroy> getStories() throws HackerException {
        List<Stroy> stroyList = new ArrayList<>();
        List<ItemsDTO> itemsDTOS = itemsRepository.getStoryList();
        for (ItemsDTO dto : itemsDTOS) {
            Stroy stroy = new Stroy();
            stroy.setId(dto.getId());
            stroy.setBy(dto.getBy().getId());
            // stroy.setDescendants(dto.getd);
            stroy.setScore(dto.getScore());
            stroy.setTitle(dto.getTitle());
            stroy.setTime(dto.getTime());
            stroy.setType(dto.getType());
            stroy.setUrl(dto.getUrl());
        }
        return stroyList;
    }

    public List<Comment> getCommant() throws HackerException{
        List<Comment> commentList = new ArrayList<>();
        List<ItemsDTO> items=itemsRepository.getCommandsList();

        for(ItemsDTO dto:items){
            Comment comment=new Comment();
        //    int kids[]=dto.getKids()
            comment.setId(dto.getId());
            comment.setText(dto.getText());
            comment.setTime(dto.getTime());
            comment.setBy(dto.getBy().getId());
            comment.setType(dto.getType());
        }
        return commentList;
    }
}
