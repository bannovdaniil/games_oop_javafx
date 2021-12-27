package ru.job4j.chess.firuges.black;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;
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
    public void way() {
        Cell startPosition = Cell.C1;
        Cell endPosition = Cell.G5;
        Cell[] exeptionWays = new Cell[]{ Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        BishopBlack bishopBlack = new BishopBlack(startPosition);
        Cell[] realWay = bishopBlack.way(endPosition);
        assertThat(exeptionWays, is(realWay));
        startPosition = Cell.B1;
        endPosition = Cell.A2;
        exeptionWays = new Cell[]{ Cell.A2};
        BishopBlack bishopBlack2 = new BishopBlack(startPosition);
        realWay = bishopBlack2.way(endPosition);
        assertThat(exeptionWays, is(realWay));
        startPosition = Cell.D4;
        endPosition = Cell.G1;
        exeptionWays = new Cell[]{ Cell.E3, Cell.F2, Cell.G1};
        BishopBlack bishopBlack3 = new BishopBlack(startPosition);
        realWay = bishopBlack3.way(endPosition);
        assertThat(exeptionWays, is(realWay));
        startPosition = Cell.C3;
        endPosition = Cell.A1;
        exeptionWays = new Cell[]{ Cell.B2, Cell.A1};
        BishopBlack bishopBlack4 = new BishopBlack(startPosition);
        realWay = bishopBlack4.way(endPosition);
        assertThat(exeptionWays, is(realWay));
    }


}