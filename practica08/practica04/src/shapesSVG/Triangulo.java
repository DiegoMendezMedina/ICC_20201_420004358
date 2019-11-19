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
public class Triangulo extends Shape {
    //implements Transformable
    private Vector2 b;
    private Vector2 c;


/**
/*Primer constructor de la clase Triangulo 
/*@param primero de tipo Vector2
/*@param segundo de tipo Vector2
/*@param tercero  de tipo Vector2
/* asigna los tres parametros que recibe como elementos del objeto
**/
    public Triangulo(Vector2 primero, Vector2 segundo, Vector2 tercero){
	super(primero);
	this.b=segundo;
	this.c=tercero;
	this.perimetro=this.punto.distancia(b)+this.b.distancia(c)+this.c.distancia(punto);
	this.area=this.punto.distancia(b)*(this.punto.distancia(c))/2;
    }
    
/**
/* Metodo toSVG
/* Mediante los elementos del objeto crea y regresa  una cadena que lo representagraficamente en svg
**/
    @Override
    public String toSVG(){
	String tri="<polygon points= '"+this.punto.getX()+","+this.punto.getY()+" "+this.b.getX()+","+this.b.getY()+" "+this.c.getX()+","+this.c.getY()+"' />";

	return tri;
    }
/**
/* Metodo toString
/* Mediante los elementos del objeto crea y regresa  una cadena que describe al objeto
**/
    @Override
    public String toString(){
	String salida="Es un triangulo dado por los puntos : \n Punto1: ("+this.punto.getX()+","+this.punto.getY()+") \n Punto2: ("+this.b.getX()+","+this.b.getX()+") \n Punto3: ("+this.c.getX()+","+this.c.getY()+") \n Con un perimetro de : "+this.perimetro+"\n Y un area de : "+this.area;
	return salida;
    }
/**
/* Metodo equals
/*@param segundo de la clase Triangulo
/* compara cada elemento de ambos objetos y en caso de ser iguales regresa true en caso contrario false
**/
    @Override
    public boolean equals(Object obj){
	 if (!(obj instanceof Triangulo))
            return false;

        Triangulo segundo = (Triangulo) obj;
	if(this.punto.getX()==segundo.punto.getX() && this.punto.getY()==segundo.punto.getY() && this.b.getX()==segundo.b.getX() && this.b.getY()==segundo.b.getY() && this.c.getX()==segundo.c.getX() && this.c.getY()==segundo.c.getY()) return true;
	return false;
    }
     /**
     *Metodo compareTo , comparados rectangulos
    **/
      @Override
    public int compareTo(Shape s){
        Triangulo rec=(Triangulo)s;
	if(this.area < rec.getArea()){
	    return -1;
	}
	if(this.area>rec.getArea()){
	    return 1;
	}
	return 0;
    }
        /**
     *Metodo getArea
     **/
    public double getArea(){
	return this.area;
    }

    /**
     *Transform al triangulo 
     */
    /*
    public void transform(Transformable<Triangulo> change){
	Vector2[] pos={new Vector2(), new Vector2(), new Vector2()};
	Traingulo trans = change.transform(pos);
	if(transformado != null){
	    this.punto=trans.getPunto();
	    this.b= trans.getB();
	    this.c=trans.getC();
	}
    }
    */
    //Getters
    public Vector2 getPunto(){
	return this.punto;
    }
    public Vector2 getB(){
	return this.b;
    }
    public Vector2 getC(){
	return this.c;
    }
}
