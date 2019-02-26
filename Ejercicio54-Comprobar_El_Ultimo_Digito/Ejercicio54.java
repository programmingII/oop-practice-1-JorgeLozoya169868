/*
* Nombre: Jorge Lozoya Acosta 169868
* Dia: 26/02/2019
* Hora: 08:28 AM
*/
/*
54. Write a Java program that accepts three integers from the user and return true
if two or more of them (integers ) have the same rightmost digit. 
The integers are non-negative.
*/

import java.util.Scanner; //Clase Scanner con metodos para recibir y guardar datos de entrada
public class Ejercicio54{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
//Pedir tres numeros al usuario
	System.out.print("Ingresa el primer numero: ");
	int a = in.nextInt();
	System.out.print("Ingresa el segundo numero: ");
	int b = in.nextInt();
	System.out.print("Ingresa el tercer numero: ");
	int c = in.nextInt();
// Condición pedida por el programa, que el ultimo digito de cada numero sea igual
//https://github.com/programmingII/oop-practice-1-JorgeLozoya169868/wiki/Ejercicio-33-Suma-de-dos-digitos
	if((a%10 == b%10)||(a%10 == c%10)||(b%10 == c%10))
		System.out.println("El resultado es: Verdadero");
	else
		System.out.println("El resultado es: Falso");
}
}