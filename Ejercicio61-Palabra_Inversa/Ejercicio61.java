/*
* Nombre: Jorge Lozoya Acosta 169868
* Dia: 26/02/2019
* Hora: 11:47 AM
*/
/*
61.Write a Java program to reverse a word.
*/

import java.util.Scanner; //Clase Scanner con metodos para recibir y guardar datos de entrada
class Ejercicio61{
public static void main(String[] args){
	// Se declararán dos cadenas: una cadena original llamada dracula y la que representa a la invertida llamada alucard igualada a ningun caracter
	String dracula, alucard = "";
	Scanner cadena = new Scanner(System.in); //Se instanciará un objeto de la clase Scanner para recibir datos de entrada

// Se pedirá una cadena al usuario y se almacenara en la variable que representa la cadena original
	System.out.print("Favor de una palabra: ");
	dracula = cadena.nextLine();//el metodo nextLine de la clase Scanner guardará la cadena que sea dada por el usuario

// Medimos el numero de caracteres que tiene la cadena dracula y lo guardamos en una cadena
// Usamos el metodo length() de la clase String ya que devuelve la longitud de una cadena

	int longitud = dracula.length();

// Se creará un ciclo for para almacenar la cadena inversa
// El metodo charAt(int index) Returns the char value at the specified index.

	for(int i = longitud - 1; i >= 0; i--){
	alucard = alucard + dracula.charAt(i); // Aqui concatenamos la cadena inversa más los caracteres de dracula en orden inverso
	}

//Imprimimos la cadena inversa alucard
	System.out.println("La palabra inversa es: "+alucard);
}
}