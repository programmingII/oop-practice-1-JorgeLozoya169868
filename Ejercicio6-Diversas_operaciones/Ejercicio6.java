/*
*@author JorgeLozoyaAcosta 169868	
*@Date Feb/5/2019
*@Start 1:37PM
*/
/*
* 6. Write a Java program to print the sum (addition), 
* multiply, subtract, divide and remainder of two numbers
*/
import java.util.Scanner;


public class Ejercicio6{

	public static void main(String[] args){

	Scanner in = new Scanner(System.in);
	
	System.out.println("Favor de dar el primer numero ");
		int num1 = in.nextInt();	
	System.out.println("Favor de dar el segundo numero ");	
		int num2 = in.nextInt();

	System.out.println("Suma: "+num1+" + "+num2+" = "+(num1+num2));	
	System.out.println("Resta: "+num1+" - "+num2+" = "+(num1-num2));
	System.out.println("Multiplicacion: "+num1+" * "+num2+" = "+(num1*num2));
	System.out.println("Division: "+num1+" / "+num2+" = "+(num1/num2));
	System.out.println("Mod: "+num1+" % "+num2+" = "+(num1%num2));
	}

}