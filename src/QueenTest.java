import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueenTest {
    private Queen piece1;
    private Queen piece2;
    private Queen piece3;
    private Queen piece4;
    private Queen otherPiece1;
    private Queen otherPiece2;
    private Queen otherPiece3;
    private Queen otherPiece4;
    @BeforeEach
    void setUp() {
        piece1 = new Queen(0,2, Color.WHITE);
        piece2 = new Queen(0,5, Color.WHITE);
        piece3 = new Queen(7,2, Color.BLACK);
        piece4 = new Queen(7,5, Color.BLACK);
        otherPiece1 = new Queen(4,6, Color.BLACK);
        otherPiece2 = new Queen(5,5, Color.BLACK);
        otherPiece3 = new Queen(7,3, Color.WHITE);
        otherPiece4 = new Queen(7,0, Color.WHITE);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getColumn() {
        assertEquals(piece1.getColumn(), 2);
        assertEquals(piece2.getColumn(), 5);
        assertEquals(piece3.getColumn(), 2);
        assertEquals(piece4.getColumn(), 5);
    }

    @Test
    void getRow() {
        assertEquals(piece1.getRow(), 0);
        assertEquals(piece2.getRow(), 0);
        assertEquals(piece3.getRow(), 7);
        assertEquals(piece4.getRow(), 7);
    }

    @Test
    void getColor() {
        assertEquals(piece1.getColor(), Color.WHITE);
        assertEquals(piece2.getColor(), Color.WHITE);
        assertEquals(piece3.getColor(), Color.BLACK);
        assertEquals(piece4.getColor(), Color.BLACK);
    }

    @Test
    void canMove() {
        assertTrue(piece1.canMove(6,4));
        assertTrue(!piece1.canMove(4,7));
        assertTrue(piece2.canMove(5,5));
        assertTrue(!piece2.canMove(3,4));
        assertTrue(piece3.canMove(5,7));
        assertTrue(!piece3.canMove(3,5));
        assertTrue(piece4.canMove(4,7));
        assertTrue(!piece4.canMove(0,4));
    }

    @Test
    void canKill() {
        assertTrue(piece1.canKill(otherPiece1));
        assertTrue(piece2.canKill(otherPiece2));
        assertTrue(piece3.canKill(otherPiece3));
        assertTrue(piece4.canKill(otherPiece4));
    }
}