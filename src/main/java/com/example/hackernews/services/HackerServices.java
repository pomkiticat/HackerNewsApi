package com.example.hackernews.services;

import com.example.hackernews.dto.ItemsDTO;
import com.example.hackernews.exception.HackerException;
import com.example.hackernews.model.Comment;
import com.example.hackernews.model.Story;
import com.example.hackernews.repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


//public class HackerServices implements HackersDao {
@Service
public class HackerServices  {

    @Autowired
    ItemsRepository itemsRepository;

    public List<Story> getStories() throws HackerException {
        List<Story> stroyList = new ArrayList<>();
        String type="story";
        List<ItemsDTO> itemsDTOS=new ArrayList<>();
        try {
           itemsDTOS = itemsRepository.getStoryList(type);
        }catch (Exception ex){
           // throw Exception(ex);
            ex.printStackTrace();
        }
        if (itemsDTOS != null) {
            for (ItemsDTO dto : itemsDTOS) {
                Story stroy = new Story();
                stroy.setId(dto.getId());
                stroy.setBy(dto.getBy().getId());
                // stroy.setDescendants(dto.getd);
                stroy.setScore(dto.getScore());
                stroy.setTitle(dto.getTitle());
                stroy.setTime(dto.getTime());
                stroy.setType(dto.getType());
                stroy.setUrl(dto.getUrl());
            }
        } else {
            throw new HackerException("No data found for story");
        }
        return stroyList;
    }

    public List<Comment> getCommant() throws HackerException {
        List<Comment> commentList = new ArrayList<>();
        List<ItemsDTO> items=new ArrayList<>();
        try {
            items = itemsRepository.getCommandsList();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        if (items != null) {
            for (ItemsDTO dto : items) {
                Comment comment = new Comment();
                //    int kids[]=dto.getKids()
                comment.setId(dto.getId());
                comment.setText(dto.getText());
                comment.setTime(dto.getTime());
                comment.setBy(dto.getBy().getId());
                comment.setType(dto.getType());
            }
        } else {
            throw new HackerException("No data fond for commants");
        }
        return commentList;
    }
}
