package com.example.hackernews.Entity;

import java.io.Serializable;

public class Items implements Serializable {
    private int id;
    private Boolean deleted;
    private Boolean dead;
    private String type;
    private Users by;
    private String text;
    private String url;
    private long time;
    private String title;
    private int score;
    private Items kids;
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

    public Users getBy() {
        return by;
    }

    public void setBy(Users by) {
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

    public Items getKids() {
        return kids;
    }

    public void setKids(Items kids) {
        this.kids = kids;
    }
}
