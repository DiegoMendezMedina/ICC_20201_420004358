package shapesSVG;
/**
/*Clase Triangulo
/*@author Chubak
/*@param a de tipo Vector2
/*@param b de tipo Vector2
/*@param c de tipo Vector2
/*@param perimetro de tipo double
/*@param area de tipo double
**/
public class Triangulo{
    private Vector2 a;
    private Vector2 b;
    private Vector2 c;
    private double perimetro;
    private double area;

/**
/*Primer constructor de la clase Triangulo 
/*@param primero de tipo Vector2
/*@param segundo de tipo Vector2
/*@param tercero  de tipo Vector2
/* asigna los tres parametros que recibe como elementos del objeto
**/
    public Triangulo(Vector2 primero, Vector2 segundo, Vector2 tercero){
	this.a=primero;
	this.b=segundo;
	this.c=tercero;
	this.perimetro=this.a.distancia(b)+this.b.distancia(c)+this.c.distancia(a);
	this.area=this.a.distancia(b)*(this.a.distancia(c))/2;
    }

/**
/*Segundo constructor de la clase Triangulo 
/*@param x1 de tipo double
/*@param y1 de tipo double
/*@param x2 de tipo double
/*@param y2 de tipo double
/*@param x3 de tipo double
/*@param y3 de tipo double
/*con x1 y y1 crea un objeto de la clase Vector2 y se lo asigna al elemento a del objeto
/*con x2 y y2 crea un objeto de la clase Vector2 y se lo asigna al elemento b del objeto
/*con x3 y y3 crea un objeto de la clase Vector2 y se lo asigna al elemento c del objeto
**/
    public Triangulo(double x1, double y1,double x2, double y2,double x3, double y3 ){
	this.a= new Vector2(x1,y1);
	this.b= new Vector2(x2,y2);
	this.c= new Vector2(x3,y3);
	this.perimetro=this.a.distancia(b)+this.b.distancia(c)+this.c.distancia(a);
		this.area=this.a.distancia(b)*(this.a.distancia(c))/2;
    }
/**
/* Constructor por default
/* Crea tres vectores en los puntos a(0,0),b(10,10) y c(5,10)
**/
    public Triangulo(){
	this.a= new Vector2(0,0);
	this.b= new Vector2(10,10);
	this.c= new Vector2(5,10);
	this.perimetro=this.a.distancia(b)+this.b.distancia(c)+this.c.distancia(a);
		this.area=this.a.distancia(b)*(this.a.distancia(c))/2;
    }
    
/**
/* Metodo toSVG
/* Mediante los elementos del objeto crea y regresa  una cadena que lo representagraficamente en svg
**/
    public String toSVG(){
	String tri="<polygon points= '"+this.a.getX()+","+this.a.getY()+" "+this.b.getX()+","+this.b.getY()+" "+this.c.getX()+","+this.c.getY()+"' />";

	return tri;
    }
/**
/* Metodo toString
/* Mediante los elementos del objeto crea y regresa  una cadena que describe al objeto
**/
    public String toString(){
	String salida="Es un triangulo dado por los puntos : \n Punto1: ("+this.a.getX()+","+this.a.getY()+") \n Punto2: ("+this.b.getX()+","+this.b.getX()+") \n Punto3: ("+this.c.getX()+","+this.c.getY()+") \n Con un perimetro de : "+this.perimetro+"\n Y un area de : "+this.area;
	return salida;
    }
/**
/* Metodo equals
/*@param segundo de la clase Triangulo
/* compara cada elemento de ambos objetos y en caso de ser iguales regresa true en caso contrario false
**/
    public boolean equals(Triangulo segundo){
	if(this.a.getX()==segundo.a.getX() && this.a.getY()==segundo.a.getY() && this.b.getX()==segundo.b.getX() && this.b.getY()==segundo.b.getY() && this.c.getX()==segundo.c.getX() && this.c.getY()==segundo.c.getY()) return true;
	return false;
    }

}
