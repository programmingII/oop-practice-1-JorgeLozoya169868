/*
* Nombre: Jorge Lozoya Acosta
* Dia: 14/02/2019
* Hora: 11:10 AM
*/
/*
*17. Write a Java program to add two binary numbers
*/

import java.util.Scanner; //Libreria que se utiliza para recibir las entradas de los usuarios

public class Ejercicio17{
  	
	public static void main(String[] args){
  
  Scanner binarios = new Scanner(System.in); // Se crea un objeto tipo Scanner para recibir las entradas dadas en el sistema para el usuario
  	
//Se le pedira al usuario dos numeros binarios
	System.out.print("Favor de dar un numero binario: "); 
  	String bin1 = binarios.nextLine(); // Se recibira la entrada del usuario en una variable tipo String con el metodo nextLine que nos brinda Scanner
  	System.out.print("Favor de dar otro numero bianrio: "); 
  	String bin2 = binarios.nextLine(); 

//Se imprimira el resultado
System.out.println("  "+bin1); // Imprimimos la cadena del primer numero ingresado
System.out.println("+ "+bin2); // Imprimimos la segunda cadena ingresada
System.out.println("  ________ "); // Imprimimos una linea simulando el resultado de una suma escrita a mano

// Se utilizara el metodo toBinaryString, ya que esta nos devuelve una cadena de un valor entero representado por un valor en binario
// En otras palabras convierte una cadena de un valor Int a una representacion binaria

// Lo que se hara dentro de su parametro es:
// Utilizar el metodo parseInt de la libreria Integrer
// Convertir la cadena que recibimos del usuario a un valor Int en base 2
// En donde le damos una cadena (en este caso el numero que ingreso el usuario) y ponemos la base en la que queremos dicho numero
// De esa forma se sumaran los dos numeros binarios y devolvera una cadena binaria
System.out.println(" "+Integer.toBinaryString((Integer.parseInt(bin1, 2) + (Integer.parseInt(bin2, 2)))));
 
 }
}
