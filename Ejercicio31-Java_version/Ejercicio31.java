/*
* Nombre: Jorge Lozoya Acosta
* Dia: 21/02/2019
* Hora: 12:05 PM
*/
/*
31. Write a Java program to check whether Java is installed on your computer.
https://docs.oracle.com/javase/8/docs/api/java/lang/System.html#getProperties--
*/
class Ejercicio31{
public static void main(String[] args){

// Se usará clase System, la cual contiene varias metodos utiles y class fields
// De sus metodos se empleará getProperty, en donde obtendra una propiedad del sistema indicada por una palabra especifica en String 
	
	System.out.println("Java Version: "+System.getProperty("java.version"));
	System.out.println("Java Runtime version: "+System.getProperty("java.specification.version"));
	System.out.println("Java installation directory: "+System.getProperty("java.home"));
	System.out.println("Java vendor: "+System.getProperty("java.vendor"));
	System.out.println("Java vendor URL: "+System.getProperty("java.vendor.url"));
	System.out.println("java user's name: "+System.getProperty("user.name"));
	System.out.println("Java class version: "+System.getProperty("java.class.version"));
	System.out.println("Java class path: "+System.getProperty("java.class.path"));
}
}