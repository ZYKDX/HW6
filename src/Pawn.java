
public class Pawn implements ChessPiece {

    int row;
    int col;
    Color color;
    public Pawn(int row, int col, Color color) {
        this.row = row;
        this.col = col;
        this.color = color;
    }


    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.col;
    }


    public Color getColor() {
        return this.color;
    }


    public boolean canMove(int row, int col) {
        if (!ChessPiece.isValidTarget(row, col)) {
            return false;
        }

        // can't move to itself current location
        if (this.getRow() == row && this.getColumn() == col) {
            return false;
        }

        if (this.getColor().equals(Color.BLACK)) {
            if (row == this.getRow()  - 1 ) {
                return true;
            }
        }

        if (this.getColor().equals(Color.WHITE)) {
            if (row == this.getRow() + 1) {
                return true;
            }
        }

        return false;
    }

    public boolean canKill(ChessPiece piece) {
        if (this.getColor().equals(piece.getColor())) {
            return false;
        }

        if (this.getColor().equals(Color.BLACK)) {
            if (piece.getRow() == this.getRow() - 1
                    && Math.abs(piece.getColumn() - this.getColumn()) == 1) {
                return true;
            }
        }

        if (this.getColor().equals(Color.WHITE)) {
            if (piece.getRow() == this.getRow() + 1
                    && Math.abs(piece.getColumn() - this.getColumn()) == 1) {
                return true;
            }
        }

        return false;
    }
    private boolean validPosition(int row, int column)
    {
        if(row < 0 || row > 7 || column < 0 || column > 7)
            return false;
        return true;
    }
    public boolean locationCheck(int row, int col) {
        if (this.getColor().equals(Color.WHITE) && row == 0) {
            // pawn can't be in the first line as it can't move backward
            return false;
        }

        if (this.getColor().equals(Color.BLACK) && row == 7) {
            // pawn can't be in the first line as it can't move backward
            return false;
        }

        return true;
    }
}

