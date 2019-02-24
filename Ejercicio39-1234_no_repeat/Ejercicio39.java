/*
* Nombre: Jorge Lozoya Acosta
* Dia: 24/02/2019
* Hora: 2:25 AM
*/
/*
39. Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
*/
class Ejercicio39 {
    public static void main(String[] args) {
int cont = 0;
for(int i = 1; i <= 4; i++){ // El primer for genera el primer digito de cada combinacion
	for(int j = 1; j <= 4; j++){ // generará el segundo digito de cada combinación
		for(int k = 1; k <= 4; k++){// generará el ultimo digito de cada combinacion
			if(k != i && k != j && i != j){ // en caso de sean todos diferentes
				cont++; // se sumara uno al contador
				System.out.println(i + "-" + j + "-" + k); // y se imprimiran en pantalla
			}
		}
	}
}
	System.out.println("El total de combinaciones son: " + cont);
}
}