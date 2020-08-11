package com.example.hackernews.model;

public class Comment {
    private String by;
    private int id;
    private long time;
    private String type;
    private int kids[];
    private int parent;
    private String text;

    public int[] getKids() {
        return kids;
    }

    public void setKids(int[] kids) {
        this.kids = kids;
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public Comment(String by, int id, long time, String type, int[] kids, int parent, String text) {
        this.by = by;
        this.id = id;
        this.time = time;
        this.type = type;
        this.kids = kids;
        this.parent = parent;
        this.text = text;
    }

    public Comment() {
    }
}
