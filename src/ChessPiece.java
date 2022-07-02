public interface ChessPiece {
         int getRow();
         int getColumn();
         Color getColor();
         boolean canMove(int row, int column);
         boolean canKill(ChessPiece piece);

        static boolean isValidTarget(int row, int col) {
            return (row >= 0 && row < 8) && (col >= 0 && col < 8);
        }

        static boolean couldMoveStrait(int row, int col, ChessPiece chessPiece) {
            return row == chessPiece.getRow() || col == chessPiece.getColumn();
        }

        static boolean couldMoveDiagonal(int row, int col, ChessPiece chessPiece) {
            return row + col == chessPiece.getRow() + chessPiece.getColumn()
                    || row - col == chessPiece.getRow() - chessPiece.getColumn();
        }
}
/*
 * Chess board number rule:
 * rows increasing from bottom to top
 * and columns increasing from left to right
 * B represent Black chess piece
 * W represent White chess piece
 *
 *   7   B  B  B  B  B  B  B  B
 *   6   B  B  B  B  B  B  B  B
 *   5
 *   4
 *   3
 *   2
 *   1   W  W  W  W  W  W  W  W
 *   0   W  W  W  W  W  W  W  W
 *       0  1  2  3  4  5  6  7
 * */
