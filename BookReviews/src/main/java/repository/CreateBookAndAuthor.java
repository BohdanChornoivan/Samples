package repository;

import entities.Book;
import org.hibernate.Session;

public class CreateBookAndAuthor {

    Book book;

    public CreateBookAndAuthor(String bookName, String authorName, Session session) {

        book = new Book();

        book.setBookName(bookName);
        book.setAuthor(authorName);
        session.save(book);
    }


    public Book getBook() {
        return book;
    }
}
