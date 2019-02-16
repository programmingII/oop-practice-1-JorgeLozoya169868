/*
* Nombre: Jorge Lozoya Acosta
* Dia: 16/02/2019	
* Hora: 1:18 PM
*/
/*
20. Write a Java program to convert a decimal number to hexadecimal number.
*/
import java.util.Scanner; // Libreria que nos permite recibir datos de entrada

public class Ejercicio20{
	public static void main(String[] args){

		Scanner num = new Scanner(System.in); //La clase scanner nos generara un objeto para las entradas datas desde el sistema
		
	//Pedir al usuario un numero
	System.out.println("Esta aplicacion es para convertir numeros decimales enteros a numeros hexadecimales");
	System.out.println("Favor de dar un numero entero");
		String hex = num.nextLine(); //Aqui recibiremos la cadena del numero dada por el usuario gracias al metodo nextLine
	// Dar al usuario el numero que introdujo convertido a hexadecimal
	// toHexString es un metodo de la clase Integer, que nos permite mostrar una cadena en tipo hexadecimal
	//parseInt Nos permite convertir una cadena con valores de tipo entero y convertila en la base que queramos
	System.out.println("Su numero en hexadecimal es :"+(Integer.toHexString(Integer.parseInt(hex,10))));	
	
}
}