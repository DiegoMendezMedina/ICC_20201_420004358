package chess.pieces.chessPieces;
import java.util.LinkedList;
import java.util.List;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;
/**
/*@author iabin
/*Class Rook:
/*This is class is an extend of the class Piece
/*Attributes:
/*position; An object from the class Position
/*type and color.
**/
public class Rook extends Piece {

/**
/*One and only constructor of the class Rook.
/*@param the constructor gets an object "p" from the class Position, and color from the class ColorEnum
**/    
    public Rook(Position p, ColorEnum color) {
        this.position = p;
        this.color = color;
        this.type = PiecesTypeEnum.ROOK;
    }
/**
/*Method getPosition
/*return the param position of the object.
**/
    public Position getPosition(){
        return this.position;
    }
/**
/*Method getColor
/*return the param color of the object.
**/    
    public ColorEnum getColor(){
        return this.color;
    }
/**
/*Method getLegalMoves
/*creates and returns a list of the possible Positions where the Rook can moved.
**/    
    public List<Position> getLegalMoves() {
        if (this.legalMoves == null) { // we verify legalMoves is empty
            this.legalMoves = new LinkedList<Position>(); // we inizialice the List legalMoves.
            for(int i = this.position.getX()+1;i < 8; i++){
                this.legalMoves.add(new Position(i, this.position.getY())); // We add the moves that can be done to the rigth
            }

            for(int i = this.position.getX()-1;i >= 0; i--){
                this.legalMoves.add(new Position(i, this.position.getY()));// We add the moves that can be done to the left
            }

            for(int i = this.position.getY()+1;i < 8; i++){
                this.legalMoves.add(new Position(this.position.getX(),i));// We add the moves that can be done down
            }

            
            for(int i = this.position.getY()-1;i >= 0; i--){
                this.legalMoves.add(new Position(this.position.getX(),i));// We add the moves that can be done to the rigth up
            }
        }
        return this.legalMoves;
    }
/**
/*Method moveTo
/*Here we put on empty the List legalMoves. and we "move" our Rook by assigning the param position to the Position the method receives.
**/
    @Override
    public void moveTo(Position p) {
        if (isLegalMove(p)) {
            this.position = p;
            this.legalMoves = null;
            return;
        } else
            return;
    }
/**
/*Method isLegalMove
/*the method receives a Position and returns true if the List LegalMoves contains the Position that receives.
**/
    @Override
    public boolean isLegalMove(Position p) {
        List<Position> moves = this.getLegalMoves(); // We create another list with the same elements as the param of the object
        return (moves.contains(p)) ? true : false; //if getLegalMoves contains the position we received, it return true else false.
    }
/**
/*Method equals
/*The method receives and object in case the param and the object that calls the methos have the same value on their params the method return true otherwhise false
**/
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Rook))
            return false;

        Rook t = (Rook) obj;
        return (t.getColor() == this.getColor() 
                && this.getPosition().equals(t.getPosition())) ? true : false;

    }

}
