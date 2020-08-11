package com.example.hackernews.model;

public class Story {
    private String by;
    private int id;
    private long time;
    private String type;
    private int kids[];
    private int score;
    private String title;
    private int descendants;
    private String url;

    public int[] getKids() {
        return kids;
    }

    public void setKids(int[] kids) {
        this.kids = kids;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDescendants() {
        return descendants;
    }

    public void setDescendants(int descendants) {
        this.descendants = descendants;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Story(String by, int id, long time, String type, int[] kids, int score, String title, int descendants, String url) {
        this.by = by;
        this.id = id;
        this.time = time;
        this.type = type;
        this.kids = kids;
        this.score = score;
        this.title = title;
        this.descendants = descendants;
        this.url = url;
    }

    public Story() {
    }
}
