/*
* Nombre: Jorge Lozoya Acosta
* Dia: 17/02/2019
* Hora: 12:02 PM
*/
/*
27. Write a Java program to convert a octal number to a hexadecimal number.
*/
import java.util.Scanner; // Libreria para recibir entradas desde el sistema
public class Ejercicio27{
	public static void main(String[] args){
	Scanner num = new Scanner(System.in);
//Pedir un numero octal al usuario
System.out.println("Favor de dar un numero octal");
	String octal = num.nextLine(); //Metodo nextLine sirve para recibir en una cadena lo que ingrese el usuario

// El metodo Integer.toHexString convierte un valor entero decimal en una cadena en base 16
// El metodo Integer.parseInt analiza la cadena dada en el primer parametro y junto con la base dada en el segundo parametro, y devueleve un valor entero decimal
	System.out.println("Su numero octal en hexadecimal es: "+Integer.toHexString((Integer.parseInt(octal,8))));

	
}
}