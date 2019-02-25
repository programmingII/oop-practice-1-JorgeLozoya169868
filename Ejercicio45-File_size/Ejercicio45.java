/*
* Nombre: Jorge Lozoya Acosta
* Dia: 25/02/2019
* Hora: 11:48 AM
*/
/*
45. Write a Java program to find the size of a specified file.
*/
import java.io.File;
public class Ejercicio45 {

 public static void main(String[] args) {
  System.out.println("/Ejercicio45-File_Size/pruebaabc.txt  : " + new File("pruebaabc.txt").length() + " bytes");
  System.out.println("/Ejercicio45-File_Size/prueba123.txt : " + new File("prueba123.txt").length() + " bytes");
 }
}