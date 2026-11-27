package pieces;

public class Knight extends Piece{
    public Knight(PieceColor color) {
        super(color);
    }

    @Override
    public String getName() {
        return "Knight";
    }

    @Override
    public boolean isValidMovePattern(int currentRow, int currentCol, int nextRow, int nextCol) {
        int rowDistance = Math.abs(currentRow - nextRow);
        int colDistance = Math.abs(currentCol - nextCol);
        if (currentRow == nextRow && currentCol == nextCol) {
            return false;
        } else if ((rowDistance + colDistance == 3) && (rowDistance == 1 || colDistance == 1)) {
            return true;
        }
        return false;
    }
}
