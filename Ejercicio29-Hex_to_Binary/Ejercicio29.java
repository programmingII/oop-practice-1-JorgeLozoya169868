/*
* Nombre: Jorge Lozoya Acosta
* Dia: 18/02/2019
* Hora: 9:35 AM
*/
/*
29. Write a Java program to convert a hexadecimal to a binary number. 
*/
import java.util.Scanner; // Libreria para recibir entradas desde el sistema
public class Ejercicio29{
	public static void main(String[] args){
	Scanner num = new Scanner(System.in); //Se crea un objeto tipo Scanner que leerá las entradas dadas desde el sistema
//Pedir un numero hexadecimal al usuario
System.out.println("Favor de dar un numero hexadecimal");
	String hex = num.nextLine(); //Metodo nextLine sirve para recibir en una cadena lo que ingrese el usuario

// El metodo Integer.parseInt analiza la cadena dada en el primer parametro y junto con la base dada en el segundo parametro, y devueleve un valor entero decimal
// El metodo Integer.toBinaryString convierte un valor decimal tipo entero en una cadena representando el valor en base 2
	System.out.println("Su numero octal en binario es: "+Integer.toBinaryString((Integer.parseInt(hex,16))));

	
}
}