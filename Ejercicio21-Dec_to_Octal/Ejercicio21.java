/*
* Nombre: Jorge Lozoya Acosta
* Dia: 16/02/2019	
* Hora: 1:32 PM
*/
/*
21. Write a Java program to convert a decimal number to octal number
*/
import java.util.Scanner; // Libreria que nos permite recibir datos de entrada

public class Ejercicio21{
	public static void main(String[] args){

		Scanner num = new Scanner(System.in); //La clase scanner nos generara un objeto para las entradas datas desde el sistema
		
	//Pedir al usuario un numero
	System.out.println("Esta aplicacion es para convertir numeros decimales enteros a numeros octales");
	System.out.println("Favor de dar un numero entero");
		String octal = num.nextLine(); //Aqui recibiremos la cadena del numero dada por el usuario gracias al metodo nextLine

	// Dar al usuario el numero que introdujo convertido a hexadecimal
	// toHexString es un metodo de la clase Integer, que nos permite mostrar una cadena en tipo hexadecimal
	//parseInt Nos permite convertir en valores de tipo entero desde una cadena
	System.out.println("Su numero en Octal es :"+(Integer.toOctalString(Integer.parseInt(octal))));	
	
}
}