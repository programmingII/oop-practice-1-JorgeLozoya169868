/*
* Nombre: Jorge Lozoya Acosta
* Dia: 25/02/2019
* Hora: 6:22 AM
*/
/*
47. Write a Java program to display the current date time in specific format.
	Now: 2017/06/16 08:52:03.066
*/
import java.text.SimpleDateFormat; //https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html#year
//  allows you to start by choosing any user-defined patterns for date-time formatting

class Ejercicio47{

	public static void main(String[] args){
/* Calendar provides a class method, getInstance, for getting a generally useful object of this type. 
Calendar's getInstance method returns a Calendar object whose calendar fields have been initialized with the current date and time*/

		SimpleDateFormat now = new SimpleDateFormat("yyyy/MM/dd kk:mm:ss.SSS"); 
//yyyy Year
//MM Month in year 
//dd Day in month 
//kk Hour in day (1-24) 
//mm Minute in hour
//ss Second in minute
//SSS Milisecond

		System.out.println("La hora acutal: "+now.format(System.currentTimeMillis()));

/*Returns the current time in milliseconds. Note that while the unit of time of the return value is a millisecond, the granularity of the value depends on the underlying operating system and may be large*/

}
}
