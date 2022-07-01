public interface ChessPiece
{
    public int getRow();
    public int getColumn();
    public Color getColor();
    public boolean canMove(int row, int column);
    public boolean canKill(ChessPiece piece);
}