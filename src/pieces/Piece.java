package pieces;

abstract class Piece {
    private final PieceColor color;

    // Konstruktor
    Piece(PieceColor color) {
        this.color = color;
    }
    public PieceColor getColor() {
        return this.color;
    }
    public abstract boolean isValidMovePattern(int currentRow, int currentCol, int nextRow, int nextCol);

}
