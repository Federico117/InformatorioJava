package level03;


import java.util.List;


public class Ejericio03 {

	public static void main(String[] args) {
		List<String> palabras = List.of("Batman","Aquaman","Flash","Batgirl","Wonder Woman","brainiac");
		long cant = palabras.stream().filter((x)-> x.toLowerCase().startsWith("B".toLowerCase())).count();
		System.out.println(cant);
	}

}
