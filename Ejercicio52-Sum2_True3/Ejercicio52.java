/*
* Nombre: Jorge Lozoya Acosta 169868
* Dia: 26/02/2019
* Hora: 08:12 AM
*/
/*
52. Write a Java program to calculate the sum of two integers 
and return true if the sum is equal to a third integer.
*/

import java.util.Scanner; //Clase Scanner con metodos para recibir y guardar datos de entrada
public class Ejercicio52{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
//Pedir tres numeros al usuario
	System.out.print("Dar el primer numero: ");
		int a = in.nextInt(); //Metodo para recibir entrada a enteros
	System.out.print("Dar el segundo numero: ");
		int b = in.nextInt();
	System.out.print("Dar el tercer numero: ");
		int c = in.nextInt();
//Condiciones del problema
	if((a+b)==c)
		System.out.println("El resultado es: verdadero");
	else
		System.out.println("El resultado es: falso");
}
}