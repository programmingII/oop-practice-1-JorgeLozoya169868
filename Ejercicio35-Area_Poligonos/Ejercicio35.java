/*
* Nombre: Jorge Lozoya Acosta
* Dia: 22/02/2019
* Hora: 10:08 PM
*/
/*
35. Write a Java program to compute the area of a polygon
*/
import java.util.Scanner; // Libreria con metodos para recibir entradas
class Ejercicio35{
	public static void main(String[] args){
// El area de un poligono es = (n*s^2)/(4*tan(PI/n))
// donde n es el numero de lados
// donde s es el largo un lado (side)

	Scanner num = new Scanner(System.in); // se guarda un objeto tipo Scanner donde se recibirán las entradas del usuario

// Pedir los lados del hexagono
	
	System.out.println("Favor el numero de lados");
	int n = num.nextInt(); //Se guardara en la variable n (numbers) en tipo enteros

// Pedir el largo de un lado
	
	System.out.println("Favor de dar el largo de un lado");
	double s = num.nextDouble(); //Se guardara en la variable s (side) en tipo double

//En la clase Math de la libreria Lang, en donde se guardan muchos metodos matematicos, en donde utilizaremos el metodo pow y tan, y la constante PI
//Será de tipo double porque el metodo tan() devuelve un valor double, dentro de su parametro se pone el valor que se necesita
//para le metodo pow, en el primer argumento se pone la variable/numero a elevar y en el segundo la potencia deseada a elevar

double area = (((n)*(Math.pow(s,2)))/((4)*(Math.tan(Math.PI/n))));

	System.out.println("El area de su poligono de "+n+" lados es de: "+area);
}
}