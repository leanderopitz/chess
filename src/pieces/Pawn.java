package pieces;

public class Pawn extends Piece {
    public Pawn(PieceColor color) {
        super(color);
    }

    @Override
    public String getName() {
        return "Pawn";
    }

    @Override
    public boolean isValidMovePattern(int currentRow, int currentCol, int nextRow, int nextCol) {
        int rowDistance = currentRow - nextRow;
        int colDistance = Math.abs(currentCol - nextCol);
        if (currentRow == nextRow && currentCol == nextCol) {
            return false;
        } else if (getColor() == PieceColor.WHITE && rowDistance == 1 && colDistance == 0) {
            return true;
        } else if (getColor() == PieceColor.BLACK && rowDistance == -1 && colDistance == 0) {
            return true;
            // Wenn Ausgangsreihe, dann Zug um 2 Felder möglich
        } else if (getColor() == PieceColor.WHITE && currentRow == 6 && colDistance == 0 && rowDistance == 2) {
            return true;
        } else if (getColor() == PieceColor.BLACK && currentRow == 1 && colDistance == 0 && rowDistance == -2) {
            return true;
            // Schlagen einer Figur
        } else if (getColor() == PieceColor.WHITE && colDistance == 1 && rowDistance == 1) {
            return true;
        } else if (getColor() == PieceColor.BLACK && colDistance == 1 && rowDistance == -1) {
            return true;
        }
        return false;
    }
}
