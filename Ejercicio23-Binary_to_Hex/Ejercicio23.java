/*
* Nombre: Jorge Lozoya Acosta
* Dia: 16/02/2019
* Hora: 9:17 PM
*/
/*
23. Write a Java program to convert a binary number to hexadecimal number.
*/
import java.util.Scanner; // Libreria para recibir entradas desde el sistema
public class Ejercicio23{
	public static void main(String[] args){
	Scanner num = new Scanner(System.in);
//Pedir un numero binario usuario

System.out.println("Favor de dar un numero binario");
	String bin = num.nextLine(); //Metodo nextLine sirve para recibir en una cadena lo que ingrese el usuario

// Se convertira el valor tipo cadena a un numero entero decimal y lo guardara en la variable hex
// El metodo Integer.parseInt analiza la cadena dada en el primer parametro y lo compara en la base que se ponga en el segundo parametro, regresando asi un valor entero decimal
int hex = (Integer.parseInt(bin,2));

// El metodo toHexString de la clase Integer convertira el numero entero en hexadeciamal

	System.out.println("Su numero en hexadecimal es: "+Integer.toHexString(hex));

	
}
}