package com.company;

public class Comment {

    private String id;
    private String c1;

    public Comment(String id, String c1) {
        this.id = id;
        this.c1 = c1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getC1() {
        return c1;
    }

    public void setC1(String c1) {
        this.c1 = c1;
    }
}

