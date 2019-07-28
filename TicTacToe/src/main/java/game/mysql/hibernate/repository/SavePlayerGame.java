package game.mysql.hibernate.repository;

import game.gamer.Player;
import game.mysql.hibernate.entities.Match;

public class SavePlayerGame {

    private Match match;

    public SavePlayerGame(Player player) {

        match = new Match();

        match.setName(player.getName());
        match.setVictory(player.getWin());
        match.setLoss(player.getLoss());
        match.setDraw(player.getDraw());
    }

    public Match getMatch() {
        return match;
    }
}
