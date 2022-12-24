package mehmetari.loginexample.loginexample.model;

import ch.qos.logback.core.joran.spi.NoAutoStart;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;


@Entity
@ToString
public class Post {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String slug;
    private String content;
    private String author;
    private LocalDateTime publishedOn;
    private LocalDateTime updatedOn;

    public Post() {
    }

    public Post(String title, String slug, String content, String author, LocalDateTime publishedOn, LocalDateTime updatedOn) {
        this.title = title;
        this.slug = slug;
        this.content = content;
        this.author = author;
        this.publishedOn = LocalDateTime.now();

    }

    public Post(String title, String slug, String content, String author) {
        this.title = title;
        this.slug = slug;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
