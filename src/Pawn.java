
public class Pawn implements ChessPiece {

    int row;
    int col;
    Color color;
    public Pawn(int row, int col, Color color) {
        this.row = row;
        this.col = col;
        this.color = color;
    }

    @Override
    public int getRow() {
        return this.row;
    }

    @Override
    public int getColumn() {
        return this.col;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public boolean canMove(int row, int col) {
        if (!ChessPiece.isValidTarget(row, col)) {
            return false;
        }

        // can't move to itself current location
        if (this.getRow() == row && this.getColumn() == col) {
            return false;
        }

        if (this.getColor().equals(Color.BLACK)) {
            if (row == this.getRow() - 1 || this.getRow() - 1  > row) {
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
}

