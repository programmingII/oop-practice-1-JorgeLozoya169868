/*
*@author JorgeLozoyaAcosta 169868	
*@Date Feb/5/2019
*@Start 1:10PM
*/
/*
* 5. Write a Java program that takes two numbers as input and display the product of two numbers
*/
import java.util.Scanner;


public class Ejercicio5{

	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("Favor de dar el primer numero ");
		int number1 = in.nextInt();	
	System.out.println("Favor de dar el segundo numero ");	
		int number2 = in.nextInt();

	System.out.println("El resultado de "+number1+" * "+number2+" es "+(number1*number2));	
	}

}