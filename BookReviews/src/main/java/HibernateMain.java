import entities.Book;
import entities.ReviewOnTheBook;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.HibernateUtils;


public class HibernateMain {

    public static SessionFactory sessionFactory;

    public static void main(String[] args) {

        sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Book book = new Book();

        book.setBookName("A Mind for Numbers: How to Excel at Math and Science");
        book.setAuthor("Oakley Barbara");
        session.save(book);

        ReviewOnTheBook review = new ReviewOnTheBook();
        review.setUsername("Stephan");
        review.setReview("Fantastic learning hacks! How our brain works concerning learning, retaining. Everyone should read this, every pupil/student in school. We learn all our lives and sometimes we have exams - this book will tell you how to prepare well. The title A Mind for Numbers is misleading, it's about learning in general.");
        review.setBook(book);

        book.getReviewOnTheBooks().add(review);
        session.save(review);

        ReviewOnTheBook review1 = new ReviewOnTheBook();
        review1.setUsername("Bryn");
        review1.setReview("Probably some of the advice in the book is good. I just wasn't in the target audience. I like math, I'm very good at math, and this book is for those who struggle.");
        review1.setBook(book);

        book.getReviewOnTheBooks().add(review1);
        session.save(review1);

        session.getTransaction().commit();
        sessionFactory.close();


    }
}
