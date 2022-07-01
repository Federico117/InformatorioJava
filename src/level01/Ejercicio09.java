package level01;
import java.util.Scanner;


public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese un texto");
		String palabra = scan.nextLine();
		System.out.println("Ingrese el caracter para saber cuantas veces se repite");
		String caracter = scan.nextLine();
		scan.close();
		int contador = 0;
		//use muchas veces for aca podria variar y mejorar con otro metodo como hasnext() o algo asi con string
		for(int i=0; i<palabra.length();i++){
			if(caracter.charAt(0) == palabra.charAt(i)){
				contador++;
			}
		}
		System.out.println("El caracter se repite: "+contador+" veces");
		
	}

}
