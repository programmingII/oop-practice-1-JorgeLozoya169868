/*
* Nombre: Jorge Lozoya Acosta 169868
* Dia: 26/02/2019
* Hora: 12:21 AM
*/
/*
63. Write a Java program that accepts two integer values from the user and return the larger values. However if the two values are the same,
 return 0 and return the smaller value if the two values have the same remainder when divided by 6. 
*/

import java.util.Scanner; //Clase Scanner con metodos para recibir y guardar datos de entrada

class Ejercicio63{
public static void main(String[] args){
	
	Scanner in = new Scanner(System.in); //Se instanciará un objeto de la clase Scanner para recibir datos de entrada
//Pedir dos valores enteros

	System.out.println(" Favor de dar dos numeros enteros: ");
		int a = in.nextInt();
		int b = in.nextInt();
	
	if(a%6 == b%6 && a != b) // Servira para el caso de devolver el menor valor si los dos numeros tienen el mismo residuo entre 6
{
			if(a>b) //Imprimir el valor más pequeño
				System.out.println("Resultado: "+b);
			else
				System.out.println("Resultado: "+a);

}
		else //Para el resto de situaciones, mayor o menor e igual
{
			if(a == b) //En caso de que sean numeros iguales se imprimirá 0
				System.out.println("Resultado: 0");
			else if(a>b) //Para cuando no tienen el mismo residuo, entonces imprimir el mayor valor
				System.out.println("Resultado: "+a);
			else if(a<b) //imprimir el mayor valor
				System.out.println("Resultado: "+b);
}
		
	
}
}
