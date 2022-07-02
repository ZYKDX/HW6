public class Bishop implements ChessPiece
{
    int row, column;
    Color color;


    public Bishop(int row, int column, Color color)
    {
        if(validPosition(row, column))
        {
            this.row=row;
            this.column=column;
        }
        else
        {
            System.out.println("Invalid position!");
            System.exit(0);
        }
        if(color!=null) this.color=color;
        else
        {
            System.out.println("Empty color!");
            System.exit(0);
        }
    }


    public int getRow(){return this.row;}


    public int getColumn(){return this.column;}


    public Color getColor(){return this.color;}


    public boolean canMove(int row, int column)
    {   // could possibly be blocked in real game?
        if(!validPosition(row, column))
        {
            System.out.println("Invalid position!");
            return false;
        }
        if(row==this.row && column==this.column) return false;
        return Math.abs(this.row-row)==Math.abs(this.column-column);
    }


    public boolean canKill(ChessPiece piece)
    {
        int otherRow=piece.getRow(), otherColumn=piece.getColumn();
        if(canMove(otherRow, otherColumn))
        {
            return !(color==piece.getColor());
        }
        return false; //cannot even move to the position
    }


    private boolean validPosition(int row, int column)
    {
        if(row<0 || row>7 || column<0 || column>7)  return false;
        return true;
    }
}
