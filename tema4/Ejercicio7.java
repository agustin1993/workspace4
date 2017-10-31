import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		String frase;
		final int max_length=80;
		String mayus="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String minus="abcdefghijklmnopqrstuvwxyz";
		String nums="0123456789";
		int pos=0;
		int contmayus=0;
		int contminus=0;
		int contnum=0;

		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("La frase debe tener como maximo " + max_length + " caracteres");
			frase=teclado.nextLine();
		}while (frase.length()>max_length);
				
		for (int cont=0; cont<frase.length(); cont++){
			char caracter = frase.charAt(pos);
			if(mayus.indexOf(caracter) != -1){
				contmayus=contmayus+1;
			}else if(minus.indexOf(caracter) != -1){
				contminus=contminus+1;
			}else if(nums.indexOf(caracter) != -1){
				contnum=contnum+1;
			}
			pos++;		
		}
		System.out.println("Tiene " + contnum + " numeros");			
		System.out.println("Tiene " + contmayus + " mayusculas");			
		System.out.println("Tiene " + contminus + " minusculas");
	}

}