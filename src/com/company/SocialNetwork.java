package com.company;

public class SocialNetwork {

    private String id;
    private User user;
    private Post post;
    private Comment comment;
    private String u3;
    private Comment c1;
    private String user2;
    private String u1;
    private String u2;
    private String p2;
    private String u4;
    private String p1;

    public void addUser(User user) {
        this.user = user;
    System.out.println("\n" + user.getNome() +" Entrou na rede social");
    }

    public void addFriendly(String u1, String u2) {
        this.u1 = u1;
        this.u2 = u2;

        System.out.println( "\n" + u1 + " se tornou amigo de " + u2);
    }

    public void addPost(String u2, Post post) {
        this.post = post;
        this.u2 = u2;
        System.out.println("\nNovo post de " + u2 + ": \n" + post.getPost());
    }

    public void addComment(String u3, String user2, String p1, Comment c1) {
        this.u3 = u3;
        this.user2 = user2;
        this.p1 = p1;
        this.c1 = c1;
        this.comment = comment;
        System.out.println("\nNovo comentário de: " + u3 + " no post de " + user2);
        System.out.println(c1.getC1());
    }

    public void printUpdates() {
        this.post = post;
        this.comment = comment;
        this.user = user;

    }

    public void liked(String u4, String u2, String p2) {
        this.u4 = u4;
        this.u2 = u2;
        this.p2 = p2;
        System.out.println(u4 + " curtiu o post de " + u2);
    }
}
