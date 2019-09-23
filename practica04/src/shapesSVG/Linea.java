package shapesSVG;
/**
/*@author Chubak
/* Clase Linea 
/* @param a que es de tipo Vector2
/* @param b que es de tipo Vector2
/* @param longitud que es de tipo double
 **/
public class Linea {

    private Vector2 a;
    private Vector2 b;
    private double longitud;

/**
/*Primer constructor
/* @param uno que es de tipo Vector2
/* @param dos que es de tipo Vector2
/* Asigna los vectores recibidos como elementos del objeto
 **/    
    public Linea (Vector2 uno, Vector2 dos){
	this.a=uno;
	this.b=dos;
    }

/**
/*Segundo constructor
/* @param x1 que es de tipo double
/* @param y1 que es de tipo double
/* @param x2 que es de tipo double
/* @param y2 que es de tipo double
/*Mediante los parametros recibidos crea dos vectores (x1,y1) (x2,y2)
 **/    
    public Linea (double x1,double y1, double x2, double y2){
        Vector2 uno= new Vector2 (x1,y2);
	 Vector2 dos=new Vector2 (x2,y2);
    this.a= uno;
    this.b=dos;
	
    }

    
/**
/*Constructor por default
/* No recibe ningun parametro
/* Crea dos vectores uno(0,0) y dos(1,1)
 **/    
    public Linea (){
	Vector2 uno= new Vector2 (0,0);
	 Vector2 dos=new Vector2 (1,1);
	 this.a=uno;
	 this.b=dos;
    }

/**
/*Metodo toSVG
/* Mediante los elementos de el objeto crea y regresa una cadena que lo representa graficamente
 **/    
    public String toSVG(){
	String res= "<line x1='"+this.a.getX()+"' y1='"+this.a.getY()+"' x2='"+this.b.getX()+"' y2='"+this.b.getY()+"' style='stroke:rgb(255,0,0);stroke-width:2' />";
	return res;	
    }


/**
/*Metodo toString 
/* Mediante los elementos de el objeto crea y regresa una cadena con los elementos del objeto 
 **/    
    public String toString(){

	String res="Linea dada por :\n 1er Vector= "+ this.a+"\n 2ndo Vector= "+this.b;
	return res;
    }

/**
/*Metodo equals 
/*@param
/* Compara ambos objetos de la clase Linea y en caso de que sus elementos sean iguales regresa true, en caso contrario false
 **/    
    public boolean equals(Linea linea2){
	if(this.a.getX()==linea2.a.getX() && this.a.getY()==linea2.a.getY() && this.b.getX()==linea2.b.getX() && this.b.getY()==linea2.b.getY()){
		return true;
	}
	    return false;

    }
    


}
