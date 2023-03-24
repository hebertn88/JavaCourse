package application;

import entities.Comment;
import entities.Post;

import java.time.Instant;

public class Program {
    public static void main(String[] args) {
        //add Post #1
        Instant moment = Instant.parse("2018-06-21T13:05:44-03:00");
        String title = "Traveling to New Zealand";
        String content = "I'm going to visit this wonderful country!";
        int likes = 12;

        Post post01 = new Post(moment, title, content, likes);
        post01.addComment(new Comment("Have a nice trip"));
        post01.addComment(new Comment("Wow that's awesome!"));

        moment = Instant.parse("2018-07-28T23:14:19-03:00");
        title = "Good night guys";
        content = "See you tomorrow";
        likes = 5;

        // Add Post #2
        Post post02 = new Post(moment, title, content, likes);
        post02.addComment(new Comment("Good night"));
        post02.addComment(new Comment("May the Force be with you"));

        // Print Posts
        System.out.println(post01);
        System.out.println(post02);
    }
}
