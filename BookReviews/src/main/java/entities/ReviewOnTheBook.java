package entities;

import javax.persistence.*;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "review_on_the_books", catalog = "hibernate_demo")
public class ReviewOnTheBook implements java.io.Serializable {

    private Integer reviewId;
    private Book book;

    @Column(nullable = false)
    private String Username;

    @Column(nullable = false)
    private String Review;


    public ReviewOnTheBook() { }

    public ReviewOnTheBook(Book book) {
        this.book = book;
    }

    public ReviewOnTheBook(Integer reviewId, Book book, String username, String review) {
        this.reviewId = reviewId;
        this.book = book;
        Username = username;
        Review = review;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "REVIEW_ID", unique = true, nullable = false)
    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOOK_ID", nullable = false)
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Column(name = "USERNAME")
    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    @Column(name = "REVIEW", length = 400)
    public String getReview() {
        return Review;
    }

    public void setReview(String review) {
        Review = review;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReviewOnTheBook that = (ReviewOnTheBook) o;
        return Objects.equals(book, that.book) &&
                Objects.equals(Username, that.Username) &&
                Objects.equals(Review, that.Review);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, Username, Review);
    }

    @Override
    public String toString() {
        return "ReviewOnTheBook{" +
                "reviewId=" + reviewId +
                ", book=" + book +
                ", Username='" + Username + '\'' +
                ", Review='" + Review + '\'' +
                '}';
    }
}
