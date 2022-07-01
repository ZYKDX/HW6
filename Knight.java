public class Knight implements ChessPiece
{
    int row, column;
    Color color;


    public Knight(int row, int column, Color color)
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
    {
        if(!validPosition(row, column))
        {
            System.out.println("Invalid position!");
            return false;
        }
        if(Math.abs(this.row-row)==2 && Math.abs(this.column-column)==1) return true;
        else if(Math.abs(this.row-row)==1 && Math.abs(this.column-column)==2) return true;
        else return false;

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
        if(row<0 || row>7 || column<0 || column>7) return false;
        return true;
    }
}
