package level01;
import java.util.Scanner;


public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		print("ingrese el primer numero a operar");
		int x = scan.nextInt();
		print("ingrese el segundo numero a operar");
		int y = scan.nextInt();
		scan.close();
		print(x +"+"+ y+"= "+(x+y));
		print(x +"-"+ y+"= "+(x-y));
		print(x +"*"+ y+"= "+(x*y));
		print(x +"/"+ y+"= "+(x/y));
		print(x +"%"+ y+"= "+(x%y));
	}
	public static void print(String cadena){
		System.out.println(cadena);
	}

}
