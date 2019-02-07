/*
*@author JorgeLozoyaAcosta 169868
*@date feb/07/2019
*@start 9:11
*/
/*
* 7. Write a Java program that takes a number as 
* input and prints its multiplication table upto 10.
*/
/*
*@param num sera el valor dado por el usuario
*
*/
import java.util.Scanner;
public class Ejercicio7{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);

	System.out.println("Favor de dar la tabla de multiplicar que desea");
		int num = in.nextInt();System.out.println("\n");

	for(int i=0;i<=10;i++)
	{
	System.out.println(num+" * "+i+" = "+(num*i));
	}
	
	}
}
