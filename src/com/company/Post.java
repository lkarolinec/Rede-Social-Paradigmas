package com.company;

public class Post {

    private String id;
    private String post;
    private int like;
    private Comment coments;

    public Post(String id, String post) {
        this.id = id;
        this.post = post;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getLike() {
        return like;
    }

    public void setLike() {
        this.like +=1;
    }

    public Comment getComents() {
        return coments;
    }

    public void setComents(Comment coments) {
        this.coments = coments;
    }
}
