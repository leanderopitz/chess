package pieces;

public class Rook extends Piece{
    public Rook(PieceColor color) {
        super(color);
    }

    @Override
    public String getName() {
        return "Rook";
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
