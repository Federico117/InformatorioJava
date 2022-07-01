package level01;
import java.util.Scanner;


public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdusca los numeros para realizar la multiplicacion");
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();
		System.out.println(producto(x, y));
	}
	
	public static int producto(int x, int y){
		int resultado = 0;
		//sumamos el valor x con el mismo la cantidad de veces que indique "y"
		//creamos nuestra propia funcion de multiplicar sin librerias
		for(int i=1; i<=y; i++){
			resultado += x;
		}
		return resultado;
	}
	
}
