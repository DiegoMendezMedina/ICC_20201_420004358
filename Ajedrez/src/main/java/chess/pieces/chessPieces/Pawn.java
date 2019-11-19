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
public class Pawn extends Piece {
     /**
     *One and only builder of the class
     *@param p. Position of the piece
     *@param c. Indicates the color of the piece
     */
    public Pawn(Position p, ColorEnum color) {
        super(p, color);
        this.type = PiecesTypeEnum.PAWN;
    }
    /**
     *getLegalMoves.
     *return a list with the legal moves the rook can do.
     */
    public List<Position> getLegalMoves() {
        Board board = Board.getInstance(); //the actual status of the board
        this.legalMoves = new LinkedList<Position>();//the list is initialize
	
	if(this.getColor().equals(ColorEnum.WHITE)){
	    if(this.position.getY()==6){
		Position nextLegal = new Position(this.position.getX(), this.position.getY()-2);
          
            if (this.isAppendable(nextLegal) == 0 || this.isAppendable(nextLegal) == 1 ) { 
                this.legalMoves.add(nextLegal); // if there is not a piece in the nextlegalPosition , nextlegalposition is added to the legalMoves.
            }
	    }
	    //Posible up move from the original position.
	    Position nextLegalPositionu = new Position(this.position.getX(), this.position.getY()-1);
          
            if (this.isAppendable(nextLegalPositionu) == 0 || this.isAppendable(nextLegalPositionu) == 1 ) { 
                this.legalMoves.add(nextLegalPositionu); // if there is not a piece in the nextlegalPosition , nextlegalposition is added to the legalMoves.
            }

	    //Posible up and left move from the original position.
	    if(this.position.getX()!=0){
	    Position nextLegalPositionul = new Position(this.position.getX()-1, this.position.getY()-1);
          
            if ( this.isAppendable(nextLegalPositionul) == 0 ) { 
                this.legalMoves.add(nextLegalPositionul); // if there is not a piece in the nextlegalPosition , nextlegalposition is added to the legalMoves.
            }
	    }
	    //Posible up and right move from the original position.
	    if(this.position.getX()!=7){
	    Position nextLegalPositionur = new Position(this.position.getX()+1, this.position.getY()-1);
          
            if ( this.isAppendable(nextLegalPositionur) == 0 ) { 
                this.legalMoves.add(nextLegalPositionur); // if there is not a piece in the nextlegalPosition , nextlegalposition is added to the legalMoves.
            }
	    }
	    return this.legalMoves;
	}
	
	else{
	    if(this.position.getY()==1){
		Position nextLegal = new Position(this.position.getX(), this.position.getY()+2);
          
		if (this.isAppendable(nextLegal) == 0 || this.isAppendable(nextLegal) == 1 ) { 
		    this.legalMoves.add(nextLegal); // if there is not a piece in the nextlegalPosition , nextlegalposition is added to the legalMoves.
		}

	    }
	       //Posible down move from the original position.
	    Position nextLegalPositionu = new Position(this.position.getX(), this.position.getY()+1);
          
            if (this.isAppendable(nextLegalPositionu) == 0 || this.isAppendable(nextLegalPositionu) == 1 ) { 
                this.legalMoves.add(nextLegalPositionu); // if there is not a piece in the nextlegalPosition , nextlegalposition is added to the legalMoves.
            }

	    //Posible down and left move from the original position.
	    if(this.position.getX()!=0){
	    Position nextLegalPositionul = new Position(this.position.getX()-1, this.position.getY()+1);
          
            if ( this.isAppendable(nextLegalPositionul) == 0) { 
                this.legalMoves.add(nextLegalPositionul); // if there is not a piece in the nextlegalPosition , nextlegalposition is added to the legalMoves.
            }
	    }
	    //Posible down and right move from the original position.
	    if(this.position.getX()!=7){
	    Position nextLegalPositionur = new Position(this.position.getX()+1, this.position.getY()+1);
          
            if ( this.isAppendable(nextLegalPositionur) == 0) { 
                this.legalMoves.add(nextLegalPositionur); // if there is not a piece in the nextlegalPosition , nextlegalposition is added to the legalMoves.
            }
	    }
	    return this.legalMoves;
	}
	
    }
    }
