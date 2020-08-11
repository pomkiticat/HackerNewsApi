package com.example.hackernews.services;

import com.example.hackernews.dto.ItemsDTO;
import com.example.hackernews.dto.UsersDTO;
import com.example.hackernews.exception.HackerException;
import com.example.hackernews.model.Comment;
import com.example.hackernews.model.Story;
import com.example.hackernews.repository.ItemsRepository;
import org.junit.jupiter.api.Assertions;
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

    static final String story = "story";
    static final String comment = "comment";
    @Mock
    ItemsRepository itemsRepository;

    @Mock
    HackerServices services;

    @Test
    public void getStories_test_all() throws Exception {


        when(itemsRepository.getStoryList(story)).thenReturn(populateItem());
        Assertions.assertEquals(populateStory().get(0).getType(),services.getStories().get(0).getType());
    }

    @Test
    public void getCommant_test_all() throws Exception {


        when(itemsRepository.getCommandsList(3,comment)).thenReturn(populateItem());
      //  Assertions.assertEquals("comment", );
    }

    @Test
    public void getStories_test_non() throws HackerException {
    }

    @Test
    public void getCommant_test_non() throws HackerException {
    }

    private List<ItemsDTO> populateItem() {

        ItemsDTO dto = new ItemsDTO();
        List<ItemsDTO> dtos = new ArrayList<>();
        dtos.add(dto);
        Set<ItemsDTO> kids = new HashSet<>();
        UsersDTO by = new UsersDTO("user", " about", 8, 4, 875756, dtos);
        ItemsDTO itemsDTO = new ItemsDTO(1, true, true, "type", by, "text", "http://www.test.com", 85865, "title", 6, kids, dto, 9);
        List<ItemsDTO> itemsDTOS = new ArrayList<>();
        itemsDTOS.add(itemsDTO);
        return itemsDTOS;
    }
    int[] kids = {1, 2, 3};
    private List<Story> populateStory() {

        List<Story> stories = new ArrayList<>();
        Story story = new Story("user", 767, 3435, "story", kids, 7, "title", 9, "http://www.test.com");
        stories.add(story);
        return stories;
    }

    private List<Comment> populateComment() {
        List<Comment> comments = new ArrayList<>();
        Comment comment=new Comment("user", 765, 7575,"comment",kids, 8678, "text");
        return comments;
    }

}
