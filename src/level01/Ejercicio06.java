package level01;
import java.util.Scanner;


public class Ejercicio06 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese base");
		int base = scan.nextInt();
		System.out.println("Ingrese potencia");
		int expo = scan.nextInt();
		int resultado = potencia(base, expo);
		System.out.println("El resultado es: "+resultado);
	}
	
	public static int potencia(int bas, int expon){
		if(expon == 0){
			return 1;
		}else{
			int resultado = bas;
			for(int i=0;i<expon-1;i++){
				resultado *= bas;
			}
			return resultado;
		}
	}

}
