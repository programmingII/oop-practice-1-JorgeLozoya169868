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

	Scanner num = new Scanner(System.in);  //Se crear� un objeto tipo Scanner que guardar� lo ingresado por el usuario
/*
%param n numero del usuario
%param sum Acumulador que ir� sumando los residuos de cada divisi�n, ser� inicializada en 0
*/
// Se pedira un numero al usuario y se guardar� en la variable n

	System.out.println("Favor de dar un numero para sumar sus digitos: ");
		int n = num.nextInt();	

	int sum = 0;
        while (n != 0) {
            sum += n % 10; // Aqui se iran sumando los residuos de cada divisi�n
            n /= 10;	// despu�s se efectua la divisi�n
	// Se reincia el ciclo el resultado de la divisi�n de n sea menor a 0, es decir, que ya se haya tomado el ultimo residuo
        }
	System.out.println("La suma es: "+sum);
	
	
}
}
