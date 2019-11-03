package chess.pieces.chessPieces;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;
import chess.items.Position;
import java.util.LinkedList;
import java.util.List;
public class Queen extends Rook{
/**
/*@author chubak
/*Class Queen:
/*This is class is an extend of the class Rook
**/
    public Queen (Position p, ColorEnum color){
	super(p,color);
    }
/**
/*Method getLegalMoves
/* We override the method from the class Rook
/*This method adds and returns a list of the possible Positions where the Queen can moved.
**/    
    @Override
     public List<Position> getLegalMoves() {
	super.getLegalMoves();
	for(int i=this.position.getX()+1, j=this.position.getY()+1;i<8 && j<8;i++,j++){
	    this.legalMoves.add(new Position(i,j)); // We add the moves that can be done to the rigth and down 
	}
	for(int i=this.position.getX()-1, j=this.position.getY()-1;i>=0 && j>=0;i--,j--){
	    this.legalMoves.add(new Position(i,j)); // We add the moves that can be done to the left and up
	}
	for(int i=this.position.getX()+1, j=this.position.getY()-1;i<8 && j>=0;i++,j--){
	    this.legalMoves.add(new Position(i,j)); // We add the moves that can be done to the rigth and up
	}
	for(int i=this.position.getX()-1, j=this.position.getY()+1;i>=0 && j<8;i--,j++){
	    this.legalMoves.add(new Position(i,j)); // We add the moves that can be done to the left and down
	}
	for(int  j=this.position.getY()+1; j<8;j++){
	    this.legalMoves.add(new Position(this.position.getX(),j));  // We add the moves that can be done down
	}
	for(int  j=this.position.getY()-1; j>=0;j--){
	    this.legalMoves.add(new Position(this.position.getX(),j)); // We add the moves that can be done up
	}
	for(int  j=this.position.getX()+1; j<8;j++){
	    this.legalMoves.add(new Position(j,this.position.getY())); // We add the moves that can be done to the rigth
	}
	for(int  j=this.position.getX()-1; j>=9;j--){
	    this.legalMoves.add(new Position(j,this.position.getY())); // We add the moves that can be done to the left
	}
        return this.legalMoves;
    }
}
