package com.example.hackernews.services;

import com.example.hackernews.dto.ItemsDTO;
import com.example.hackernews.dto.UsersDTO;
import com.example.hackernews.exception.HackerException;
import com.example.hackernews.model.Story;
import com.example.hackernews.repository.ItemsRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class HackerServicesTest {
    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

  @Mock
    ItemsRepository itemsRepository;

    @Test
    public void getStories_test_all() throws Exception {
        String type="story";

        when(itemsRepository.getStoryList(type)).thenReturn(populateItem());
       // assertEquals();
    }

    @Test
    public void getCommant_test_all() throws Exception {


        when(itemsRepository.getCommandsList()).thenReturn(populateItem());
    }

    @Test
    public void getStories_test_non() throws HackerException {
    }

    @Test
    public void getCommant_test_non() throws HackerException {
    }

    public List<ItemsDTO> populateItem(){
        int[] ar={1,2,3} ;
        ItemsDTO dto=new ItemsDTO();
        List<ItemsDTO> dtos=new ArrayList<>();
        dtos.add(dto);
        Set<ItemsDTO> kids =new HashSet<>();
        UsersDTO by=new UsersDTO ("user", " about", 8, 4, 875756, dtos);
        ItemsDTO itemsDTO=new ItemsDTO(1, true, true, "type",  by, "text", "http://www.test.com", 85865, "title", 6,  kids, dto, 9);
        List<ItemsDTO> itemsDTOS=new ArrayList<>();
        itemsDTOS.add(itemsDTO);
        return itemsDTOS;
    }

}
