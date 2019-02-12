/*
* Nombre: Jorge Lozoya Acosta
* Dia: 12/02/2019
* Hora: 1:02 PM
 JCSE1 Java Conditional Statement Exercises 1
*/
/*
2. Write a Java program to solve quadratic equations (use if, else if and else)
*/
import java.util.Scanner; //Libreria que permite capturar valores de entrada
import java.lang.Math; //Libreria que contiene variedad de funciones matematicas, la necesitaremos para la raiz cuadrada
public class JCSE2{
	public static void main(String[] args){
	Scanner nums = new Scanner(System.in); //Un objeto para tener nuestros enteros ahí gracias a la libreria Scanner

	/*Recordar al usuario como está compuesta una ecuación cuadratica*/
	System.out.println("Favor de poner los valores de acuerdo a la exprecion cuadratica base: Ax² + Bx + C = 0");
 // Pedir al usuario los tres valores necesarios para las Ecuaciones cuadratricas	
 // En cada impresion se recibirá un valor entero que guardaremos gracias a Scanner
	System.out.println("Favor de dar el valor de A: ");
		int numA = nums.nextInt();
	System.out.println("Favor de dar el valor de B: ");
		int numB = nums.nextInt();
	System.out.println("Favor de dar el valor de C: ");
		int numC = nums.nextInt();

// Se hará una operacion previa para comprobar que el valor dentro de la raiz cuadratica no es negativo
	float dentro_raiz = (float) ((Math.pow(numB,2))-(4*numA*numC));
//Forma de probar que la operacion está bien, está comentada ya que es inecesaria para el usuario
	//System.out.println("El valor de la raiz es: "+raiz); //Probar la raiz

	if (dentro_raiz >= 0){
		//Primero resolvemos la raiz, declaramos una variable con el valor de la raiz resuelta
		double raiz = (double) Math.sqrt(dentro_raiz); //usamos el metodo sqrt de la libreria math para resolver la raiz
		//Seguimos con la formula, recordando que se necesita sumar para sacar un resultado y restar para sacar el otro resultado
		double result1 = (-numB + raiz)/(2*numA);
		double result2 = (-numB - raiz)/(2*numA);		

		System.out.println("Las raices de la ecuacion son: ");
		System.out.println("x1 = "+result1);
		System.out.println("x2 = "+result2);
		}
	//Hacerle saber al usuario que los numeros dieron una raiz negativa y no se puede seguir con el proceso
	else {
	System.out.println("La ecuacion no puede ser resuelta con los numeros dados");
	}


}
}