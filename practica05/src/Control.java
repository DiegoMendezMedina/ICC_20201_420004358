import java.util.ArrayList;
import java.util.Arrays;
/**
   /*@author Chubak iabin
   /*Clase Control:
   /*Es una clase que resuelvo los 6 problemas planteados en la practica numero5 de la materia ICC
   /* El main,nombre y firma  de los metodos son obra de iabin
   /* ESTA CLASE NO ESTA HECHA PARA CREAR OBJETOS
**/
public class Control{

    /**
       /* Metodo Problema1
       /*@param un objeto palabra de la clase String
       /* El metodo convierte la palabra a un arreglo y mediante un fot analiza si es un palindromo o no. Esto ultimo lo hace comparando la ultima letra del arreglo con la primera, despues la penultima con la segunda y asi sucesivamente, en caso de que no coincidan regresa falso. Si termino de recorrer el arreglo y nunca regreso false significa que la palabra es palindromo y regresa true.
    **/    
    public static boolean problema1(String palabra){
 
	char[] cadena1 = palabra.toCharArray();
	int aux= cadena1.length-1;

	for(int i=0;i<cadena1.length;i++){
	 
	    if(cadena1[i]!=cadena1[aux]){
		return false;
	    }
	    aux--;
	}
	
        return true;
	
    }

    /**
       /* Metodo Problema2
       /*@param un array de tipo entero llamado arreglo
       /*@param un entero llamado k
       /* Lo que hace el metodo es regresar true si el entero k se encuentra en el arreglo arreglo
    **/
    public static boolean problema2(int[] arreglo, int k){
	int aux=arreglo.length-1;
	for(int i=0; i<arreglo.length;i++){
	    if(arreglo[aux]+arreglo[aux-i]==k){
		return true;
	    }
	    for(int j=1;j<arreglo.length;j++){
		if(arreglo[aux-j]+arreglo[i]==k){
		    return true;
		}
	    }
	}
	return false;
    }

    /**
       /* Metodo Problema3
       /*@param un array de tipo entero llamado arreglo
       /* El metodo recibe un arreglo y lo regresa ordenado, de menor a maor.
       /* La idea para la elaboracion de este  metodo estuvo basada en https://visualgo.net/en
    **/    
    public static void problema3(int[] arreglo){
	int izq;
	int der;
      for(int i=0; i<arreglo.length-1;i++){
	for(int j=0; j<arreglo.length-1-i;j++){
	    if(arreglo[j]>arreglo[j+1]){
		izq=arreglo[j];
		arreglo[j]=arreglo[j+1];
		arreglo[j+1]=izq;
	    }
	}
	}

     
    }

    /**
       /* Metodo Problema4
       /*@param un array de tipo entero llamado arreglo
       /*@param un entero llamado buscando
       /* El metodo con un indice recorre un arreglo mediante un for en caso de que el arreglo en alguna posicion sea igual al entero buscando regresa true. Si el for ya recorrio todo el metodo y nunca paso que el entero buscando estuviera en el arreglo regresa false.
    **/ 
    public static boolean problema4(int[] arreglo, int buscando){
	
	for(int i=0; i<arreglo.length-1;i++){
	    if(buscando==arreglo[i]){
		return true;
	    }
	}
	return false;
    }
    /**
       /* Metodo Problema5
       /*@param un entero llamado n
       /* El metodo determina si el numero n es primo o no
       /*Como bien ya sabemos el primer numero primo por definicion es 2, asi pues su n es menor a 2, no es primo. Por lo anterio vamos a recorrer en un for desde 2 hasta un numero menor a n. Y si en algun momento n%i es igual a 0 (Es decir que el residuo de la division n/i es 0) implica que n no es primo, ya que a n lo divide 1, el valor de i y si mismo.
    **/
    public static boolean problema5(int n){
	if(n>1){
	    for(int i=2;i<n;i++){
		if(n%i==0){
		    return false;
		}
	    }
	}
	else{
	    return false;
	}
	return true;
    }
    
    /**
       /* Metodo Problema6
       /*@param un entero llamado n
       /* El metodo regresa un arreglo de enteros con todos los numeros primos antes de n.
       /* Con una variable booleana (primo) el metodo nos permite saber si es primo o no.
       /* Procedimiento en el readme
    **/ 
    public static int[] problema6(int n){
	boolean primo;
	int aux=0;
	int aux2=0;
	int [] arreglo=new int [n];
	int [] arregloFinal;
	for(int i=2; i<n;i++){
	    primo=true;
	    for(int j=2;j<i;j++){
		if(i%j==0){
		    primo=false;
		}
	    }
	    if(primo){
		arreglo[aux]=i;
		aux++;
	    
	    }
	}

	arregloFinal= new int [aux];
	
	for(int i=0;i<arreglo.length;i++){
	    if(arreglo[i]!=0){
		arregloFinal[aux2]=arreglo[i];
		aux2++;
	    }
	}
     	return arregloFinal;
    }

    /**
       /*@author iabin
       /*Metodo main que evalua los problemas dados para la practica5
    **/ 
    public static void main(String[] args) {
        String resultado = "";
        int[] desordenado = {9,8,7,6,5,4,3,2,1};
        int[] ordenado    = {1,2,3,4,5,6,7,8,9};
        int[] primos10 = {2,3,5,7};
        if(problema1("oso")==true && problema1("palabra")==false)resultado+="P1 bien\n";else resultado+="P1 mal\n";
        if(problema2(desordenado, 17)==true) resultado+="P2 bien\n";else resultado+="P2 mal\n";
        problema3(desordenado);
        if(Arrays.equals(desordenado,ordenado) == true)resultado+="P3 bien\n";else resultado+="P3 mal\n";
        if(problema4(desordenado,2)== true && problema4(desordenado,18)== false)resultado+="P4 bien\n";else resultado+="P4 mal\n";
        if(problema5(7)==true && problema5(6)==false)resultado+="P5 bien\n";else resultado+="P5 mal\n";
        if(Arrays.equals(problema6(10), primos10) == true)resultado+="P6 bien\n";else resultado+="P6 mal\n";
        System.out.println(resultado);   
    }

}
