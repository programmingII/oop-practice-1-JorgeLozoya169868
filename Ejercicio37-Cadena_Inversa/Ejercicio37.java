/*
* Nombre: Jorge Lozoya Acosta
* Dia: 23/02/2019
* Hora: 10:26 PM
*/
/*
37. Write a Java program to reverse a string.
*/
import java.util.Scanner;//Clase para recibir datos de entrada
// Se usara la clase String en donde todas las cadenas son implementadas como instancias de esta clase


class Ejercicio37{
	public static void main(String[] args){
// Se declarar�n dos cadenas: una cadena original llamada dracula y la que representa a la invertida llamada alucard igualada a ningun caracter
	String dracula, alucard = "";
	Scanner cadena = new Scanner(System.in); //Se instanciar� un objeto de la clase Scanner para recibir datos de entrada

// Se pedir� una cadena al usuario y se almacenara en la variable que representa la cadena original
	System.out.print("Favor de dar una cadena de caracteres: ");
	dracula = cadena.nextLine();//el metodo nextLine de la clase Scanner guardar� la cadena que sea dada por el usuario

// Medimos el numero de caracteres que tiene la cadena dracula y lo guardamos en una cadena
// Usamos el metodo length() de la clase String ya que devuelve la longitud de una cadena

	int longitud = dracula.length();

// Se crear� un ciclo for para almacenar la cadena inversa
// El metodo charAt(int index) Returns the char value at the specified index.

	for(int i = longitud - 1; i >= 0; i--){
	alucard = alucard + dracula.charAt(i); // Aqui concatenamos la cadena inversa m�s los caracteres de dracula en orden inverso
	}

//Imprimimos la cadena inversa alucard
	System.out.println("La cadena inversa es: "+alucard);

}
}