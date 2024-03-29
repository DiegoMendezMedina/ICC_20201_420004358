package shapesSVG;
/**
/*Clase Rectangulo
/*@author Chubak
/*@param a de tipo Vector2
/*@param ancho de tipo double
/*@param alto de tipo double
/*@param perimetro de tipo double
/*@param area de tipo double
**/
public class Rectangulo{
    private Vector2 a;
    private double ancho;
    private double alto;
    private double perimetro;
    private double area;
    

/**
/*Primer constructor de la clase Rectangulo 
/*@param uno de tipo Vector2
/*@param ancho de tipo double 
/*@param alto de tipo double
/* asigna los tres parametros que recibe como elementos del objeto
**/
    public Rectangulo(Vector2 uno, double ancho, double alto){
	this.a=uno;
	this.ancho=ancho;
	this.alto=alto;
	this.area=this.ancho*this.alto;
	this.perimetro= 2*this.ancho+2*this.alto;
    }

    
/**
/*Segundo constructor de la clase Triangulo 
/*@param x1 de tipo double
/*@param y1 de tipo double
/*@param x2 de tipo double
/*@param y2 de tipo double
/*@param x3 de tipo double
/*@param y3 de tipo double
/*con x1 y y1 crea un objeto de la clase Vector2 y se lo asigna al elemento a del objeto asi con ancho y alto 
**/
    public Rectangulo(double x, double y, double ancho, double alto){
	a= new Vector2(x,y);
	this.ancho=ancho;
	this.alto=alto;
		this.area=this.ancho*this.alto;
	this.perimetro= 2*this.ancho+2*this.alto;
    }

    
/**
/* Constructor por default
/* Crea un vector en el punto  a(0,0),un ancho de 5 y alto de 10 
**/
    public Rectangulo(){
	a= new Vector2(0,0);
	this.ancho=5;
	this.alto=10;
		this.area=this.ancho*this.alto;
	this.perimetro= 2*this.ancho+2*this.alto;
    }

     
/**
/* Metodo toSVG
/* Mediante los elementos del objeto crea y regresa  una cadena que lo representa graficamente en svg
**/
    public String toSVG(){

	String rect="<rect x='"+this.a.getX()+"' y='"+this.a.getY()+"' width='"+this.ancho+"' height='"+this.alto+"' fill:'red' />";
	
	return rect;
    }

    
/**
/* Metodo toString
/* Mediante los elementos del objeto crea y regresa  una cadena que describe al objeto
**/
    public String toString(){
	String salida="Es un cuadrado dado por el vector : ("+this.a.getX()+","+this.a.getY()+") \n con altura de: "+this.alto+ "\n ancho de :"+this.ancho +"Con un area de :"+this.area+"\n Y un perimetro de : "+this.perimetro;
	return salida;
    }

    
/**
/* Metodo equals
/*@param segundo de la clase Rectangulo
/* compara cada elemento de ambos objetos y en caso de ser iguales regresa true en caso contrario false
**/
    public boolean equals(Rectangulo rectangulo2){
	if(this.a.getX()==rectangulo2.a.getX() && this.a.getY()==rectangulo2.a.getY()&& this.alto==rectangulo2.alto && this.ancho==rectangulo2.ancho ){
	    return true;
	}
	return false;
    }
}
