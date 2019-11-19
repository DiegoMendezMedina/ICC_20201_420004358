package chess.pieces.chessPieces;
import java.util.LinkedList;
import java.util.List;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;
/**
 *@author iabin
 *class Empty extends Piece
 */
public class Empty extends Piece{
    /**
     *first of the two builder of the class
     *@param p. Position of the piece
     *@param c. Indicates the color of the piece
     */
    public Empty(Position p, ColorEnum c){
        super(p,c);
        this.type = PiecesTypeEnum.EMPTY;
    }
        /**
     *second of the two builder of the class
     *Sets the Piece on the 0,0 position
     */
    public Empty(){
        super(new Position(0,0),ColorEnum.NONE);
        this.type = PiecesTypeEnum.EMPTY;
    }
    /**
     *getLegalMoves
     *@return a list from the posible moves in this case null.
     */
    @Override
    public List<Position> getLegalMoves() {
        return new LinkedList<>();
    }
    /**
     *equals
     *@param obj
     *If the param is a Piece and is empty return true, otherwhise false.
     */
    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Empty)? true: false;
    }

}
