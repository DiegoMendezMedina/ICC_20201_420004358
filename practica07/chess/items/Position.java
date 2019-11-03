package chess.items;
/**
/*@author iabin
/*Class Position:
/*This class makes objects that determine the position of a chess piece on the chess board.
/*@param This class has two ints; x and y. 
**/
public class Position{
    private int x;
    private int y;
/**
/*One and only constructor of the class Position.
/*@param the constructor gets two ints ; x and y.
**/
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

/**
/*Method getX
/*This method return and int, the coord on the x axis
**/
    public int getX() {
        return x;
    }

/**
/*Method getY
/*This method return and int, the coord on the Y axis
**/
    public int getY() {
        return y;
    }
/**
/*Method equals
/*This method determines if one position is equal to another. Return true if is the same position, false on the opposite.
**/
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Position))return false;
        Position p = (Position)obj;
        return (p.getX()==this.getX() && p.getY()== this.getY())? true: false;
    }
/**
/*Method toString
/*This method return a String with all the posible moves a Piece can do.
/* Eg:||x:4 y:4||
**/
    @Override
    public String toString() {
        return "  ||x:"+this.getX()+" y:"+this.getY()+"||";
    }

/**
/*isOutOfBoard
/*This method return  true in case the move you want to make is a valid move. Otherwhise it return false.
**/    
    public boolean isOutOfBoard(int board_size){
        if(this.y >= board_size)return false; 
        if(this.x >= board_size)return false;
        if(this.y < 0)return false;
        if(this.x < 0)return false;
        return true;
    }
}
