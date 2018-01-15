package com.packtpublishing.tddjava.ch03tictactoe;

/**
 * Created by LIUMI8 on 1/15/2018.
 */
public class TicTacToe {

    public void play(int x, int y) {
        if (x < 1 || x > 3) {
            throw new RuntimeException("x is outsite board");
        }
        if (y < 1 || y > 3) {
            throw new RuntimeException("y is outsite board");
        }
    }
}
