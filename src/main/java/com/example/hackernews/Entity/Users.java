package com.example.hackernews.Entity;

import java.io.Serializable;

public class Users implements Serializable {
    private String id;
    private String about;

    private int delay;
    private int karma;

    private long cretaed;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public int getKarma() {
        return karma;
    }

    public void setKarma(int karma) {
        this.karma = karma;
    }

    public long getCretaed() {
        return cretaed;
    }

    public void setCretaed(long cretaed) {
        this.cretaed = cretaed;
    }
}
