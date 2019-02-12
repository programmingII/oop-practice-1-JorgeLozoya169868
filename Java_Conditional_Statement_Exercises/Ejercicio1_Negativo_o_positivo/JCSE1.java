/*
* Nombre: Jorge Lozoya Acosta
* Dia: 12/02/2019
* Hora: 12:33 PM
 JCSE1 Java Conditional Statement Exercises 1
*/
/*
1. Write a Java program to get a number from 
the user and print whether it is positive or negative.
*/
import java.util.Scanner; //Libreria que permite capturar valores de entrada

public class JCSE1{

	public static void main(String[] args){
	Scanner num = new Scanner(System.in); //Se crea un objeto num para usar el metodo nextFloat
	System.out.println("Favor de dar un numero para saber si es positivo o negativo"); //Pedir al usuario 			
		float numero = num.nextFloat(); //el metodo nextFloat() guardará el valor ingresado por el usuario en la variable numero
	
	if(numero < 0) //Hacemos un condicional para que los numeros menores a 0 hagan la siguiente accion		
	System.out.println("El numero es negativo"); // Con todos los numeros menores a 0 imprimirá que es negativo
		
	if(numero == 0) // Si el usuario pone el numero 0 se aplicará lo entre llaves		
	System.out.println("El numero es igual a 0"); //Cuando la condición se cumpla, imprimira que el numero es igual a 0
		
	if(numero > 0)
	System.out.println("El numero es positivo"); //En caso de que sea mayor a 0 entonces el numero que ingresó el usuario debería de ser positivo
	
}
}