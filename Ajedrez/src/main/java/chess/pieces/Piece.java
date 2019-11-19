package chess.pieces;
import java.util.List;
import chess.items.Board;
import chess.items.Position;
    /**
     *@author iabin
     *Piece class
     * abstract class
     */
public abstract class Piece{
    protected Position position;
    protected List<Position> legalMoves = null;
    protected PiecesTypeEnum type;
    protected ColorEnum color;
    protected Board board;
    /**
     *One and only builder of the class
     *@param p. Position of the piece
     *@param c. Indicates the color of the piece
     */
    public Piece(Position p, ColorEnum color) {
        this.position = p;
        this.color = color;
    }

        /**
     *isAppendable
     *@param p. Position of the piece
     *@return 0 if there isnt a piece on the position p
     *@return -1 if the Piece on the position p is the same color
     *@return 1 if the Piece on the position p can be eaten
     */
    public int isAppendable(Position p){
        Board board = Board.getInstance(); // status of the board
        Piece piece = board.getPiece(p); //Position of the piece
        if(piece.getColor() == this.getColor())return -1; //if the Piece on the Position p is of the same color return -1
        if(piece.getColor() != ColorEnum.NONE)return 0; //if there is no Piece on the Position p it return 0
        return 1; //Otherwhise return 1
    }
        /**
     *getPosition
     *@return the position.
     */
    public Position getPosition(){
        return this.position;
    }
        /**
     *getColor
     *@return color of the piece
     */
    public ColorEnum getColor(){
        return this.color;
    }
        /**
     *getType
     *@return the type of the piece
     */
    public PiecesTypeEnum getType(){
        return this.type;
    }
        /**
     *move to
     *@param Position p. Where the piece want to be moved
     * it checks if p is a legal move if its the case the move is done otherwhise it stays as it was
     */
    public void moveTo(Position p) {
        if (isLegalMove(p)) {
            this.position = p;
            this.legalMoves = null;
            return;
        } else
            return;
    }
      /**
     *getLegalMoves abstract method.
     */
    public abstract List<Position> getLegalMoves();
       /**
     *isLegalMove
     *@param Position p. Where the Piece want to be moved
     *@return true if p is a legalMove otherwhise false
     */
    public boolean isLegalMove(Position p) {
        List<Position> moves = this.getLegalMoves();
        return (moves.contains(p)) ? true : false;
    }
    /**
     *toString
     *@return the type of the piece.
     */
    @Override
    public String toString() {
        return this.type.toString();
    }
    /**
     *equals
     *@param Onject obj
     *@return true if Obj is a Piece and is the same color, type and has the same position as the Piece that calls the method
     */
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Piece))return false;
        Piece p = (Piece)obj;
        if(p.getType().equals(this.type) && p.getColor().equals(this.getColor()) && p.getPosition().equals(this.position))
        return true;
        return false;
    }
}
