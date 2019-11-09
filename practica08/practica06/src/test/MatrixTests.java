package test;
import matriz.Matrix;
/**
/*@author Chubak 
/*Clase MatrixTests:
/*Es una clase que prueba los 7 problemas planteados en la practica numero6 de la materia ICC
/* ESTA CLASE NO ESTA HECHA PARA CREAR OBJETOS
/* La clase cuenta con un main donde se manda a llamar a cada uno de los metodos que pone a prueba los metodos de la clase Matrix
**/
public class MatrixTests{
    
    public static void scalarProduct_test(double scalar, Matrix b){
	double [][] fin={{0.0,0.0,0.0,0.0},{0.0,0.5,1.0,1.5},{0.0,1.0,2.0,2.0}} ;
	Matrix finn=new Matrix(fin);
	b.scalarProduct(scalar);
	if(b.equals(finn)){
	    System.out.println("ScalarProduct Funciona");
	}
	else{
	    System.out.println("ScalarProduct failed");
	}
	    
	

    }
/**
/*Metodo add_test
/*@param Matriz a; objeto de la clase Matrix
/* Metodo que pone a prueba el metodo add de la clase Matrix.
/* Imprime un mensaje si el metodo de la clase Matrix funciona bien o no
**/    
    public static void add_test(Matrix a){
	double [][] array= {{0.0,0.0,0.0,0.0},{0.0,1.0,2.0,3.0},{0.0,2.0,4.0,4.0}};
	Matrix comparacion= new Matrix(array);
	a.add(a);
	if(a.equals(comparacion)){
	    System.out.println("Metodo add Funciona");
	}
	else{
	    System.out.println("Error en metodo add");
	}
       
    }
/**
/*Metodo matrixProduct_test
/* Metodo que pone a prueba el metodo matrixProduct  de la clase Matrix.
/* Imprime un mensaje si el metodo de la clase Matrix funciona bien o no
**/    
    public static void matrixProduct_test(){
	
	double arreglo[][]={{2.0,0.0,1.0},{3.0,0.0,0.0},{5.0,1.0,1.0}};
	Matrix c= new Matrix(arreglo);
	double arreglo1[][]={{1.0,0.0,1.0},{1.0,2.0,1.0},{1.0,1.0,0.0}};
	double arregRes[][]={{5.0,1.0,3.0},{3.0,0.0,3.0},{12.0,4.0,6.0}};
	Matrix resp=new Matrix(arregRes);
	Matrix d= new Matrix(arreglo1);
	c.matrixProduct(d);
	if(c.equals(resp)){
	    System.out.println("metodo matrixProduct funciona");
	}
	else{
	    System.out.println("metodo natrixProduct failed");
	}
    }
/**
/*Metodo setElement_test
/* Metodo que pone a prueba el metodo setElement  de la clase Matrix.
/* Imprime un mensaje si el metodo de la clase Matrix funciona bien o no
**/        
    public static void setElement_test(){

	Matrix s= new Matrix (2,2);
	int j=1;
	int i=1;
	double r=10.5;
	s.setElement(i,j,r);
	double comp=s.getElement(i,j);
	
	if(comp==r){
	    System.out.println("metodo setElement funciona");
	}
	else{
	    System.out.println("metodo setElement failed");
	}
	
    }
    /**
/*Metodo getElement_test()
/* Metodo que pone a prueba el metodo getElement de la clase Matrix.
/* Imprime un mensaje si el metodo de la clase Matrix funciona bien o no
**/    
    public static void getElement_test(){

	double arreglo[][]={{2.0,0.0,1.0},{3.0,0.0,0.0},{5.0,1.0,10.0}};
	Matrix c= new Matrix(arreglo);

	if(c.getElement(2,2)==10){
	    System.out.println("metodo getElement funciona");
	}
	else{
	    System.out.println("getElement failes");
	}

    }
/**
/*Metodo determinant__test
/* Metodo que pone a prueba el metodo determinant de la clase Matrix.
/* Imprime un mensaje si el metodo de la clase Matrix funciona bien o no
**/    
    public static void determinant_test(){

	double[][] arrDet={{2.0,-3.0,1.0},{-3.0,5.0,7.0},{1.0,7.0,-1.0}};
	Matrix mDet= new Matrix(arrDet);
	double resp=-146;
	double respDet=mDet.determinant();
	if(resp==respDet){
	    System.out.println("metodo determinant funciona");
	}
	else{
	    System.out.println("metodo determinant failes");
	}
    }
    public static void equals_test(Matrix a, Matrix b){
	if(a.equals(b)==false && a.equals(a)==true){
	    System.out.println("El metodo equals funciona");

	}
	else{
	    System.out.println("El metodo equals NO funciona");
	}
    }
/**
/*Metodo main
/* Metodo que se ejecuta y manda a llamar a cada uno de los metodos test, tambien aqui se crean algunos objetos de la clase Matrix y unos valores que utlice en varios metodos de esta clase.
**/    
    public static void main(String[] args) {
	int n=6;
	int m=6;
	Matrix a= new Matrix(n,m);
	double [][] array= {{0,0,0,0},{0,1,2,3},{0,2,4,4}};
	Matrix b= new Matrix(array);
        scalarProduct_test(.5,b);
        add_test(b);
        matrixProduct_test();
        setElement_test();
        getElement_test();
        determinant_test();
        equals_test(b,a);
    }
}
