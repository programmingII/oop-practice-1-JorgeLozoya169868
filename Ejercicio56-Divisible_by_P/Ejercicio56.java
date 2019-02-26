/*
* Nombre: Jorge Lozoya Acosta 169868
* Dia: 26/02/2019
* Hora: 08:48 AM
*/
/*
56. Write a Java program to find the number of integers within the range of two
 specified numbers and that are divisible by another number.
*/

import java.util.Scanner; //Clase Scanner con metodos para recibir y guardar datos de entrada
public class Ejercicio56{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
// Capturar el rango dado por el usuario
	System.out.print("Ingresa el primer rango: ");
	int a = in.nextInt();
	System.out.print("Ingresa el segundo rango: ");
	int b = in.nextInt();
	System.out.print("Entre que numero busca?: ");
	int c = in.nextInt();
// Condición pedida por el programa
// Buscar todos los numeros que son divisibles entre el 'c' dentro del rango dado
int cont = 0; //contador de numeros divisibles
	for(int i = a; i<=b; i++){
		if(i%c == 0)
			cont++;
	}
	System.out.println("\n La cantidad de numeros divisibles fueron: "+cont);
}
}