public class PawnDemo {
    public static void main(String[] args) {
        Pawn pawn1 = new Pawn(1, 3, Color.WHITE);
        Pawn pawn2 = new Pawn(2, 4, Color.BLACK);
        Pawn pawn3 = new Pawn(2,4,Color.WHITE);
        System.out.println(pawn1.color);
        System.out.println(pawn1.canMove(2,3));//can move to same row and one steps forward
        System.out.println(pawn1.canKill(pawn2));//can kill another color and diagonal location.
        System.out.println(pawn1.canKill(pawn3));// can't kill the same color even though diagonal direction
        System.out.println(pawn1.canKill(pawn1));//can't move current location
        System.out.println(pawn1.canMove(0,3));//can't move backward.
    }
}
