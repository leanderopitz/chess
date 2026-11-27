package pieces;

public abstract class Piece {
    private final PieceColor color;

    // Konstruktor
    Piece(PieceColor color) {
        this.color = color;
    }
    public PieceColor getColor() {
        return this.color;
    }
    public abstract String getName();
    public abstract boolean isValidMovePattern(int currentRow, int currentCol, int nextRow, int nextCol);

    @Override
    public String toString() {
        return getColor() + " " + getName();
    }

}
