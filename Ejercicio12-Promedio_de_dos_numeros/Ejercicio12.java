/*
* Nombre: Jorge Lozoya Acosta 169868
* Dia: Feb/07/2019
* Hora: 13:14
*/
/*
12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
*/
import java.util.Scanner; //Libreria para escanear imputs,Convierte lo que el usuario escriba en valores

public class Ejercicio12
{
	public static void main(String[] args)
	{
		Scanner nums = new Scanner(System.in); //Se crea un objeto nums para usar el metodo nextInt despues

		System.out.println("Favor de dar tres numeros"); //pedir al usuario que se prepare para dar tres numeros

		System.out.println("El primer numero: "); //Imprimir la indicacion al usuario
			int num1 = nums.nextInt();	//atrapar el valor dado por el usuario
		System.out.println("El segundo numero: "); // Se hace el mismo proceso para los tres numeros
			int num2 = nums.nextInt(); //Agregar el objeto creado anteriormente en Scanner nums
		System.out.println("El tercero numero: ");
			int num3 = nums.nextInt();
		float result = (float)(num1+num2+num3)/3; //Operacion del promedio, el float entre parentesis es para poder dividir los int sin error
		System.out.println("El promedio de los tres numeros es: "+result); //Imprimir el promedio
	}
}