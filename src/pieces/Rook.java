package pieces;

public class Rook extends Piece{

    Rook(PieceColor color) {
        super(color);
    }

    @Override
    public boolean isValidMovePattern(int currentRow, int currentCol, int nextRow, int nextCol) {
        if (currentRow == nextRow && currentCol == nextCol) {
            return false;
        } else if (currentRow != nextRow && currentCol != nextCol) {
            return false;
        }
        return true;
    }

}
