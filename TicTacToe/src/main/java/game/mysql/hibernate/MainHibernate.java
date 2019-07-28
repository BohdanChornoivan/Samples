package game.mysql.hibernate;


import game.gamer.Player;
import game.mysql.hibernate.repository.SavePlayerGame;
import game.mysql.hibernate.utils.HibernateUtils;
import game.realization.MarksForBoard;
import game.realization.RealizationGame;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MainHibernate {

    protected static SessionFactory sessionFactory;

    public static void main(String[] args) {


        Player playerB1 = new Player("B1-X", MarksForBoard.MARK_X.getMark());

        Player playerB2 = new Player("B2-0", MarksForBoard.MARK_0.getMark());


        new RealizationGame().play(playerB1,playerB2);
        new RealizationGame().play(playerB1,playerB2);
        new RealizationGame().play(playerB1,playerB2);
        new RealizationGame().play(playerB1,playerB2);
        new RealizationGame().play(playerB1,playerB2);
        new RealizationGame().play(playerB1,playerB2);

        sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        SavePlayerGame savePlayer1 = new SavePlayerGame(playerB1);
        session.save(savePlayer1.getMatch());

        SavePlayerGame savePlayer2 = new SavePlayerGame(playerB2);
        session.save(savePlayer2.getMatch());

        session.getTransaction().commit();

        sessionFactory.close();
    }
}
