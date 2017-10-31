import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		String frase;
		int cont = 0;
		int cont1 = 0;
		final int MAX_LONGITUD = 80;
		int pos=0;
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("Frase de hasta "+ MAX_LONGITUD +" caracteres: ");
			frase = teclado.nextLine();
		}while(frase.length() > MAX_LONGITUD);
		for(int contador=0; contador< frase.length(); contador++){
			char caracter = frase.charAt(pos);
			if(caracter>=65 && caracter<=90){
				cont = cont + 1;
			}
			if(caracter>=97 && caracter<=122){
				cont1 = cont1 + 1;
			}
			pos++;
		}
		System.out.println("En la frase hay " +cont+ " mayusculas.");
		System.out.println("En la frase hay " +cont1+ " minusculas.");


		
	}
}