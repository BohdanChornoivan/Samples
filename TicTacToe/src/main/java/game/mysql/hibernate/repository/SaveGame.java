package game.mysql.hibernate.repository;

import game.mysql.hibernate.entities.Match;

public class SaveGame {

    Match match;

    public SaveGame(String name, Integer victory, Integer loss, Integer draw) {

        match = new Match();

        match.setName(name);
        match.setVictory(victory);
        match.setLoss(loss);
        match.setDraw(draw);
    }

    public Match getMatch() {
        return match;
    }
}
