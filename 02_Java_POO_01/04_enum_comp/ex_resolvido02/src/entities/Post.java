package entities;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private Instant moment;
    private String title;
    private String content;
    private Integer likes;

    List<Comment> comments = new ArrayList<>();

    public Post(){
    }

    public Post(Instant moment, String title, String content, Integer likes){
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(title + "\n");
        sb.append(likes + " likes - ");
        sb.append(moment.atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "\n");
        sb.append(content + "\n");
        sb.append("Comments:\n");

        for (Comment c : this.comments) {
            sb.append(c.getText() + "\n");
        }

        return sb.toString();

    }
}
