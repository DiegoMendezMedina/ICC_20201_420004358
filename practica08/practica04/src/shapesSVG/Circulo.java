package shapesSVG;
/**
/*Clase que permite crear un Circulo y pasarlo a SVG1
/*
**/
public class Circulo extends Shape{
    //private Vector2 centro;
    //public double radio;
    //public double perimetro;
    //public double area;
/**
/*Primer Constructor de la clase Circulo 
/* @param centro que es de tipo Vector2 y radio de tipo double 
/* Asigna los datos recibidos y se los asigna al objeto
**/
    public Circulo(Vector2 centro,double radio,double diametro){
	
	super(centro, radio,2*radio);
    }

    public double getArea(){
	return this.area;
    }
   
    @Override
    public int compareTo(Shape s){
        Circulo circ=(Circulo)s;
	if(this.area < circ.getArea()){
	    return -1;
	}
	if(this.area>circ.getArea()){
	    return 1;
	}
	return 0;
    }
    

/**
/*Metodo toSVG
/* Agarra los elementos del objeto, crea y regresa una cadena que representa graficamente el circulo en svg
**/
    @Override
    public String toSVG(){
	String svg =  "<circle cx='"+this.punto.getX() +"' cy='"+ this.punto.getY() + "' r='"+this.mag1+"' stroke= 'green' stroke width='4' fill='yellow' />";
	return svg;
    }
    
/**
/*Metodo toString
/* Es una metodo que crea y regresa una cadena con los elementos del objeto
**/
    @Override
    public String toString(){
	String cadena= "El circulo esta dado por: \n el punto: ("+this.punto.getX()+","+this.punto.getY()+") \n con un radio de :"+this.mag1+" \n Tiene un area de : "+this.area+"\n un Un perimetro de : "+this.perimetro;
	return cadena;
    }

/**
/*Clase equals
/* @param otro de de la clase Circulo
/* Compara cada elemento de dos circulos y regresa true si son iguales y false si son diferentes
**/
    @Override
    public boolean equals(Object obj){
	 if (!(obj instanceof Circulo))
            return false;

        Circulo otro = (Circulo) obj;
	if(this.punto.getX()==otro.punto.getX()&& this.punto.getY()==otro.punto.getY() && this.mag1==otro.mag1 ) return true;															   return false;
    }


}
