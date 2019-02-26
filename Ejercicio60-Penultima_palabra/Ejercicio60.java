/*
* Nombre: Jorge Lozoya Acosta 169868
* Dia: 26/02/2019
* Hora: 10:00 AM
*/
/*
60. Write a Java program to find 
the penultimate (next to last) word of a sentence.
*/

import java.util.Scanner; //Clase Scanner con metodos para recibir y guardar datos de entrada
class Ejercicio60{
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
System.out.print("Dar un enunciado: ");
	 String frase = in.nextLine();
	 String[] palabras = frase.split("[ ]+"); //Splits this string around matches of the given regular expression.
	 System.out.println("Penultima palabra: "+palabras[palabras.length - 2]);
}
}