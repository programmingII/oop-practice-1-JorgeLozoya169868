/*
* Nombre: Jorge Lozoya Acosta
* Dia: 25/02/2019
* Hora: 5:48 AM
*/
/*
46. Write a Java program to display the system time.
*/
import java.util.Calendar; //https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html
// provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR

class Ejercicio46{

	public static void main(String[] args){
/* Calendar provides a class method, getInstance, for getting a generally useful object of this type. 
Calendar's getInstance method returns a Calendar object whose calendar fields have been initialized with the current date and time*/

		Calendar now = Calendar.getInstance(); 
//Returns a Date object representing this Calendar's time value 

		System.out.println("La hora acutal: "+ now.getTime());
}
}
