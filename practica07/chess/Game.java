package chess;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.chessPieces.Rook;
import chess.pieces.chessPieces.Queen;
/**
/*@author iabin 
/*class Game
/*This class with a main that puts on a test the classes: Rook and Queen
/* THIS CLASS DO NOT CREATE OBJECTS
**/
public class Game{

    public static void main(String[] args) {
	System.out.println("Valid moves for a rook");
        Rook t = new Rook(new Position(4, 4),ColorEnum.BLACK); // We create an object named t from the class Rook
        System.out.println(t.getLegalMoves());//We print the legalMoves prom the object named t
	System.out.println("Valid moves for the Queen");
	Queen r = new Queen(new Position(4, 4),ColorEnum.BLACK);// We create an object named r from the class Queen
	 System.out.println(r.getLegalMoves());//We print the legalMoves prom the object named r
    }
}

