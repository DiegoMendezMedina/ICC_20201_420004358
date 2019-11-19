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
     *Knight class extends Piece
     */
public class Knight extends Piece {
     /**
     *One and only builder of the class
     *@param p. Position of the piece
     *@param c. Indicates the color of the piece
     */
    public Knight(Position p, ColorEnum color) {
        super(p, color);
        this.type = PiecesTypeEnum.KNIGHT;
    }
    /**
     *getLegalMoves.
     *return a list with the legal moves the rook can do.
     */
    public List<Position> getLegalMoves() {
        Board board = Board.getInstance(); //the actual status of the board
        this.legalMoves = new LinkedList<Position>();//the list is initialize
	
	
	//Possible up and rigth moves
	int aux=this.position.getX();
	int aux2=this.position.getY();
	if(aux2-2>=0 && aux-1>=0){
	    Position nextLegalPosition = new Position(aux-1, aux2-2);
	     if (this.isAppendable(nextLegalPosition) == 0 || this.isAppendable(nextLegalPosition) == 1) { 
                this.legalMoves.add(nextLegalPosition); 
            }	 
	}
	if(aux2+2<=7 && aux+1<=7){
	    Position nextLegalPosition = new Position(aux+1, aux2+2);
	    if (this.isAppendable(nextLegalPosition) == 0 || this.isAppendable(nextLegalPosition) == 1) { 
                this.legalMoves.add(nextLegalPosition); 
            }
	}

	if(aux2-1>=0 && aux-2>=0){
	    Position nextLegalPosition = new Position(aux-2, aux2-1);
	    if (this.isAppendable(nextLegalPosition) == 0 || this.isAppendable(nextLegalPosition) == 1) { 
                this.legalMoves.add(nextLegalPosition); 
            }
	}
	
	if(aux2+1<=7 && aux+2<=7){
	    Position nextLegalPosition = new Position(aux+2, aux2+1);
	    if (this.isAppendable(nextLegalPosition) == 0 || this.isAppendable(nextLegalPosition) == 1) { 
                this.legalMoves.add(nextLegalPosition); 
            }
	}

	
	if(aux2-1>=0 && aux+2<=7){
	    Position nextLegalPosition = new Position(aux+2, aux2-1);
	    if (this.isAppendable(nextLegalPosition) == 0 || this.isAppendable(nextLegalPosition) == 1) { 
                this.legalMoves.add(nextLegalPosition); 
            }
	}

	
	if(aux2-2>=0 && aux+1>=0){
	    Position nextLegalPosition = new Position(aux+1, aux2-2);
	    if (this.isAppendable(nextLegalPosition) == 0 || this.isAppendable(nextLegalPosition) == 1) { 
                this.legalMoves.add(nextLegalPosition); 
            }
	}

	
	if(aux2+1<=7 && aux-2<=7){
	    Position nextLegalPosition = new Position(aux-2, aux2+1);
	    if (this.isAppendable(nextLegalPosition) == 0 || this.isAppendable(nextLegalPosition) == 1) { 
                this.legalMoves.add(nextLegalPosition); 
            }
	}

	
	if(aux2+2<=7 && aux-1>=0){
	    Position nextLegalPosition = new Position(aux-1, aux2+2);
	    if (this.isAppendable(nextLegalPosition) == 0 || this.isAppendable(nextLegalPosition) == 1) { 
                this.legalMoves.add(nextLegalPosition); 
            }
	}
        
        return this.legalMoves;
    }

}
