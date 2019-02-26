/*
* Nombre: Jorge Lozoya Acosta
* Dia: 25/02/2019
* Hora: 6:59 AM
*/
/*
50. Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
 */
class Ejercicio50{
	public static void main(String[] args){
// Se creará un ciclo for para cada caso
System.out.println("\n\t Divisibles entre 3: ");
	for(int i = 1; i<=100; i++)
		if(i%3 == 0)
			System.out.print(" "+i);

System.out.println("\n\n\t Divisibles entre 5:");
	for(int i = 1; i<=100; i++)
		if(i%5 == 0) //Si el numero es divisible entre 5 arrojara un residuo de 0, entonces se podra imprimir
			System.out.print(" "+i);

System.out.println("\n\n\t Divisibles entre 3 y 5: ");
	for(int i = 1; i<=100; i++)
		if(i%3 == 0 && i%5 == 0)
			System.out.print(" "+i);
}
}