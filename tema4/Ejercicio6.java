import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		String frase;
		final int max_length=80;
		String cons="BCDFGHJKLMNÑPQRSTVWXYZ";
		String voc="AEIOU";
		String nums="0123456789";
		int pos=0;
		int contvoc=0;
		int contcons=0;
		int contnum=0;

		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("La frase debe tener como maximo " + max_length + " caracteres");
			frase=teclado.nextLine();
		}while (frase.length()>max_length);

		String mayusculas = frase.toUpperCase();
		System.out.println(mayusculas);			
		for (int cont=0; cont<mayusculas.length(); cont++){
			char caracter = mayusculas.charAt(pos);
			if(cons.indexOf(caracter) != -1){
				contcons=contcons+1;
			}else if(voc.indexOf(caracter) != -1){
				contvoc=contvoc+1;
			}else if(nums.indexOf(caracter) != -1){
				contnum=contnum+1;
			}
			pos++;		
		}
		System.out.println("Tiene " + contnum + " numeros");			
		System.out.println("Tiene " + contcons + " consonantes");			
		System.out.println("Tiene " + contvoc + " vocales");
	}

}