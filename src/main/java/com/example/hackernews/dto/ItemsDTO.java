package com.example.hackernews.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name = "items")
public class ItemsDTO implements Serializable {
    @Id
    private int id;
    @Column(name="deleted")
    private Boolean deleted;
    @Column(name="dead")
    private Boolean dead;
    @Column(name="type")
    private String type;
    @Column(name="by")
    private UsersDTO by;
    @Column(name="text")
    private String text;
    @Column(name="url")
    private String url;
    @Column(name="time")
    private long time;
    @Column(name="title")
    private String title;
    @Column(name="score")
    private int score;
   // @Column(name="kids")
    private ItemsDTO kids;
//    parent
//    poll
//            parts
//                    descendants


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Boolean getDead() {
        return dead;
    }

    public void setDead(Boolean dead) {
        this.dead = dead;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UsersDTO getBy() {
        return by;
    }

    public void setBy(UsersDTO by) {
        this.by = by;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public ItemsDTO getKids() {
        return kids;
    }

    public void setKids(ItemsDTO kids) {
        this.kids = kids;
    }
}
