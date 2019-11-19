package main;
import  shapesSVG.*;
import shapesSVG.Linea;
public class Main{

    public static void main(String args []){
	String inicio= "<svg height='700' width='700'>";
	String cierre="</svg>";
	Vector2 vector = new Vector2(50,200);
	Vector2 vector2 = new Vector2(500,200);
	Vector2 vector3= new Vector2(500,50);
	Vector2 vector4= new Vector2(500,350);
	Vector2 vector5 = new Vector2(650,200);
       	System.out.println(inicio);
	System.out.println(vector.toSVG());
	System.out.println(vector2.toSVG());
	System.out.println(vector3.toSVG());
	System.out.println(vector4.toSVG());
	System.out.println(vector5.toSVG());
	System.out.println(vector.equals(vector2));
	
	Linea linea1= new Linea(vector,vector2);
      	Linea linea2=new Linea(vector2,vector3);
	Linea linea3=new Linea(vector3,vector4);
	Linea linea4=new Linea(vector2, vector5);

	System.out.println(linea1.toSVG());
	System.out.println(linea2.toSVG());
	System.out.println(linea3.toSVG());
	System.out.println(linea4.toSVG());

	Vector2 vector7= new Vector2(250,50);
	Rectangulo rectangulo = new Rectangulo(vector7,80,100);
       	System.out.println(rectangulo.toSVG());
	System.out.println(vector7.toSVG());

	Vector2 vector8= new Vector2(250,250);
	Vector2 vector9= new Vector2(250,350);
	Vector2 vector10= new Vector2(350,350);
	Triangulo trian= new Triangulo(vector8,vector9,vector10);
       	System.out.println(trian.toSVG());

	//Transform trans=(t) -> 10;
	//System.out.println(trian.trans.transform(10));
	
	Vector2 vector6 = new Vector2(600,100);
	Circulo circ= new Circulo(vector6,50,100);
       	System.out.println(circ.toSVG());
	System.out.println(vector6.toSVG());
	
	System.out.println(cierre);
    }
}
