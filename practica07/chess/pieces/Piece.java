package chess.pieces;
import java.util.List;
import chess.items.Position;
/**
/*@author iabin
/*Class Piece:
/*This is an abstract class , wich means that only in this class you will find the sign of the methods. Those methods will be define in the son classes of the class Piece.
/*Attributes:
/*position; An object from the class Position
/*legalMoves; A list of Positions
/*type and color.
**/
public abstract class Piece{
    //All the attributtes are on mode protected so the son classes can have acces to them.
    protected Position position; 
    protected List<Position> legalMoves = null;
    protected PiecesTypeEnum type;
    protected ColorEnum color;

    public abstract void moveTo(Position p); //This is only the sign of the method moveTo. It is void so it don't return anything. it receives as @param an object from the class Position named p.
    public abstract boolean isLegalMove(Position p);//This is only the sign of the method isLegalMove. It is boolean so it can return true or false. it receives as @param an object from the class Position named p.

    @Override
    public abstract boolean equals(Object obj);//This is only the sign of the method equals.It receives as @param an object from the class Object named obj.

}
