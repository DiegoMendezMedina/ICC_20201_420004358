package chess.pieces.chessPieces;

import java.util.LinkedList;
import java.util.List;

import chess.items.Board;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;

 /**
     *@author chubak
     *Bishop class extends Piece
     */
public class Bishop extends Piece {
     /**
     *One and only builder of the class
     *@param p. Position of the piece
     *@param c. Indicates the color of the piece
     */
    public Bishop(Position p, ColorEnum color) {
        super(p, color);
        this.type = PiecesTypeEnum.BISHOP;
    }
    /**
     *getLegalMoves.
     *return a list with the legal moves the rook can do.
     */
    public List<Position> getLegalMoves() {
        Board board = Board.getInstance(); //the actual status of the board
        this.legalMoves = new LinkedList<Position>();//the list is initialize
       
	int aux=this.position.getX()+1;
        for (int i = this.position.getY() - 1 ; i >= 0 && aux<8 ; i--) {
	    //Possible up and rigth moves
            Position nextLegalPosition = new Position(aux, i);
            Piece piece = board.getPiece(nextLegalPosition);
            if (piece.getColor() == this.getColor())
                break;
            if (piece.getColor() != ColorEnum.NONE) {
                this.legalMoves.add(nextLegalPosition);
                break;
            }
            this.legalMoves.add(nextLegalPosition);
	    aux++;
        }
	aux=this.position.getX()-1;
        for (int i = this.position.getY()- 1; i >= 0 && aux>=0; i--) {
	    //Possible up and left moves
            Position nextLegalPosition = new Position(aux, i);
            Piece piece = board.getPiece(nextLegalPosition);
            if (piece.getColor() == this.getColor())
                break;
            if (piece.getColor() != ColorEnum.NONE) {
                this.legalMoves.add(nextLegalPosition);
                break;
            }
            this.legalMoves.add(nextLegalPosition);
	    aux--;
        }	

	aux=this.position.getY()+1;
        for (int i = this.position.getX()- 1; i >= 0 && aux<8; i--) {
	    //Possible down and left moves
            Position nextLegalPosition = new Position(i,aux);
            Piece piece = board.getPiece(nextLegalPosition);
            if (piece.getColor() == this.getColor())
                break;
            if (piece.getColor() != ColorEnum.NONE) {
                this.legalMoves.add(nextLegalPosition);
                break;
            }
            this.legalMoves.add(nextLegalPosition);
	    aux++;
        }

	aux=this.position.getY()+1;
        for (int i = this.position.getX()+ 1; i <8 && aux<8; i++) {
	    //Possible down and right moves
            Position nextLegalPosition = new Position(i,aux);
            Piece piece = board.getPiece(nextLegalPosition);
            if (piece.getColor() == this.getColor())
                break;
            if (piece.getColor() != ColorEnum.NONE) {
                this.legalMoves.add(nextLegalPosition);
                break;
            }
            this.legalMoves.add(nextLegalPosition);
	    aux++;
        }
        return this.legalMoves;
    }

}
