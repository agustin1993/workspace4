import java.util.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		String frase;
		final int MAX_LONGITUD = 80;
		String par = "";
		String impar = "";
		
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("Frase de hasta "+ MAX_LONGITUD +" caracteres: ");
			frase = teclado.nextLine();
		}while(frase.length() > MAX_LONGITUD);
		
		for(int cont = 0; cont < frase.length(); cont++){
			if(cont % 2 == 0){
				par = par + frase.substring(cont, cont+1);
			}else{
				impar = impar + frase.substring(cont, cont+1);
			}
			
		}
		System.out.println("letras pares: " +par);;
		System.out.println("letras impares: " +impar);
	}
}

