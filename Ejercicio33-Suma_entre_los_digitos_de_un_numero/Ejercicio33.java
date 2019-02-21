/*
* Nombre: Jorge Lozoya Acosta
* Dia: 21/02/2019
* Hora: 12:53 PM
*/
/*
33. Write a Java program and compute the sum of the digits of an integer
*/
import java.util.Scanner; // La classe Scanner permite recibir numeros y cadenas de entrada

class Ejercicio33{
	public static void main(String[] args){

	Scanner num = new Scanner(System.in);  //Se creará un objeto tipo Scanner que guardará lo ingresado por el usuario
/*
%param n numero del usuario
%param sum Acumulador que irá sumando los residuos de cada división, será inicializada en 0
*/
// Se pedira un numero al usuario y se guardará en la variable n

	System.out.println("Favor de dar un numero para sumar sus digitos: ");
		int n = num.nextInt();	

	int sum = 0;
        while (n != 0) {
            sum += n % 10; // Aqui se iran sumando los residuos de cada división
            n /= 10;	// después se efectua la división
	// Se reincia el ciclo el resultado de la división de n sea menor a 0, es decir, que ya se haya tomado el ultimo residuo
        }
	System.out.println("La suma es: "+sum);
	
	
}
}
