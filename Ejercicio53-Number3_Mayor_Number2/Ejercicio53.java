/*
* Nombre: Jorge Lozoya Acosta 169868
* Dia: 26/02/2019
* Hora: 08:18 AM
*/
/*
53. Write a Java program that accepts three integers from the user and return true
if the second number is greater than first number and third 
number is greater than second number.
If "abc" is true second number does not need to be greater than first number.
*/

import java.util.Scanner; //Clase Scanner con metodos para recibir y guardar datos de entrada
public class Ejercicio53{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
// Capturar los tres numeros dados por el usuario
	System.out.print("Ingresa el primer numero: ");
	int a = in.nextInt();
	System.out.print("Ingresa el segundo numero: ");
	int b = in.nextInt();
	System.out.print("Ingresa el tercer numero: ");
	int c = in.nextInt();
// Condiciones pedidas por el programa
// El tercer numero mayor al segundo
if(c>b)
	System.out.println("El resultado es: Verdadero");
else if(c>b && b>a)
	System.out.println("El resultado es: Verdadero");
else
	System.out.println("El resultado es: Falso");
}
}