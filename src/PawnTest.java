import static org.junit.jupiter.api.Assertions.*;

class PawnTest {

    private Pawn piece1;
    private Pawn piece2;
    private Pawn piece3;
    private Pawn piece4;
    private Pawn otherPiece1;
    private Pawn otherPiece2;
    private Pawn otherPiece3;
    private Pawn otherPiece4;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        piece1 = new Pawn(0,1, Color.WHITE);
        piece2 = new Pawn(0,6, Color.WHITE);
        piece3 = new Pawn(7,1, Color.WHITE);
        piece4 = new Pawn(7,6, Color.WHITE);
        otherPiece1 = new Pawn(1,2, Color.BLACK);
        otherPiece2 = new Pawn(1,7, Color.BLACK);
        otherPiece3 = new Pawn(6,0, Color.WHITE);
        otherPiece4 = new Pawn(6,5, Color.WHITE);
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
    void getPawn() {
        assertEquals(piece1.getColor(), Color.WHITE);
        assertEquals(piece2.getColor(), Color.WHITE);
        assertEquals(piece3.getColor(), Color.WHITE);
        assertEquals(piece4.getColor(), Color.WHITE);
    }

    @org.junit.jupiter.api.Test
    void canMove() {
        assertFalse(piece1.canMove(0,1));//can not move in the same location
        assertTrue(piece1.canMove(1,1));//can move one step and straight.
        assertFalse(piece2.canMove(0,7));// can move one step and straight.
        assertFalse(piece2.canMove(0,7));//can't move left or right side
        //need to implement the backward, it is invalid to move back.
        assertFalse(piece3.canMove(6,1));//can't move backward
        assertFalse(piece4.canMove(6,6));//can't move back


    }

    @org.junit.jupiter.api.Test
    void canKill() {
        assertTrue(piece1.canKill(otherPiece1));//can kill diagonal target pieces
        assertFalse(piece2.canKill(piece2));//can not kill itself
        assertFalse(piece3.canKill(otherPiece3));//can't kill the same color roles.
        assertFalse(piece4.canKill(otherPiece4));// can't kill the same color piece.
    }
}