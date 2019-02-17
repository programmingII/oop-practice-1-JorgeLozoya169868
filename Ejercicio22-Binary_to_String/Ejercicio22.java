/*
* Nombre: Jorge Lozoya Acosta
* Dia: 16/02/2019
* Hora: 6:17 PM
*/
/*
22. Write a Java program to convert a binary number to decimal number.
*/
import java.util.Scanner; // Libreria para recibir entradas desde el sistema
public class Ejercicio22{
	public static void main(String[] args){
	Scanner num = new Scanner(System.in);
//Pedir un numero binario al usuario

System.out.println("Favor de dar un numero binario");
	String bin = num.nextLine(); //Metodo nextLine sirve para recibir en una cadena lo que ingrese el usuario

// El metodo toBinaryString de la clase Integer convertira el numero en binario
// El metodo Integer.parseInt analiza la cadena dada en el primer parametro y lo convierte en la base que tiene en el segundo parametro, y devuelve un // entero representando por un argumento string con la base especificada
	System.out.println("Su numero en decimal es: "+(Integer.parseInt(bin,2)));

	
}
}