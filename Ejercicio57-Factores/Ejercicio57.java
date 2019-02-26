/*
* Nombre: Jorge Lozoya Acosta 169868
* Dia: 26/02/2019
* Hora: 09:04 AM
*/
/*
57. Write a Java program to accepts an integer and count the factors of the number.
*/

import java.util.Scanner; //Clase Scanner con metodos para recibir y guardar datos de entrada
class Ejercicio57{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
// Capturar el numero dado por el usuario
	System.out.print("Ingresa el numero: ");
	int a = in.nextInt();
	
// Condición pedida por el programa
// Buscar si los factores de ese numero, es decir las formas de llegar multiplicando
int cont = 0; //contador de factores
	for(int i = 1; i<=a; i++){
		if(a%i == 0)
			cont++;
	}
	System.out.println("\n La cantidad de factores de "+a+" es: "+cont);
}
}