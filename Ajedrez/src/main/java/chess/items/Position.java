package chess.items;
/**
 *@author iabin
 *class Position
 */
public class Position{
    private int x; //x coord
    private int y; // y coord
/**
 *one and only builder of the class
 *@param x. x coord
 *@para y. y coord
 */
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }
/**
 *is legal
 *@return true if the move you want to make is legal. otherwhise false.
 */
    public boolean isLegal(){
        return (this.x < 8 && this.x > -1 && this.y < 8 && this.y > -1 )? true: false;
    }
    /**
     * @return the y
     */
    public int getY() {
        return y;
    }
/**
 *equals
 *@param obj
 *@return true if obj is the same object as the one that calls the mthod. otherwhise false.
 */
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Position))return false;
        Position p = (Position)obj;
        return (p.getX()==this.getX() && p.getY()== this.getY())? true: false;
    }
/**
 *toString
 *@return a string that indicates the position of a Piece.
 */
    @Override
    public String toString() {
        return "  ||x:"+this.getX()+" y:"+this.getY()+"||";
    }
    /**
 *isOutOfBoard
 *@param board_size
 *@return true if the coords are on the boardsize.
 */
    public boolean isOutOfBoard(int board_size){
        if(this.y >= board_size)return false;
        if(this.x >= board_size)return false;
        if(this.y < 0)return false;
        if(this.x < 0)return false;
        return true;
    }
}
