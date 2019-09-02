package com.tetris.Game.logic;

public interface ControlGame {

    void move_left(int x, int y);
    void move_right(int x, int y);
    void turn_left(int x, int y);
    void turn_right(int x, int y);
    void down(int x, int y);
    void full_down(int x, int y);
}
