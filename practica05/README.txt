--->Como compilar:
	 Desde la terminal ir a la dirección -/ICC/practica05/src$

y ejecutar :
	  -/ICC/practica04/src$ javac Control.java

	  *Con esto se compila el programa
	  
----> Como ejecutar:

      Desde la terminal ir a la dirección  -/ICC/practica05/src$

y ejecutar:
      	 -/ICC/practica05/src$ java Control

	 *Con esto el programa se ejcuta
----->Problema6

/* Para llegar a lo anterior primero por lo dicho en el metodo problema5 con un for recorremos desde 2 hasta un elemento menor a n, cada que el for se "reinicie" damos por hecho que el numero es primo, y asi entramos a otro arreglo que va desde 2 hasta i, ya que obviamente n+1 no puede dividir exactamente a n. en este ultimo for nos preguntamos ¿i%j==0? en caso de ser cierto, por lo dicho en el metodo problema5 no es un numero primo por lo que primo=false. al salir del ultimo for nos preguntamos si primo es verdadero, ya que cada vez que se reinicie el primer for , como lo habia dicho anteriormente, se le asigna true a primo, la unica manera en la que siga siendo true despues del segundo for es que para los numeros anteriores a i ninguno lo haya dividido exactamente. Asi pues si es verdad que i sea primo, con ayuda de una variable auxiliar (aux) con un valor inicial a 0 , le asignamos al arreglo en la posiciòn aux (arreglo [aux]) va a adquirir el valor de i , solo en caso de que se  agregue algun primo al arreglo aux incrementa una unidad. Ahora con esto ya tenemos un arreglo con los numeros primos menores a n, pero como podemos ver el arreglo al que le asigna valores es de longitud n pero en ningun caso se da que la cantidad de numeros primos antes de n sea igual a n-1. Para regresar un arreglo que cumpla con lo que nos pide basta con crear otro arreglo(arregloFinal) de longitud aux y con otro for recorrer desde 2 hasta la longitud de el primer arreglo (arreglo) y en caso de que arreglo[indice] sea diferente de 0 le asigna el valor del arreglo[indice] en arregloFinal[aux2] y aux2 auentando cada vez que se le asigna un valor a arregloFinal.


-----> Consideraciones:
       Esqueleto={imports, declaracion de la clase, el main, nombre y firma de funciones}
       
      * Esqueleto del programa escrito por iabin
      * Todo lo demas escrito por Diego Mendez Medina

      Gracias a mi amigo y compañero Jose Luis Onofre que me ayudo en solucion de mis algoritmos y por brindarme el siguiente link (https://visualgo.net/en) que fue de gran utilidad para la realizaciòn de este programa.
       
