/*
* Nombre: Jorge Lozoya Acosta
* Dia: 22/02/2019
* Hora: 9:45 PM
*/
/*
34. Write a Java program to compute the area of a hexagon.
*/
import java.util.Scanner; // Libreria con metodos para recibir entradas
class Ejercicio34{
	public static void main(String[] args){
// El area del hexagono es = (6 * s^2)/(4*tan(PI/6))
// donde s es el largo del lado (side)

	Scanner num = new Scanner(System.in);
// Pedir el lado del hexagono
	System.out.println("Favor de dar el largo de un lado");
	double s = num.nextDouble(); //Se guardara en la variable s (side) en tipo double
//En la clase Math de la libreria Lang, en donde se guardan muchos metodos matematicos, en donde utilizaremos el metodo pow y tan, y la constante PI
//Será de tipo double porque el metodo tan() devuelve un valor double, dentro de su parametro se pone el valor que se necesita
//para le metodo pow, en el primer argumento se pone la variable/numero a elevar y en el segundo la potencia deseada a elevar7
double area = (((6)*(Math.pow(s,2)))/((4)*(Math.tan(Math.PI/6))));

	System.out.println("El area del hexagono es: "+area);
}
}