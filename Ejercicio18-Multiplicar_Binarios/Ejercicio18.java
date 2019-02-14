/*
* Nombre: Jorge Lozoya Acosta
* Dia: 14/02/2019
* Hora: 12:35 PM
*/
/*
*18. Write a Java program to add two binary numbers
@param bin1 Representara al primero numero binario dado por el usuario
*/

import java.util.Scanner; // Libreria que se utiliza para recibir datos de entrada

public class Ejercicio18{

	public static void main(String[] args){

// Se crea un objeto tipo Scanner donde tendremos las entradas dadas por el usuario
 	Scanner binario = new Scanner(System.in); 

//Se le pedira dos numeros al usuario que desee multiplicar
	System.out.println("Favor de dar dos numeros binarios para multiplicar");
	System.out.print("El primer numero: ");
// La variable bin1 se guardara en cadena para un manejo mas facil de los metodos
// Se usa el metodo nextLine de la clase Scanner
	String bin1 = binario.nextLine(); 
// Se utiliza el mismo procedimiento para 	
	System.out.print("El segundo numero: "); 
  	String bin2 = binario.nextLine(); 

// Imprimimos de manera elegante la multiplicacion
System.out.println("  "+bin1); // Imprimimos la cadena del primer numero ingresado
System.out.println("x "+bin2); // Imprimimos la segunda cadena ingresada
System.out.println("  ________ "); // Imprimimos una linea simulando el resultado de una suma escrita a mano

// Se utilizara el metodo toBinaryString, ya que esta nos devuelve una cadena de un valor entero representado por un valor en binario
// En otras palabras convierte una cadena de un valor Int a una representacion binaria

/* Lo que se hara dentro de su parametro es:
* Utilizar el metodo parseInt de la libreria Integrer
* Convertir la cadena que recibimos del usuario a un valor Int en base 2
* En donde le damos una cadena (en este caso el numero que ingreso el usuario) y ponemos la base en la que queremos  dicho numero
* De esa forma se sumaran los dos numeros binarios y devolvera una cadena binaria */

System.out.println(" "+Integer.toBinaryString((Integer.parseInt(bin1, 2) * (Integer.parseInt(bin2, 2)))));
	
}
}