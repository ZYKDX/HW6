public interface ChessPiece {
        public int getRow();
        public int getColumn();
        public Color getColor();
        public boolean canMove(int row, int column);
        public boolean canKill(ChessPiece piece);

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
