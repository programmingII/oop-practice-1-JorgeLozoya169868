/*
* Nombre: Jorge Lozoya Acosta 169868
* Dia: 26/02/2019
* Hora: 09:35 AM
*/
/*
59. Write a Java program to convert a 
given string into lowercase.
*/

import java.util.Scanner; //Clase Scanner con metodos para recibir y guardar datos de entrada
class Ejercicio59{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
//Capturar la frase
	System.out.println("Escribir una frase para todo en minuscula:");
		String frase = in.nextLine();
//https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#toLowerCase--
	System.out.println(frase.toLowerCase());
}
}