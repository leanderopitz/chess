public class Board {
    private static final int EMPTY = 0;
    private static final int KING = 1;
    private static final int QUEEN = 2;
    private static final int ROOK = 3;
    private static final int BISHOP = 4;
    private static final int KNIGHT = 5;
    private static final int PAWN = 6;
    private final int[][] board = new int[8][8];

    public void initializeBoard() {
        // Black Pieces
        board[0][0] = -ROOK;
        board[0][1] = -KNIGHT;
        board[0][2] = -BISHOP;
        board[0][3] = -QUEEN;
        board[0][4] = -KING;
        board[0][5] = -BISHOP;
        board[0][6] = -KNIGHT;
        board[0][7] = -ROOK;
        for (int i = 0; i < 8; i++) {
            board[1][i] = -PAWN;
        }
        // White Pieces
        board[7][0] = ROOK;
        board[7][1] = KNIGHT;
        board[7][2] = BISHOP;
        board[7][3] = QUEEN;
        board[7][4] = KING;
        board[7][5] = BISHOP;
        board[7][6] = KNIGHT;
        board[7][7] = ROOK;
        for (int i = 0; i < 8; i++) {
            board[6][i] = PAWN;
        }
    }

    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("[" + board[i][j] + "]");
            }
            System.out.println();
        }
    }
}
