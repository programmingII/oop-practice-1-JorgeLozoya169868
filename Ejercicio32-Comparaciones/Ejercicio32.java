/*
* Nombre: Jorge Lozoya Acosta
* Dia: 21/02/2019 
* Hora: 12:30 PM
*/
/*
32. Write a Java program to compare two numbers
*/

import java.util.Scanner; //La clase Scanner nos ayudará a recibir datos de entrada
class Ejercicio32{
	public static void main(String[] args){
	Scanner num = new Scanner(System.in); // Se creará un objeto de tipo Scanner que guardará los numeros dados de entrada
	
// Se pedira al usuario dos numeros
// Con el metodo nextInt, se recibira el numero entero ingresado por un
	System.out.println("Favor de dar dos numeros enteros: ");
	int a = num.nextInt();
	int b = num.nextInt();

// Con sentencias if se compararan los numeros y se imprimirán dependiendo de su valor
// En total se deberán de imprimir tres salidas
System.out.println("-----Comparacion de sus numeros-----");

// \t  Insert a tab in the text at this point.
	if(a == b)	
		System.out.println("\t"+a+" = "+b);
	if(a < b)
		System.out.println("\t"+a+" < "+b);
	if(a <= b)
		System.out.println("\t"+a+" <= "+b);
	if(a != b)		
		System.out.println("\t"+a+" != "+b);
	if(a > b)
		System.out.println("\t"+a+" > "+b);
	if(a >= b)
		System.out.println("\t"+a+" >= "+b);
	
	
}
}