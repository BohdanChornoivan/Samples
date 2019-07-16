package repository;

import entities.Book;
import entities.ReviewOnTheBook;

public class CreateReviewOnBook {

    ReviewOnTheBook reviewOnTheBook;


    public CreateReviewOnBook(Book book, String username, String review) {

        reviewOnTheBook = new ReviewOnTheBook();

        reviewOnTheBook.setUsername(username);
        reviewOnTheBook.setReview(review);
        reviewOnTheBook.setBook(book);
    }

    public ReviewOnTheBook getReviewOnTheBook() {
        return reviewOnTheBook;
    }
}
