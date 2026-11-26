package pieces;

public class Bishop extends Piece{

    Bishop(PieceColor color) {
        super(color);
    }

    @Override
    public boolean isValidMovePattern(int currentRow, int currentCol, int nextRow, int nextCol) {
        int rowDistance = Math.abs(currentRow - nextRow);
        int colDistance = Math.abs(currentCol - nextCol);
        if (currentRow == nextRow && currentCol == nextCol) {
            return false;
        } else if (rowDistance != colDistance) {
            return false;
        }
        return true;
    }
}
