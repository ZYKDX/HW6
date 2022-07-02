public class Rook implements ChessPiece {
    private int row;
    private int column;
    private Color color;


    public Rook(int row, int column, Color  color) {
      if((column >= 0 && column < 8) && (row >= 0 && row < 8)) {
          this.row = row;
          this.column = column;
          this.color = color;
      }else{
          System.out.println("not valid row/column must be greater than or equal to 0 and less than 8.");
      }

    }
    public boolean canMove(int row, int col) {
        return ((this.row == row || this.column == col));//need to update for if obstructed)

    }

    public boolean canKill(ChessPiece piece) {
       // below checks if it's in same column or row first then checks if color is different.
        return ((piece.getColumn() == this.column || piece.getRow() == this.row )&& this.color != piece.getColor());
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

}
