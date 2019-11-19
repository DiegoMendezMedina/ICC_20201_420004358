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
     *Pawn class extends Piece
     */
public class King extends Piece {
     /**
     *One and only builder of the class
     *@param p. Position of the piece
     *@param c. Indicates the color of the piece
     */
    public King(Position p, ColorEnum color) {
        super(p, color);
        this.type = PiecesTypeEnum.KING;
    }
    /**
     *getLegalMoves.
     *return a list with the legal moves the rook can do.
     */
    public List<Position> getLegalMoves() {
        Board board = Board.getInstance(); //the actual status of the board
        this.legalMoves = new LinkedList<Position>();//the list is initialize
	

	    //Posible right move from the original position.
	if(this.position.getX()!=7){
	Position nextLegalPosition = new Position(this.position.getX()+1, this.position.getY());
          
            if (this.isAppendable(nextLegalPosition) == 0 || this.isAppendable(nextLegalPosition) == 1 ) { 
                this.legalMoves.add(nextLegalPosition); // if there is not a piece in the nextlegalPosition , nextlegalposition is added to the legalMoves.
            }
    }
	    //Posible left move from the original position.
	if(this.position.getX()!=0){
	Position nextLegalPositioni = new Position(this.position.getX()-1, this.position.getY());
          
            if (this.isAppendable(nextLegalPositioni) == 0 || this.isAppendable(nextLegalPositioni) == 1 ) { 
                this.legalMoves.add(nextLegalPositioni); // if there is not a piece in the nextlegalPosition , nextlegalposition is added to the legalMoves.
            }
	}
          	    //Posible up move from the original position.
	if(this.position.getY()!=0){
	Position nextLegalPositionu = new Position(this.position.getX(), this.position.getY()-1);
          
            if (this.isAppendable(nextLegalPositionu) == 0 || this.isAppendable(nextLegalPositionu) == 1 ) { 
                this.legalMoves.add(nextLegalPositionu); // if there is not a piece in the nextlegalPosition , nextlegalposition is added to the legalMoves.
            }
	}
	    //Posible down move from the original position.
	if(this.position.getY()!=7){	
	    Position nextLegalPositiond = new Position(this.position.getX(), this.position.getY()+1);
          
            if (this.isAppendable(nextLegalPositiond) == 0 || this.isAppendable(nextLegalPositiond) == 1 ) { 
                this.legalMoves.add(nextLegalPositiond); // if there is not a piece in the nextlegalPosition , nextlegalposition is added to the legalMoves.
            }
	}
	    //Posible down and left move from the original position.
	if(this.position.getX()!=0 && this.position.getY()!=7){
	    Position nextLegalPositiondl = new Position(this.position.getX()-1, this.position.getY()+1);
          
            if (this.isAppendable(nextLegalPositiondl) == 0 || this.isAppendable(nextLegalPositiondl) == 1 ) { 
                this.legalMoves.add(nextLegalPositiondl); // if there is not a piece in the nextlegalPosition , nextlegalposition is added to the legalMoves.
            }
	}
	    //Posible down and right move from the original position.
	if(this.position.getX()!=7 && this.position.getY()!=7){
	    Position nextLegalPositiondr = new Position(this.position.getX()+1, this.position.getY()+1);
          
            if (this.isAppendable(nextLegalPositiondr) == 0 || this.isAppendable(nextLegalPositiondr) == 1 ) { 
                this.legalMoves.add(nextLegalPositiondr); // if there is not a piece in the nextlegalPosition , nextlegalposition is added to the legalMoves.
            }
	}

	   //Posible up and left move from the original position.
	if(this.position.getX()!=0 && this.position.getY()!=0){
	    Position nextLegalPositionul = new Position(this.position.getX()-1, this.position.getY()-1);
          
            if (this.isAppendable(nextLegalPositionul) == 0 || this.isAppendable(nextLegalPositionul) == 1 ) { 
                this.legalMoves.add(nextLegalPositionul); // if there is not a piece in the nextlegalPosition , nextlegalposition is added to the legalMoves.
            }
	}
	    //Posible down and right move from the original position.
	if(this.position.getX()!=7 && this.position.getY()!=0){
	    Position nextLegalPositionur = new Position(this.position.getX()+1, this.position.getY()-1);
          
            if (this.isAppendable(nextLegalPositionur) == 0 || this.isAppendable(nextLegalPositionur) == 1 ) { 
                this.legalMoves.add(nextLegalPositionur); // if there is not a piece in the nextlegalPosition , nextlegalposition is added to the legalMoves.
            } 
	}



	    
        return this.legalMoves;
    }

}
