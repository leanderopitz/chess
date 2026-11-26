import pieces.*;

public class Board {
    private final Piece[][] board = new Piece[8][8];

    public void initializeBoard() {
        // Black Pieces
        board[0][0] = new Rook(PieceColor.BLACK);
        board[0][1] = new Knight(PieceColor.BLACK);
        board[0][2] = new Bishop(PieceColor.BLACK);
        board[0][3] = new Queen(PieceColor.BLACK);
        board[0][4] = new King(PieceColor.BLACK);
        board[0][5] = new Bishop(PieceColor.BLACK);
        board[0][6] = new Knight(PieceColor.BLACK);
        board[0][7] = new Rook(PieceColor.BLACK);
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(PieceColor.BLACK);
        }
        // White Pieces
        board[7][0] = new Rook(PieceColor.WHITE);
        board[7][1] = new Knight(PieceColor.WHITE);
        board[7][2] = new Bishop(PieceColor.WHITE);
        board[7][3] = new Queen(PieceColor.WHITE);
        board[7][4] = new King(PieceColor.WHITE);
        board[7][5] = new Bishop(PieceColor.WHITE);
        board[7][6] = new Knight(PieceColor.WHITE);
        board[7][7] = new Rook(PieceColor.WHITE);
        for (int i = 0; i < 8; i++) {
            board[6][i] = new Pawn(PieceColor.WHITE);
        }
    }

    public Piece getPiece(int currentRow, int currentCol) {
        if (!isWithinBounds(currentRow, currentCol)) {
            return null;
        }
        return board[currentRow][currentCol];
    }

    public void movePiece(int currentRow, int currentCol, int nextRow, int nextCol) {
        if (!isWithinBounds(currentRow, currentCol)) {
            return;
        }
        if (!isWithinBounds(nextRow, nextCol)) {
            return;
        }
        // Wenn Feld leer ist
        if (board[currentRow][currentCol] == null) {
            return;
        }
        // Wenn aktuelles und zukünftiges Feld gleich sind
        if ((currentRow ==  nextRow) && (currentCol == nextCol)) {
            return;
        }
        board[nextRow][nextCol] = board[currentRow][currentCol];
        board[currentRow][currentCol] = null;
    }

    private boolean isWithinBounds(int row, int col) {
        if (row < 0 || row > 7) {
            return false;
        }
        if (col < 0 || col > 7) {
            return false;
        }
        return true;
    }

    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.printf("%-15s","[" + board[i][j] + "]");
            }
            System.out.println();
        }
    }
}
