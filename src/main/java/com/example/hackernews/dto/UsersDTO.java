package com.example.hackernews.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "users")
public class UsersDTO implements Serializable {
    @Id

    private String id;
    @Column(name="about")
    private String about;
    @Column(name="delay")
    private int delay;
    @Column(name="karma")
    private int karma;
    @Column(name="cretaed")
    private long cretaed;

    @ManyToOne(fetch = FetchType.LAZY)
    private List<ItemsDTO> submitted;

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

    public List<ItemsDTO> getSubmitted() {
        return submitted;
    }

    public void setSubmitted(List<ItemsDTO> submitted) {
        this.submitted = submitted;
    }
}
