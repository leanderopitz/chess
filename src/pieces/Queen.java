package pieces;

public class Queen extends Piece{
    public Queen(PieceColor color) {
        super(color);
    }

    @Override
    public String getName() {
        return "Queen";
    }

    @Override
    public boolean isValidMovePattern(int currentRow, int currentCol, int nextRow, int nextCol) {
        int rowDistance = Math.abs(currentRow - nextRow);
        int colDistance = Math.abs(currentCol - nextCol);
        if (currentRow == nextRow && currentCol == nextCol) {
            return false;
        } else if (currentRow == nextRow || currentCol == nextCol) {
            return true;
        } else if (rowDistance == colDistance) {
            return true;
        }
        return false;
    }
}
