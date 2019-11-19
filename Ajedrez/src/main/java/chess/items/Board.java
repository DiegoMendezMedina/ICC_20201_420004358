package chess.items;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.chessPieces.Empty;
import chess.pieces.chessPieces.*;
/**
 *@author iabin
 *class Board 
 */
public class Board{
    public int SIZE = 8; //size of the board
    public Piece[][] matrix; // array of pieces (Pieces in a chess game)
    private static Board instance = null; 
    private Board(){
        this.matrix = new Piece[SIZE][SIZE]; // we initialize the board
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                this.matrix[i][j] = new Empty(new Position(i, j), ColorEnum.NONE); // all the places in the array are set on null
            }
        }
        this.matrix[7][7] = new Rook(new Position(7, 7), ColorEnum.WHITE); //White rook set on his position 
	this.matrix[0][7] = new Rook(new Position(0, 7), ColorEnum.WHITE); 
        this.matrix[0][0] = new Rook(new Position(0, 0), ColorEnum.BLACK); // one of the black rooks set on his position
        this.matrix[7][0] = new Rook(new Position(7, 0), ColorEnum.BLACK); //second of the two black rooks set on his position
	this.matrix[3][0]= new Queen(new Position(3,0), ColorEnum.BLACK);
	this.matrix[3][7]= new Queen(new Position(3,7), ColorEnum.WHITE);
	this.matrix[4][0]= new King(new Position(4,0), ColorEnum.BLACK);
	this.matrix[4][7]= new King(new Position(4,7), ColorEnum.WHITE);
	this.matrix[5][0]= new Bishop(new Position(5,0), ColorEnum.BLACK);
	this.matrix[5][7]= new Bishop(new Position(5,7), ColorEnum.WHITE);
	this.matrix[2][0]= new Bishop(new Position(2,0), ColorEnum.BLACK);
	this.matrix[2][7]= new Bishop(new Position(2,7), ColorEnum.WHITE);

	this.matrix[6][0]= new Knight(new Position(6,0), ColorEnum.BLACK);
	this.matrix[6][7]= new Knight(new Position(6,7), ColorEnum.WHITE);
	this.matrix[1][0]= new Knight(new Position(1,0), ColorEnum.BLACK);
	this.matrix[1][7]= new Knight(new Position(1,7), ColorEnum.WHITE);
	
	
	for(int i=0;i<8;i++){
	    this.matrix[i][1]= new Pawn(new Position(i,1), ColorEnum.BLACK);
	}
	for(int i=0;i<8;i++){
	    this.matrix[i][6]= new Pawn(new Position(i,6), ColorEnum.WHITE);
	}

    }
    /**
     *getInstance
     *@return the current status of the board 
     */
    public static Board getInstance(){
        if(instance == null)
            instance = new Board();
        return instance;
    }
    /**
     *getSize
     *@return the size og the board
     */
    public int getSize(){
        return this.SIZE;
    }
    /**
     *move
     *@param Position p. Position of the piece we want to move
     *@param Position q. Position where we want to move
     *We set the new position(t) to the piece that started on p. And we set p as empty.
     */
    public void move(Position p, Position q){
        if(!p.isLegal() || !q.isLegal())return;
        Piece piece = this.getPiece(p);
        if(!piece.isLegalMove(q))return;
        piece.moveTo(q);
        this.matrix[p.getX()][p.getY()] = new Empty(p,ColorEnum.NONE);
        this.matrix[q.getX()][q.getY()] = piece; 
    }
    /**
 *getPiece
 *@param Position p
 *@return the Piece in the position p
 */
    public Piece getPiece(Position p){
        //if(p.isOutOfBoard(SIZE))return null;
        return this.matrix[p.getX()][p.getY()];
    }

/**
 *toString
 *@return the String that represents the actual state of the board.
 */
    public String toString(){
        var result = "";
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                result = " "+ this.matrix[i][j]+" "+result;
            }
            result += '\n';
        }
        return result;
    }

}
