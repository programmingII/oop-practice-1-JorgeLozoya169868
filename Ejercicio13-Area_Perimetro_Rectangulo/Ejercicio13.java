/*
* Nombre: Jorge Lozoya Acosta 169868	
* Dia: Feb/08/2019
* Hora 12:55PM
*/
/*
13. Write a Java program to print the area and perimeter of a rectangle.
*/
import java.util.Scanner; //Libreria que nos ayuda a capturar datos de entrada

public class Ejercicio13{
	public static void main(String[] args)
	{
	Scanner rectangulo = new Scanner(System.in); // Todo las entradas por parte de System.in están en el objeto rectangulo
	System.out.println("Favor de dar la altura del rectangulo");
		float height = rectangulo.nextFloat();
	System.out.println("Favor de dar el ancho del rectangulo");
		
float width = rectangulo.nextFloat();
	System.out.println("Area: " +height+ " * " +width+ " = "+ (height*width));	
	System.out.println("Perimetro: 2 * (" +height+ " + " +width+ ") = "+ 2*(height+width));
	}
	
}