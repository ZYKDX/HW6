public class Rook implements ChessPiece {
    private int row;
    private int column;
    private Color color;


    public Rook(int row, int column, Color  Color) {
        setRow(row);
        setColumn(column);
        setColor(Color);

    }
    /* setter version below. to be deleted
    public void canMove(int row, int column) {
        if (this.row == row || this.column == column)//need to update for if obstructed)
        {   setColumn(column);
            setRow(row);
        } else {
            System.out.println("cannot move in this direction. Must be horizontal or vertical.");
        }
    }
    */
    public boolean canMove(int row, int col) {
        return ((this.row == row || this.column == col));//need to update for if obstructed)

    }

    public boolean canKill(ChessPiece piece) {
       // below checks if it's in same column or row first then checks if color is different.
        return piece.getColumn() == this.column || piece.getRow() == this.row && this.color != piece.getColor();
    }

    public void setColumn(int column) {
        if(column>=0 && column<8){
        this.column = column;}
    }


    public void setRow(int row) {
        if(row>=0 && column <8){
        this.row = row;}
    }

    public void setColor(Color color){
    this.color = color;}

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
