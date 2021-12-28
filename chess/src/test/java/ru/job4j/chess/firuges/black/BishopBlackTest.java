package ru.job4j.chess.firuges.black;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

public class BishopBlackTest {

    @Test
    public void position() {
        Cell exception = Cell.C1;
        BishopBlack bishopBlack = new BishopBlack(exception);
        Cell position = bishopBlack.position();
        assertThat(exception, is(position));
    }

    @Test
    public void copy() {
        Cell position = Cell.C1;
        Cell exception = Cell.G5;
        BishopBlack bishopBlack = new BishopBlack(position);
        BishopBlack bishopBlack2 = (BishopBlack) bishopBlack.copy(exception);
        assertThat(exception, is(bishopBlack2.position()));
    }

    @Test
    public void whenC1toG5wayThenTrue() {
        Cell startPosition = Cell.C1;
        Cell endPosition = Cell.G5;
        Cell[] exeptionWays = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        BishopBlack bishopBlack = new BishopBlack(startPosition);
        Cell[] realWay = bishopBlack.way(endPosition);
        assertThat(exeptionWays, is(realWay));
    }

    @Test
    public void whenB1toA2wayThenTrue() {
        Cell startPosition = Cell.B1;
        Cell endPosition = Cell.A2;
        Cell[] exeptionWays = new Cell[]{Cell.A2};
        BishopBlack bishopBlack2 = new BishopBlack(startPosition);
        Cell[] realWay = bishopBlack2.way(endPosition);
        assertThat(exeptionWays, is(realWay));
    }

    @Test
    public void whenD4toG1wayThenTrue() {
        Cell startPosition = Cell.D4;
        Cell endPosition = Cell.G1;
        Cell[] exeptionWays = new Cell[]{Cell.E3, Cell.F2, Cell.G1};
        BishopBlack bishopBlack3 = new BishopBlack(startPosition);
        Cell[] realWay = bishopBlack3.way(endPosition);
        assertThat(exeptionWays, is(realWay));
    }

    @Test
    public void whenC3toA1wayThenTrue() {
        Cell startPosition = Cell.C3;
        Cell endPosition = Cell.A1;
        Cell[] exeptionWays = new Cell[]{Cell.B2, Cell.A1};
        BishopBlack bishopBlack4 = new BishopBlack(startPosition);
        Cell[] realWay = bishopBlack4.way(endPosition);
        assertThat(exeptionWays, is(realWay));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenC3toA3wayThenFalse() {
        Cell startPosition = Cell.C3;
        Cell endPosition = Cell.A3;
        BishopBlack bishopBlack4 = new BishopBlack(startPosition);
        Cell[] realWay = bishopBlack4.way(endPosition);
   }

}