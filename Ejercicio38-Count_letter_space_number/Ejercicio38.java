/*
* Nombre: Jorge Lozoya Acosta 169868
* Dia: 24/02/2019
* Hora 02:02 AM
*/
/*
38. Write a Java program to count the letters, spaces, numbers and other characters of an input string.
*/

import java.util.Scanner; //Importar la clase Scanner para recibir imputs
// también se usara la clase Character para utulizar los metodos para leer letras y numeros desde variables char
class Ejercicio38{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in); //Se instanciara in en la clase Scanner
// Pedir al usuario una cadena
	System.out.print("Ingrese una cadena: ");
		String cadena = in.nextLine(); //Se guardará la cadena completa en la variable cadena
// Se declararan todos los contadores
int letter = 0, space = 0, number = 0, other = 0;
//Se crea un arreglo tipo char almacenando cada caracter de la cadena gracias al metodo toCharArray()
char[] ch = cadena.toCharArray();
for(int i = 0; i < cadena.length(); i++){
		if(Character.isLetter(ch[i])){  //isLetter(char ch) determina si un caracter es una letra
			letter ++ ;
			}
		else if(Character.isDigit(ch[i])){ //isDigit(char ch) determina si un caracter es un numero
			number ++ ;
			}
		else if(Character.isSpaceChar(ch[i])){ //isSpaceChar(char ch) determina si un caracter es un espacio
			space ++ ;
			}
		else{
			other ++;
			}
		}
// Imprimir los acumuladores
	System.out.println("Tu cadena es: "+cadena);
	System.out.println("Letras: "+letter);
	System.out.println("Numeros: "+number);
	System.out.println("Espacios: "+space);
	System.out.println("Otros: "+other);
}
}