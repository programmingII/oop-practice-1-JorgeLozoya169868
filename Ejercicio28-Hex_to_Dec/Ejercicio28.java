/*
* Nombre: Jorge Lozoya Acosta
* Dia: 18/02/2019
* Hora: 9:25 AM
*/
/*
28. Write a Java program to convert a hexadecimal to a decimal number.
*/
import java.util.Scanner; // Libreria para recibir entradas desde el sistema
public class Ejercicio28{
	public static void main(String[] args){
	Scanner num = new Scanner(System.in); //Se crea un objeto tipo Scanner que leerá las entradas dadas desde el sistema
//Pedir un numero hexadecimal al usuario

System.out.println("Favor de dar un numero hexadecimal");
	String hex = num.nextLine(); //Metodo nextLine sirve para recibir en una cadena lo que ingrese el usuario, es este caso se recibirá el numero hexadecimal

// El metodo Integer.parseInt analiza la cadena dada en el primer parametro y junto con la base dada en el segundo parametro, y devueleve un valor entero decimal
// En este caso convertira una cadena Hexadecimal (base 16) en un entero decimal	
	System.out.println("Su numero en decimal es: "+(Integer.parseInt(hex,16)));

	
}
}