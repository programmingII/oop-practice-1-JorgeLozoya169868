/*
* Nombre: Jorge Lozoya Acosta
* Dia: 24/02/2019
* Hora: 2:25 AM
*/
/*
42. Write a Java program to input and display your password.
*/
import java.io.Console; //Methods to access the character-based console device
class Ejercicio42 {
    public static void main(String[] args) {
Console con;
/*If this virtual machine has a console then it is represented by a unique instance of this class which can be obtained 
by invoking the System.console() method. If no console device is available then an invocation of that method will return null.*/
con = System.console();


         // Si la consola no es nula
         if (con != null) {          
                      
            // Leer contraseña y que devuela un arreglo char
           char[] pass = con.readPassword("Password: "); //Provides a formatted prompt, then reads a password or passphrase from the console with echoing disabled.
							//Returns: A character array containing the password or passphrase read from the console
            
            // Imprimir contraseña
            System.out.println("Password is: "+ new String (pass));
         }
}
}