import static org.junit.jupiter.api.Assertions.*;

class BishopTest {

    private Bishop piece1;
    private Bishop piece2;
    private Bishop piece3;
    private Bishop piece4;
    private Bishop otherPiece1;
    private Bishop otherPiece2;
    private Bishop otherPiece3;
    private Bishop otherPiece4;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        piece1 = new Bishop(0,2,Color.WHITE);
        piece2 = new Bishop(0,5,Color.WHITE);
        piece3 = new Bishop(7,2,Color.BLACK);
        piece4 = new Bishop(7,5,Color.BLACK);
        otherPiece1 = new Bishop(2,0,Color.BLACK);
        otherPiece2 = new Bishop(3,2,Color.BLACK);
        otherPiece3 = new Bishop(4,5,Color.WHITE);
        otherPiece4 = new Bishop(2,0,Color.WHITE);
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
        assertEquals(piece1.getColumn(), 2);
        assertEquals(piece2.getColumn(), 5);
        assertEquals(piece3.getColumn(), 2);
        assertEquals(piece4.getColumn(), 5);
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
        assertTrue(piece1.canMove(3,5));
        assertTrue(!piece1.canMove(4,2));
        assertTrue(piece2.canMove(2,3));
        assertTrue(!piece2.canMove(3,5));
        assertTrue(piece3.canMove(5,4));
        assertTrue(!piece3.canMove(4,2));
        assertTrue(piece4.canMove(2,0));
        assertTrue(!piece4.canMove(7,7));
    }

    @org.junit.jupiter.api.Test
    void canKill() {
        assertTrue(piece1.canKill(otherPiece1));
        assertTrue(piece2.canKill(otherPiece2));
        assertTrue(piece3.canKill(otherPiece3));
        assertTrue(piece4.canKill(otherPiece4));
    }
}