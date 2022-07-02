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
