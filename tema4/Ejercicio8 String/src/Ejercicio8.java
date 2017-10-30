import java.util.Scanner;
import java.io.IOException;

public class Ejercicio8 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String frase;
		int codigo=3;
		
		do {
            System.out.print("Introduce un texto: ");
            frase = sc.nextLine();
        } while (frase.isEmpty());

		String mayusculas = frase.toUpperCase();
		
	     StringBuilder cifrado = new StringBuilder();
	     codigo = codigo % 26;
	     for (int i = 0; i < frase.length(); i++) {
	         if (frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z') {
	            if ((frase.charAt(i) + codigo) > 'z') {
	                 cifrado.append((char) (frase.charAt(i) + codigo - 26));
	             } else {
	                 cifrado.append((char) (frase.charAt(i) + codigo));
	              }
	          } else if (frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z') {
	              if ((frase.charAt(i) + codigo) > 'Z') {
	                  cifrado.append((char) (frase.charAt(i) + codigo - 26));
	              } else {
	                  cifrado.append((char) (frase.charAt(i) + codigo));
	              }
	            }
	        }
	      System.out.println(cifrado.toString());
	    }
	}


