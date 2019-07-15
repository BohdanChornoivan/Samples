package entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "books", catalog = "hibernate_demo",  uniqueConstraints = {
        @UniqueConstraint(columnNames = "BOOK_NAME"),
        @UniqueConstraint(columnNames = "AUTHOR") })
public class Book implements java.io.Serializable {

    private Integer bookId;

    private String author;

    private String bookName;

    private Set<ReviewOnTheBook> reviewOnTheBooks = new HashSet<ReviewOnTheBook>(0);

    public Book() { }

    public Book(String author, String bookName) {
        this.author = author;
        this.bookName = bookName;
    }

    public Book(Set<ReviewOnTheBook> reviewOnTheBooks, String author, String bookName) {
        this.reviewOnTheBooks = reviewOnTheBooks;
        this.author = author;
        this.bookName = bookName;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "review")
    public Set<ReviewOnTheBook> getReviewOnTheBooks() {
        return this.reviewOnTheBooks;
    }

    public void setReviewOnTheBooks(Set<ReviewOnTheBook> reviewOnTheBooks) {
        this.reviewOnTheBooks = reviewOnTheBooks;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "BOOK_ID", unique = true, nullable = false)
    public Integer getBookId() {
        return this.bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    @Column(name = "AUTHOR", unique = true, nullable = false, length = 30)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Column(name = "BOOK_NAME", unique = true, nullable = false, length = 45, columnDefinition="LONGBLOB NOT NULL")
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) &&
                Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bookName);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", author='" + author + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
