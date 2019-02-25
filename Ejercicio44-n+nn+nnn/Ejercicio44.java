/*
* Nombre: Jorge Lozoya Acosta
* Dia: 17/02/2019
* Hora: 11:48 AM
*/
/*
44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
*/
import java.util.Scanner; // Libreria para recibir entradas desde el sistema
public class Ejercicio44{
	public static void main(String[] args){
Scanner in = new Scanner(System.in);
	System.out.println("Favor de dar un entero");
		int x = in.nextInt();
//printf: A convenience method to write a formatted string to this console's output stream using the specified format string and arguments.
	System.out.printf("%d + %d%d + %d%d%d",x,x,x,x,x,x);
}
}