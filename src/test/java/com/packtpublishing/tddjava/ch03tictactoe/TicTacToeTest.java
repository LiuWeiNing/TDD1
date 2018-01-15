package com.packtpublishing.tddjava.ch03tictactoe;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Created by LIUMI8 on 1/15/2018.
 */
public class TicTacToeTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private TicTacToe ticTacToe;

    @Before
    public final void before() {
        ticTacToe = new TicTacToe();
    }

    @Test
    public void whenXOutSiteBoardThenRuntimeException() {
        expectedException.expect(RuntimeException.class);
        ticTacToe.play(5, 2);
    }

    @Test
    public void whenYOutsiteBoardThenRuntimeException() {
        expectedException.expect(RuntimeException.class);
        ticTacToe.play(2, 5);
    }

    @Test
    public void whenOccupiedThenRuntimeException() {
        ticTacToe.play(2, 1);
        expectedException.expect(RuntimeException.class);
        ticTacToe.play(2, 1);
    }
}
