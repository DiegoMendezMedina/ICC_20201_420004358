package shapesSVG;
/**
/*@author Chubak
/* Clase Vector 2 que crea objetos Vectores o puntos
/* @param double x que es la coordenada en x del vector  
/* @param double y que es la coordenada en x del vector
/* @param double magnitud describe la magnitud del vector
 **/
public class Vector2{
    private double x;
    private double y;
    private double magnitud;

/**
/*Primer constructor de la clase Vector2
/* Recibe un double x que sera la coordenada en x
/* Recibe un double y que sera la coordenada en y
/* Dados los elementos que recibe se los asigna al nuevo objeto y una magnitud de uno
**/    
    public Vector2(double x, double y){
	this.x=x;
	this.y=y;
	this.magnitud=1;


    }

/**
/*Degundo constructor de la clase Vector2 
/* Constructor por default 
/*Asigna los las coordenadas (0,0) al vector yna magnitud de uno
**/      
    public Vector2(){
	this.x=0;
	this.y=0;
	this.magnitud=1;

    }

/**
/*Metodo distancia 
/* Recibe un objeto de la clase Vector2
/* Mediante pitagoras calcula la distancia entre un Vector2 y otro
/* Regresa la distancia de tipo double
**/  
    public  double distancia(Vector2 vec){
	
	double dis=Math.sqrt( Math.pow(vec.x-this.x,2)+Math.pow(vec.y-this.y,2) );
	return dis;
    }
/**
/*Metodo toSVG 
/* No recibe ningun parametro
/* Agarra los elemntos del objeto y crea una cadena que representa a un vector en SVG
/* Regresa la cadena svg
**/
        public  String toSVG(){
	    String svg= "<circle cx='"+this.x +"' cy='"+ this.y + "' r='5' stroke= 'yellow' stroke width='50' fill='green' />";
	    return svg;
    }
/**
/*Metodo toString
/*No recibe ningun parametro
/* Dados los parametros del objeto crea y regresa  una cadena
**/
    @Override
   public String toString(){
	String salida="("+this.x+","+this.y+")";
	return salida;
    }
/**
/*Metodo equals
/* Recibe un objeto de la clase Vector2
/* Si los parametros de ambos objetos de la clase Vector2 son iguales regresa un true en caso contrario un false
**/    
    public boolean equals(Vector2 vec){
	if(this.x==vec.x && this.y==vec.y){
	    return true;
	}
	else{
	    return false;
	}
    }

/**
/*Metodo getX
/*No recibe ningun parametro
/*Regresa el parametro x del objeto
**/    
    public  double getX(){
	return this.x;
    }
/**
/*Metodo SetX
/*Recibe un parametro double el cual se lo asigna al parametro x del objeto
**/        
    public void setX(double x){
	this.x=x;
    }
/**
/*Metodo gety
/*No recibe ningun parametro
/*Regresa el parametro y del objeto
**/    
     public  double getY(){
	return this.y;
    }

/**
/*Metodo SetY
/*Recibe un parametro double el cual se lo asigna al parametro y del objeto
**/    
    public  void setY(double x){
	this.y=x;
    }

 }
