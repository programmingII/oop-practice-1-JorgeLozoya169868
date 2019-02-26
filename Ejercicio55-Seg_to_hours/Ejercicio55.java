/*
* Nombre: Jorge Lozoya Acosta 169868
* Dia: 26/02/2019
* Hora: 08:28 AM
*/
/*
55. Write a Java program to convert seconds to hour, minute and seconds.
*/

import java.util.Scanner; //Clase Scanner con metodos para recibir y guardar datos de entrada
public class Ejercicio55{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
//Pedir los segundos
	System.out.print("Dar cantidad de segundos: ");
		int seg = in.nextInt();
//Operaciones para segundos,minutos y horas
	int realseg = seg % 60; //Aqui se saco el residuo de todos los segundos
	int minutos = seg/60; // Aqui se convirtio de segundos a minutos
	int realmin = minutos % 60; // Aqui se saco el residuo de los minutos
	int hora = minutos/60; // Aqui se convirtio de minutos a horas

	System.out.print(hora+" : " +realmin+ " : "+realseg);
}
}