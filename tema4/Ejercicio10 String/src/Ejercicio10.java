import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		String frase;
		final int max_length=60;
		int v [] = new int [26];
		int k;
		
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("La frase debe tener como maximo " + max_length + " caracteres");
			frase=teclado.nextLine();
		}while (frase.length()>max_length);
		
		frase = frase.toUpperCase();
		
		for(k = 0;k<=frase.length(); k++){
			if(frase.charAt(k) < v [26]){
				
			}
		}
	}

}
