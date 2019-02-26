/*
* Nombre: Jorge Lozoya Acosta 169868
* Dia: 26/02/2019
* Hora: 11:54 AM
*/
/*
62. Write a Java program that accepts three integer values and return true 
if one of them is 20 or more and less than the substractions of others.
*/

import java.util.Scanner; //Clase Scanner con metodos para recibir y guardar datos de entrada
class Ejercicio62{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

//Pedir tres numeros al usuario y guardarlos en distintas variables
        System.out.print("Primer numero: ");
        	int a = in.nextInt();  
	System.out.print("Segundo numero: ");
		int b = in.nextInt(); 
	System.out.print("Tercer numero : ");
	        int c = in.nextInt(); 
//Math.abs saca el valor absoluto, se sacará el valor absoluto de una resta y se comparará con 20
	if((Math.abs(a - b) >= 20 || Math.abs(b - c) >= 20 || Math.abs(c - a) >= 20))
        	System.out.println("Verdadero");
	else
		System.out.println("Falso");

	
}
}