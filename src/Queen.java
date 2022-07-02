public class Queen implements ChessPiece {
    private int row;
    private int column;

    private Color color;

    public Queen(int row, int column, Color color){
        if ((column >= 0 && column < 8) && (row >= 0 && row < 8)) {
            this.row = row;
            this.column = column;
            this.color = color;
        }
        else {
            System.out.println("invalid row/column must be between 0-8");
        }
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }
    public Color getColor(){
        return this.color;
    }



    public boolean canMove(int col, int row) {
        // can move diagonally or horizontal or vertically pending obstacles.
        if ((col >= 0 && col < 8) && (row >= 0 && row < 8)){
            //if horizontal/vertical below
            {
                if (this.row == row || this.column == col) {
                return true;
                //if diagonal below
            } else return ((Math.abs(this.row - row) == Math.abs(this.column - col)));
        }
        }
        //if invalid location below
        else return false;
    }

    public boolean canKill(ChessPiece piece){
        //if queen can move to piece location and the color is opposite it returns true. Else false
        return (canMove(piece.getColumn(), piece.getRow()) && (this.color != piece.getColor()));
    }
}


