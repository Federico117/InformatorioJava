package level01;
import java.util.Scanner;


public class Ejercicio03 {

	public static void main(String[] args) {
		int numero;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese algun numero");
		numero = scan.nextInt();
		scan.close();
		for(int i = 1; i <= numero; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j);
			}
			System.out.println("");
		}
	}

}
