/*
* Nombre: Jorge Lozoya Acosta
* Dia: 22/02/2019
* Hora: 10:20 PM
*/
/*
36. Write a Java program to compute the distance between two points on the surface of earth.
*/
import java.util.Scanner; // Libreria con metodos para recibir entradas

class Ejercicio36{
	public static void main(String[] args){

// Distance between the two points [ (x1,y1) & (x2,y2)]
// d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
// Radius of the earth r = 6371.01 Kilometers

	Scanner num = new Scanner(System.in); // se guarda un objeto tipo Scanner donde se recibirán las entradas del usuario

// Pedir las primeras coordenadas, x1,y1
	
	System.out.print("Favor de dar la coordenada x1: ");
	double x1 = num.nextDouble(); //Se guardara en la variable x1 en tipo double

	System.out.print("Favor de dar la coordenada y1: ");
	double y1 = num.nextDouble(); //Se guardara en la variable y1 en tipo double

// Pedir las segundas coordenadas, x2,y2
	
	System.out.print("Favor de dar la coordenada x2: ");
	double x2 = num.nextDouble(); //Se guardara en la variable x2 en tipo double

	System.out.print("Favor de dar la coordenada y2: ");
	double y2 = num.nextDouble(); //Se guardara en la variable y2 en tipo double

//Libreria con diversas metodos de funciones matematicas
// Desde Math utilizaremos el metodo acos (arc coseno), sin (seno) y cos (coseno)
// Primero convertiremos cada valor en radianes con toRadians
x1 = Math.toRadians(x1);y1 = Math.toRadians(y1);
x2 = Math.toRadians(x2);y2 = Math.toRadians(y2);


double dis = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1-y2));

	System.out.println("La distancia entre los dos puntos es de: " + dis + " km");
}
}