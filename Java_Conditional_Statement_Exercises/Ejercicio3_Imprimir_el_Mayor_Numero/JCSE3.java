/*
* Nombre: Jorge Lozoya Acosta
* Dia: 14/02/2019
* Hora: 9:15AM
 JCSE3 Java Conditional Statement Exercises 3
*/
/*
3. Take three numbers from the user and print the greatest number
*/
import java.util.Scanner;

public class JCSE3{

	public static void main(String[] args){
	Scanner nums = new Scanner(System.in);
	
//Pedir al usuario tres numeros diferentes de tipo entero

	System.out.println("Favor de ingresar el primer numero");
		int num1 = nums.nextInt();	
	System.out.println("Favor de ingresar el segundo numero");
		int num2 = nums.nextInt();
	System.out.println("Favor de ingresar el tercer numero");	
		int num3 = nums.nextInt();

	if((num1 > num2)&&(num2 > num3)){
	System.out.println("\n Numero mayor: "+num1);
	}
	else if ((num2 > num3)){
	System.out.println("\n Numero mayor: "+num2);
	}
	else{
	System.out.println("\n Numero mayor: "+num3);
	}
	
}
}