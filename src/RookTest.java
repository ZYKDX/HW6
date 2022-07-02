import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RookTest {
    private Rook piece1;
    private Rook piece2;
    private Rook piece3;
    private Rook piece4;
    private Rook otherPiece1;
    private Rook otherPiece2;
    private Rook otherPiece3;
    private Rook otherPiece4;

    @BeforeEach
    void setUp() {
        piece1 = new Rook(0,2, Color.WHITE);
        piece2 = new Rook(0,5, Color.WHITE);
        piece3 = new Rook(7,2, Color.BLACK);
        piece4 = new Rook(7,5, Color.BLACK);
        otherPiece1 = new Rook(0,4, Color.BLACK);
        otherPiece2 = new Rook(5,5, Color.BLACK);
        otherPiece3 = new Rook(7,4, Color.WHITE);
        otherPiece4 = new Rook(3,5, Color.WHITE);
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void canMove() {
        assertTrue(piece1.canMove(5,2));
        assertTrue(!piece1.canMove(4,5));
        assertTrue(piece2.canMove(2,5));
        assertTrue(!piece2.canMove(3,4));
        assertTrue(piece3.canMove(7,2));
        assertTrue(!piece3.canMove(4,5));
        assertTrue(piece4.canMove(7,4));
        assertTrue(!piece4.canMove(0,4));
    }

    @Test
    void canKill() {
        assertTrue(piece1.canKill(otherPiece1));
        assertTrue(piece2.canKill(otherPiece2));
        assertTrue(piece3.canKill(otherPiece3));
        assertTrue(piece4.canKill(otherPiece4));
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
}