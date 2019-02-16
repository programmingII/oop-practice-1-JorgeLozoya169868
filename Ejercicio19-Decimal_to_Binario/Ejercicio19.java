/*
* Nombre: Jorge Lozoya Acosta 169868
* Dia: 16/02/2019
* Hora: 01:06 PM
*/
//19. Write a Java program to convert a decimal number to binary number.

import java.util.Scanner;
public class Ejercicio19{
	public static void main(String[] args){
	
	Scanner num = new Scanner(System.in);

// Pedir al usuario un numero decimal

	System.out.print(" Dar cualquier numero entero en decimal: ");
// La variable dec Guardara el valor decimal que el usuario ingreso en tipo cadena
	String dec = num.nextLine();

// El metodo toBinaryString de la clase Integer convertira el numero en binario
// El metodo Integer.parseInt analiza la cadena dada en el primer parametro y lo convierte en la base que tiene en el segundo parametro, y devuelve un // entero representando por un argumento string con la base especificada
	//System.out.println(Integer.toBinaryString((Integer.parseInt(dec,2))));
	// System.out.println(Integer.parseInt(dec,2));
System.out.print("Su numero en binario es:  "+Integer.toBinaryString((Integer.parseInt(dec, 10)))); 
}
}