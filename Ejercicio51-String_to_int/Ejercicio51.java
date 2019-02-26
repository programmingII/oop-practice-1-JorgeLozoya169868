/*
* Nombre: Jorge Lozoya Acosta 169868
* Dia: 26/02/2019
* Hora: 07:55 PM
*/
/*
51. Write a Java program to convert a string to an integer in Java.
*/

import java.util.Scanner; //Clase Scanner con metodos para recibir y guardar datos de entrada
public class Ejercicio51{
	public static void main(String[] args){
	
	Scanner num = new Scanner(System.in);//se crea un objeto tipo Scanner donde se guardará las entradas
//Pedimos al usuario un numero
	System.out.println("Ingresa el numero (cadena): ");
	String x = num.nextLine(); //Guardamos la cadena con el metodo nextLine de Scanner
	//int a = Integer.parseInt(x); //Se convierte un valor cadena a un valor entero
	System.out.println("El numero en valor de entero es: "+Integer.parseInt(x));
//La clase Integer con el metodo parseInt nos permite convertir una cadena a un valor entero
}
}