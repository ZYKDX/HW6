public class PawnDemo {
    public static void main(String[] args) {
        Pawn pawn1 = new Pawn(1, 3, Color.BLACK);
        Pawn pawn2 = new Pawn(3, 6, Color.WHITE);
        Pawn pawn3 = new Pawn(2,4,Color.WHITE);
        System.out.println(pawn1.color);
        System.out.println(pawn1.canMove(2,3));
        System.out.println(pawn1.canKill(pawn2));
        System.out.println(pawn1.canKill(pawn3));
    }
}
