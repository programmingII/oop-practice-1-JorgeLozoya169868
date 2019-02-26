/*
* Nombre: Jorge Lozoya Acosta
* Dia: 25/02/2019
* Hora: 6:46 AM
*/
/*
49. Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd. 
 */
import java.util.Scanner; //Clase con metodos para recibir entradas
class Ejercicio49{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);

	//Pedir al usuario un numero
System.out.print("Dar un numero entero: ");
	int num = in.nextInt(); //Metodo para recibir entradas de tipo Int
if(num%2 == 0)
	System.out.println("1");
else
	System.out.println("0");
		
}
}