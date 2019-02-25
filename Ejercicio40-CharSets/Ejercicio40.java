/*
* Nombre: Jorge Lozoya Acosta
* Dia: 25/02/2019
* Hora: 8:07 AM
*/
/*
40. Write a Java program to list 
the available character sets in charset objects
*/
import java.nio.charset.Charset; //This class defines methods for creating decoders and encoders and for retrieving the various names associated with a charset. 
class Ejercicio40{
	public static void main(String[] args){
	System.out.println("Los Charsets disponibles son: ");  
    for (String str : Charset.availableCharsets().keySet()) {
      System.out.println(str);	
	}
}
}