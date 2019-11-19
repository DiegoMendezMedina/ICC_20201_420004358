package chess.pieces.chessPieces;

import java.util.LinkedList;
import java.util.List;

import chess.items.Board;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;
    /**
     *@author iabin
     *Rook class extends Piece
     */
public class Rook extends Piece {
     /**
     *One and only builder of the class
     *@param p. Position of the piece
     *@param c. Indicates the color of the piece
     */
    public Rook(Position p, ColorEnum color) {
        super(p, color);
        this.type = PiecesTypeEnum.ROOK;
    }
    /**
     *getLegalMoves.
     *return a list with the legal moves the rook can do.
     */
    public List<Position> getLegalMoves() {
        Board board = Board.getInstance(); //the actual status of the board
        this.legalMoves = new LinkedList<Position>();//the list is initialize
        for (int i = this.position.getX() + 1; i < 8; i++) {
	    //Possibles right moves from the original position.
            Position nextLegalPosition = new Position(i, this.position.getY());
            if (this.isAppendable(nextLegalPosition) == -1) // If in the   nextlegalposition there is a fiece of the same color it breaks.
                break;
            if (this.isAppendable(nextLegalPosition) == 0) { 
                this.legalMoves.add(nextLegalPosition); // if there is not a piece in the nextlegalPosition , nextlegalposition is added to the legalMoves.
                break;
            }
            this.legalMoves.add(nextLegalPosition); // If theres an enemy Piece on nextLegalPosition the move can be done.
        }

        for (int i = this.position.getX() - 1; i >= 0; i--) {
	    //Possible left moves.
            Position nextLegalPosition = new Position(i, this.position.getY());
            Piece piece = board.getPiece(nextLegalPosition);
            if (piece.getColor() == this.getColor())
                break;
            if (piece.getColor() != ColorEnum.NONE) {
                this.legalMoves.add(nextLegalPosition);
                break;
            }
            this.legalMoves.add(nextLegalPosition);

        }

        for (int i = this.position.getY() + 1; i < 8; i++) {
	    //Possible down moves
            Position nextLegalPosition = new Position(this.position.getX(), i);
            Piece piece = board.getPiece(nextLegalPosition);
            if (piece.getColor() == this.getColor())
                break;
            if (piece.getColor() != ColorEnum.NONE) {
                this.legalMoves.add(nextLegalPosition);
                break;
            }
            this.legalMoves.add(nextLegalPosition);

        }

        for (int i = this.position.getY() - 1; i >= 0; i--) {
	    //Possible up moves
            Position nextLegalPosition = new Position(this.position.getX(), i);
            Piece piece = board.getPiece(nextLegalPosition);
            if (piece.getColor() == this.getColor())
                break;
            if (piece.getColor() != ColorEnum.NONE) {
                this.legalMoves.add(nextLegalPosition);
                break;
            }
            this.legalMoves.add(nextLegalPosition);

        }

        return this.legalMoves;
    }

}
