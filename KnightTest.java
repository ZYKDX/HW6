import static org.junit.jupiter.api.Assertions.*;

class KnightTest {
    private Knight piece1;
    private Knight piece2;
    private Knight piece3;
    private Knight piece4;
    private Knight otherPiece1;
    private Knight otherPiece2;
    private Knight otherPiece3;
    private Knight otherPiece4;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        piece1 = new Knight(0,1,Color.WHITE);
        piece2 = new Knight(0,6,Color.WHITE);
        piece3 = new Knight(7,1,Color.BLACK);
        piece4 = new Knight(7,6,Color.BLACK);
        otherPiece1 = new Knight(2,0, Color.BLACK);
        otherPiece2 = new Knight(2,7, Color.BLACK);
        otherPiece3 = new Knight(6,3, Color.WHITE);
        otherPiece4 = new Knight(6,4, Color.WHITE);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getRow() {
        assertEquals(piece1.getRow(), 0);
        assertEquals(piece2.getRow(), 0);
        assertEquals(piece3.getRow(), 7);
        assertEquals(piece4.getRow(), 7);
    }

    @org.junit.jupiter.api.Test
    void getColumn() {
        assertEquals(piece1.getColumn(), 1);
        assertEquals(piece2.getColumn(), 6);
        assertEquals(piece3.getColumn(), 1);
        assertEquals(piece4.getColumn(), 6);
    }

    @org.junit.jupiter.api.Test
    void getColor() {
        assertEquals(piece1.getColor(), Color.WHITE);
        assertEquals(piece2.getColor(), Color.WHITE);
        assertEquals(piece3.getColor(), Color.BLACK);
        assertEquals(piece4.getColor(), Color.BLACK);
    }

    @org.junit.jupiter.api.Test
    void canMove() {
        assertTrue(piece1.canMove(2,0));
        assertTrue(!piece1.canMove(2,1));
        assertTrue(piece2.canMove(2,7));
        assertTrue(!piece2.canMove(1,7));
        assertTrue(piece3.canMove(5,0));
        assertTrue(!piece3.canMove(6,1));
        assertTrue(piece4.canMove(6,4));
        assertTrue(!piece4.canMove(6,5));
    }

    @org.junit.jupiter.api.Test
    void canKill() {
        assertTrue(piece1.canKill(otherPiece1));
        assertTrue(piece2.canKill(otherPiece2));
        assertTrue(piece3.canKill(otherPiece3));
        assertTrue(piece4.canKill(otherPiece4));
    }
}