package level01;
import java.util.Scanner;


public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//solicitamos el nombre al usuario
		System.out.println("Ingrese su nombre por favor:");
		String nombre = scan.nextLine();
		//y lo imprimimos con el saludo
		System.out.println("Hola "+ nombre+"!!!");
	}

}
