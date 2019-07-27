package game.mysql.hibernate;


import game.gamer.Player;
import game.mysql.hibernate.repository.SaveGame;
import game.mysql.hibernate.utils.HibernateUtils;
import game.realization.MarksForBoard;
import game.realization.RealizationGame;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MainHibernate {

    public static SessionFactory sessionFactory;

    public static void main(String[] args) {

        RealizationGame realizationGame = new RealizationGame();

        Player playerB1 = new Player("B1-X", MarksForBoard.MARK_X.getMark());

        Player playerB2 = new Player("B2-0", MarksForBoard.MARK_0.getMark());

        realizationGame.play(playerB1, playerB2);

        sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        SaveGame saveGame = new SaveGame(playerB2.getName(), 2, 1, 5);
        session.save(saveGame.getMatch());
        session.getTransaction().commit();

        sessionFactory.close();
    }

    /**
     * 	`Name` VARCHAR(50) NOT NULL DEFAULT '',
     * 	`Victory` INT(11) NOT NULL DEFAULT '0',
     * 	`Loss` INT(11) NOT NULL,
     * 	`Draw` INT(11) NOT NULL,
     * 	`BOARD` LONGBLOB NOT NULL
     */
}
