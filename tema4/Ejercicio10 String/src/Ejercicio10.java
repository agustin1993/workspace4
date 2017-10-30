import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		String frase;
		final int max_length=60;
		int letras = 0;
		int frecuencia=0;
		
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("La frase debe tener como maximo " + max_length + " caracteres");
			frase=teclado.nextLine();
		}while (frase.length()>max_length);
		
		String mayusculas = frase.toUpperCase();
		
		
	}

}
