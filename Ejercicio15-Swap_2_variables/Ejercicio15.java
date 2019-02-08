/*
* Nombre: Jorge Lozoya Acosta 169868
* Dia: Feb/08/2019
* Hora 1:10 PM
*/
/*
15. Write a Java program to swap two variables.
*/

import java.util.Scanner; //Importar la clase Scanner para recibir imputs
public class Ejercicio15{
	public static void main(String[] args)
	{	
		Scanner swap = new Scanner(System.in); //Se crea un objeto swap en la clase Scanner para todo lo que el usuario escriba	
		System.out.println("Favor de dar el valor de la variable A"); //Pedimos al usuario un numero cualquiera
			int A = swap.nextInt();			     	      //Capturamos el valor en una variable int A
		System.out.println("Favor de dar el valor de la variable B"); //Repetimos el mismo procedimiento para la variable B
			int B = swap.nextInt();
		int temp = A;
		System.out.println("Antes del cambio A = "+A+" y B = "+B);
			 A = B; B = temp;
		System.out.println("Despues del cambio A = "+A+" y B = "+B);				
	}

}