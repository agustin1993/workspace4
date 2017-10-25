import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		String frase;
		int opcion;
		final int MAX_LONGITUD = 80;
		
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("Frase de hasta "+ MAX_LONGITUD +" caracteres: ");
			frase = teclado.nextLine();
		}while(frase.length() > MAX_LONGITUD);
		
		System.out.println("Elija una opcion para el texto:");
		System.out.println("1. Mayusculas");
		System.out.println("2. Minusculas");
		opcion = teclado.nextInt();
		while (opcion < 1  ||  opcion > 2){
			System.out.println("Elija una opcion para el texto:");
			System.out.println("1. Mayusculas");
			System.out.println("2. Minusculas");
			opcion = teclado.nextInt();
		}
		if(opcion == 1){
			System.out.println(frase.toUpperCase());
		}else{
			System.out.println(frase.toLowerCase());
		}
		
	}

}
