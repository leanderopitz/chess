public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.initializeBoard();
        board.printBoard();

        // Tests
        System.out.println(board.getPiece(7, 3));
        board.movePiece(6, 3, 4, 3);
        board.printBoard();
    }
}
