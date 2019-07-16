import entities.Book;
import entities.ReviewOnTheBook;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import repository.CreateBookAndAuthor;
import repository.CreateReviewOnBook;
import utils.HibernateUtils;


public class HibernateMain {

    public static SessionFactory sessionFactory;

    public static void main(String[] args) {

        sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();



        CreateBookAndAuthor book1 = new CreateBookAndAuthor("A Mind for Numbers: How to Excel at Math and Science", "Oakley Barbara", session);

        CreateReviewOnBook review1_1 = new CreateReviewOnBook(book1.getBook(), "David", "Despite the title of the book, most of the advice here is appropriate for just about any subject. ");

        book1.getBook().getReviewOnTheBooks().add(review1_1.getReviewOnTheBook());
        session.save(review1_1.getReviewOnTheBook());

        CreateReviewOnBook review2_1 = new CreateReviewOnBook(book1.getBook(), "Stephan", "Fantastic learning hacks! How our brain works concerning learning, retaining. We learn all our lives and sometimes we have exams - this book will tell you how to prepare well. The title A Mind for Numbers is misleading, it's about learning in general.");

        book1.getBook().getReviewOnTheBooks().add(review2_1.getReviewOnTheBook());
        session.save(review2_1.getReviewOnTheBook());



        CreateBookAndAuthor book2 = new CreateBookAndAuthor("Arms and the Man", "G.B.Shaw", session);

        CreateReviewOnBook review1_2 = new CreateReviewOnBook(book2.getBook(), "Molli", "I liked this book. People who are interested in national disasters and US history as well as immigration will most probably be interested in reading this book.");

        book2.getBook().getReviewOnTheBooks().add(review1_2.getReviewOnTheBook());
        session.save(review1_2.getReviewOnTheBook());

        CreateReviewOnBook review2_2 = new CreateReviewOnBook(book2.getBook(), "Michael", "One of the things that was especially interesting was that there were no safety laws at work.");

        book2.getBook().getReviewOnTheBooks().add(review2_2.getReviewOnTheBook());
        session.save(review2_2.getReviewOnTheBook());



        CreateBookAndAuthor book3 = new CreateBookAndAuthor("Nineteen Eighty-four", "George Orwell", session);

        CreateReviewOnBook review1_3 = new CreateReviewOnBook(book3.getBook(), "Sei", "Some people may not like this book because it is very depressing, but it is an important event in history to remember.");

        book3.getBook().getReviewOnTheBooks().add(review1_3.getReviewOnTheBook());
        session.save(review1_3.getReviewOnTheBook());

        CreateReviewOnBook review2_3 = new CreateReviewOnBook(book3.getBook(), "Sem", "This book was very well written.");

        book3.getBook().getReviewOnTheBooks().add(review2_3.getReviewOnTheBook());
        session.save(review2_3.getReviewOnTheBook());



        CreateBookAndAuthor book4 = new CreateBookAndAuthor("Madhushala", "Harivansh Rai Bachchan", session);

        CreateReviewOnBook review1_4 = new CreateReviewOnBook(book4.getBook(), "Leni", "It's an easy chapter book with pictures on every page.");

        book4.getBook().getReviewOnTheBooks().add(review1_4.getReviewOnTheBook());
        session.save(review1_4.getReviewOnTheBook());

        CreateReviewOnBook review2_4 = new CreateReviewOnBook(book4.getBook(), "Strey", "I appreciated Frankenstein's Cat for its fascinating explanation about the often baffling subject of bioengineering and its sister sciences. ");

        book4.getBook().getReviewOnTheBooks().add(review2_4.getReviewOnTheBook());
        session.save(review2_4.getReviewOnTheBook());



        CreateBookAndAuthor book5 = new CreateBookAndAuthor("Principles of Sociology", "Herbert Spencer", session);

        CreateReviewOnBook review1_5 = new CreateReviewOnBook(book5.getBook(), "Nick", "This book provides a well-rounded summary of these complicated sciences without being boring or simply factual.");

        book5.getBook().getReviewOnTheBooks().add(review1_5.getReviewOnTheBook());
        session.save(review1_5.getReviewOnTheBook());

        CreateReviewOnBook review2_5 = new CreateReviewOnBook(book5.getBook(), "Bill", "I would highly recommend this book to anyone who desires a guide to the future of biological science and technology.");

        book5.getBook().getReviewOnTheBooks().add(review2_5.getReviewOnTheBook());
        session.save(review2_5.getReviewOnTheBook());



        CreateBookAndAuthor book6 = new CreateBookAndAuthor("Budhosagor Dhukhor Geisha Aru Mohammed Musa", "Indira Goswami", session);

        CreateReviewOnBook review1_6 = new CreateReviewOnBook(book6.getBook(), "Harry", "I really think everyone would like the book.");

        book6.getBook().getReviewOnTheBooks().add(review1_6.getReviewOnTheBook());
        session.save(review1_6.getReviewOnTheBook());

        CreateReviewOnBook review2_6 = new CreateReviewOnBook(book6.getBook(), "Oliver", "The glossary of facts in the back of About Marsupials is the most useful part.");

        book6.getBook().getReviewOnTheBooks().add(review2_6.getReviewOnTheBook());
        session.save(review2_6.getReviewOnTheBook());



        CreateBookAndAuthor book7 = new CreateBookAndAuthor("Pride and Prejudice", "Jane Austen", session);

        CreateReviewOnBook review1_7 = new CreateReviewOnBook(book7.getBook(), "Thomas", "When I first saw the previews for this movie, it had me interested.");

        book7.getBook().getReviewOnTheBooks().add(review1_7.getReviewOnTheBook());
        session.save(review1_7.getReviewOnTheBook());

        CreateReviewOnBook review2_7 = new CreateReviewOnBook(book7.getBook(), "George", "This movie is dark and disturbing, however, it is equally smart and stylistic.");

        book7.getBook().getReviewOnTheBooks().add(review2_7.getReviewOnTheBook());
        session.save(review2_7.getReviewOnTheBook());



        CreateBookAndAuthor book8 = new CreateBookAndAuthor("Interpreter of Maldives", "Jhumpa Lahiri", session);

        CreateReviewOnBook review1_8 = new CreateReviewOnBook(book8.getBook(), "Olivia", "Norton plays an average-Joe who is living a dead-end life. He needs something to change his life.");

        book8.getBook().getReviewOnTheBooks().add(review1_8.getReviewOnTheBook());
        session.save(review1_8.getReviewOnTheBook());

        CreateReviewOnBook review2_8 = new CreateReviewOnBook(book8.getBook(), "Poppy", "As for it being important, don't worry.");

        book8.getBook().getReviewOnTheBooks().add(review2_8.getReviewOnTheBook());
        session.save(review2_8.getReviewOnTheBook());



        CreateBookAndAuthor book9 = new CreateBookAndAuthor("Avigyan Sakuntalam", "Kalidas", session);

        CreateReviewOnBook review1_9 = new CreateReviewOnBook(book9.getBook(), "Brown", "I can read this book over and over again.");

        book9.getBook().getReviewOnTheBooks().add(review1_9.getReviewOnTheBook());
        session.save(review1_9.getReviewOnTheBook());

        CreateReviewOnBook review2_9 = new CreateReviewOnBook(book9.getBook(), "Davies", "K. Rowling should be commended for getting so many people reading and excited by books. ");

        book9.getBook().getReviewOnTheBooks().add(review2_9.getReviewOnTheBook());
        session.save(review2_9.getReviewOnTheBook());



        CreateBookAndAuthor book10 = new CreateBookAndAuthor("The Keeper of the Dead", "Keki N. Daruwalla", session);

        CreateReviewOnBook review1_10 = new CreateReviewOnBook(book10.getBook(), "Smith", "There are characters in this book that will remind us of all the people we have met.");

        book10.getBook().getReviewOnTheBooks().add(review1_10.getReviewOnTheBook());
        session.save(review1_10.getReviewOnTheBook());

        CreateReviewOnBook review2_10 = new CreateReviewOnBook(book10.getBook(), "Sophie", "The narrow path had opened suddenly on to the edge of a great black lake.");

        book10.getBook().getReviewOnTheBooks().add(review2_10.getReviewOnTheBook());
        session.save(review2_10.getReviewOnTheBook());

        session.getTransaction().commit();
        sessionFactory.close();


    }
}
