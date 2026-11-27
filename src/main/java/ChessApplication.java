import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import pieces.*;

public class ChessApplication extends Application {
    private int selectedRow = -1;
    private int selectedCol = -1;
    private Board board;
    private GridPane boardGrid;

    @Override
    public void start(Stage stage) throws Exception {
        /*  reihenfolge der Ebenen:
         *   GridPane
         *   squareContainer (StackPane)
         *   square (Hintergrund)
         *   Text (Schachfigur)
         * */
        board = new Board();
        board.initializeBoard();
        stage.setTitle("Chess Engine by Max Dieckmann and Leander Opitz");
        boardGrid = new GridPane();
        boardGrid.setMaxWidth(800);
        boardGrid.setMaxHeight(800);
        boardGrid.setStyle("-fx-border-color: black; -fx-border-width: 3;");
        StackPane root = new StackPane(boardGrid);
        Scene scene = new Scene(root, 1000, 1000);
        stage.setScene(scene);
        updateBoard();
        stage.show();
    }

    private String getPieceSymbol(Piece piece) {
        if (piece instanceof Rook && piece.getColor() == PieceColor.WHITE) {
            return "♖";
        } else if (piece instanceof Rook && piece.getColor() == PieceColor.BLACK) {
            return "♜";
        } else if (piece instanceof Knight && piece.getColor() == PieceColor.WHITE) {
            return "♘";
        } else if (piece instanceof Knight && piece.getColor() == PieceColor.BLACK) {
            return "♞";
        } else if (piece instanceof Bishop && piece.getColor() == PieceColor.WHITE) {
            return "♗";
        } else if (piece instanceof Bishop && piece.getColor() == PieceColor.BLACK) {
            return "♝";
        } else if (piece instanceof Queen && piece.getColor() == PieceColor.WHITE) {
            return "♕";
        } else if (piece instanceof Queen && piece.getColor() == PieceColor.BLACK) {
            return "♛";
        } else if (piece instanceof King && piece.getColor() == PieceColor.WHITE) {
            return "♔";
        } else if (piece instanceof King && piece.getColor() == PieceColor.BLACK) {
            return "♚";
        } else if (piece instanceof Pawn && piece.getColor() == PieceColor.WHITE) {
            return "♙";
        } else if (piece instanceof Pawn && piece.getColor() == PieceColor.BLACK) {
            return "♟";
        } else {
            return "";
        }
    }

    private void updateBoard() {
        boardGrid.getChildren().clear();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Rectangle square = new Rectangle(100, 100);
                StackPane squareContainer = new StackPane();
                squareContainer.getChildren().add(square);
                final int row = j;
                final int col = i;
                squareContainer.setOnMouseClicked(event -> {
                    if (selectedRow == -1 && selectedCol == -1 && board.getPiece(row, col) != null) {
                        selectedRow = row;
                        selectedCol = col;
                        updateBoard();
                    } else if (selectedRow != -1 && selectedCol != -1) {
                        board.movePiece(selectedRow, selectedCol, row, col);
                        selectedRow = -1;
                        selectedCol = -1;
                        updateBoard();
                    }
                });
                Piece piece = board.getPiece(j, i);
                if (piece != null) {
                    Text figure = new Text(getPieceSymbol(piece));
                    figure.setStyle("-fx-font-size: 80px;");
                    squareContainer.getChildren().add(figure);
                }
                if (selectedRow == row && selectedCol == col) {
                    square.setFill(Paint.valueOf("#FFFF00"));
                } else if ((i + j) % 2 == 0) {
                    square.setFill(Paint.valueOf("#FFFFFF"));
                } else {
                    square.setFill(Paint.valueOf("#90D5FF"));
                }
                boardGrid.add(squareContainer, i, j);
            }
        }
    }
}
