/*
* Nombre Jorge Lozoya Acosta 169868	
* Dia Feb/07/2019
* Hora 12:18AM
*/
/*
* 11. Write a Java program to print the area and perimeter of a circle. PI=3.1415
* Perimetro = 2*PI*Radio
* Area = PI*Radio^2
*/
import java.util.Scanner; //forma de importar el paquete util y la clase Scanner

public class Ejercicio11{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in); //Se declara un objeto in en la clase Scanner, para que permita leer un numero desde el System
				
		System.out.println("Favor de dar el radio del circulo, favor de usar , en vez de ."); // pedimos al usuario un numero
			float rad = in.nextFloat(); // Atrapa el radio
		System.out.println("El perimetro es: "+(2*3.1415*rad)+"\n Y el area es: "+(3.1415*rad*rad)); // Imprimimos los resultados, teniendo como base PI=3.1415
	}
}
