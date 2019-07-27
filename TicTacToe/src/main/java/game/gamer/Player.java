package game.gamer;

import java.util.Random;

public class Player {

    private String name;

    private String mark;

    private Random random;

    public Player(String name, String mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public String getMark() {
        return mark;
    }

    public int randomNumberOnTheBoard(String[][] board) {

        random = new Random();

        return random.nextInt(board.length);
    }
}
