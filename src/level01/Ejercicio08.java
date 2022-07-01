package level01;
import java.util.Scanner;

/*Crear una aplicacion que solicite de entrada los datos
 * de una persona en este orden:
 * Nombre y Apellido
 * Edad
 * Direccion
 * Ciudad
 * y luego imprima el siguiente mensaje:
 * {ciudad}-{direccion}-{edad}-{nombre y apellido}
 */
public class Ejercicio08 {

	public static void main(String[] args) {
		//creamos un Scanner y solicitamos los datos
		Scanner scan = new Scanner(System.in);
		String[] datos = new String[4];
		print("ingrese su nombre y apellido");
		datos[0] = scan.nextLine();
		print("Ingrese su edad");
		datos[1] = scan.nextLine();
		print("Ingrese su direccion");
		datos[2] = scan.nextLine();
		print("Ingrese su Ciudad");
		datos[3] = scan.nextLine();
		for(int i=datos.length-1; i>-1; i--){
			System.out.print("{"+datos[i]+"}-");
		}
	}
	public static void print(Object ob){
		System.out.println(ob);
	}

}
