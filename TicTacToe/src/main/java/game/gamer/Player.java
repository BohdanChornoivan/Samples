package game.gamer;

import java.util.Random;

public class Player implements Statistic {

    private final String name;

    private final String mark;

    private Random random;

    private int win;

    private int loss;

    private int draw;

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

    @Override
    public void win() {
        this.win++;
    }

    @Override
    public void loss() {
        this.loss++;
    }

    @Override
    public void draw() {
        this.draw++;
    }

    public int getWin() {
        return win;
    }

    public int getLoss() {
        return loss;
    }

    public int getDraw() {
        return draw;
    }
}
