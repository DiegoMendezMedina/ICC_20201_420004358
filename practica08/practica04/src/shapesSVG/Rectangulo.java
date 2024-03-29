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
public class Rectangulo extends Shape{
    //private Vector2 a;
    //private double ancho;
    //private double alto;
    //private double perimetro;
    //private double area;
    

/**
/*Primer constructor de la clase Rectangulo 
/*@param uno de tipo Vector2
/*@param ancho de tipo double 
/*@param alto de tipo double
/* asigna los tres parametros que recibe como elementos del objeto
**/
    public Rectangulo(Vector2 uno, double ancho, double alto){
	super(uno,ancho,alto);
    }

    public double getArea(){
	return this.area;
    }
    
      @Override
    public int compareTo(Shape s){
        Rectangulo rec=(Rectangulo)s;
	if(this.area < rec.getArea()){
	    return -1;
	}
	if(this.area>rec.getArea()){
	    return 1;
	}
	return 0;
    }
  
     
/**
/* Metodo toSVG
/* Mediante los elementos del objeto crea y regresa  una cadena que lo representa graficamente en svg
**/
    @Override
    public String toSVG(){

	String rect="<rect x='"+this.punto.getX()+"' y='"+this.punto.getY()+"' width='"+this.mag1+"' height='"+this.mag2+"' fill:'red' />";
	
	return rect;
    }

    
/**
/* Metodo toString
/* Mediante los elementos del objeto crea y regresa  una cadena que describe al objeto
**/
    @Override
    public String toString(){
	String salida="Es un cuadrado dado por el vector : ("+this.punto.getX()+","+this.punto.getY()+") \n con altura de: "+this.mag1+ "\n ancho de :"+this.mag2 +"Con un area de :"+this.area+"\n Y un perimetro de : "+this.perimetro;
	return salida;
    }

    
/**
/* Metodo equals
/*@param segundo de la clase Rectangulo
/* compara cada elemento de ambos objetos y en caso de ser iguales regresa true en caso contrario false
**/
    @Override
    public boolean equals(Object obj){
	 if (!(obj instanceof Rectangulo))
            return false;

        Rectangulo r = (Rectangulo) obj;

	if(this.punto.getX()==r.punto.getX() && this.punto.getY()==r.punto.getY()&& this.mag1==r.mag1 && this.mag2==r.mag2 ){
	    return true;
	    }
	return false;
    }
}
