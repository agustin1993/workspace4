import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		String codigo;
		final int max_length=8;
		boolean bano, bsexo, bcurso;
		int cont1h= 0;
		int cont1m= 0;
		int cont2h= 0;
		int cont2m= 0;
		int cont= 0;
		int conte= 0;
		
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("Introduce el codigo con maximo " + max_length + " digitos");
			codigo = teclado.nextLine();
		}while (codigo.length()>max_length);
		
		while(!codigo.equals("00000000")){
			bano=bsexo=bcurso=false;
			if(codigo.substring(0, 4).compareTo("1990")>=0 && codigo.substring(0, 4).compareTo("1995")<=0){
				bano=true;
			}
			if(codigo.charAt(4)=='H' || codigo.charAt(4)=='M'){
				bsexo=true;
			}
			if(codigo.charAt(5)=='1' || codigo.charAt(5)=='2'){
				bcurso=true;
			}
			if(bano=bsexo=bcurso==true){
				cont = cont +1;
				if(codigo.charAt(4)=='H' && codigo.charAt(5)=='1'){
					cont1h = cont1h +1;
				}else if(codigo.charAt(4)=='M' && codigo.charAt(5)=='1'){
					cont1m = cont1m +1;
				}
				if(codigo.charAt(4)=='H' && codigo.charAt(5)=='2'){
					cont2h = cont2h +1;
				}else if(codigo.charAt(4)=='M' && codigo.charAt(5)=='2'){
					cont2m = cont2m +1;
				}
			}else{
				conte = conte +1;
			}
			System.out.println("Introduce el codigo con maximo " + max_length + " digitos");
			codigo = teclado.nextLine();
		}
		System.out.println("Primer curso");
		System.out.println("Hombres: " +cont1h);
		System.out.println("Mujeres: " +cont1m);
		System.out.println("Segundo curso");
		System.out.println("Hombres: " +cont2h);
		System.out.println("Mujeres: " +cont2m);
		
		System.out.println("Codigos");
		System.out.println("Codigos correctos: " +cont);
		System.out.println("Codigos erroneos: " +conte);

	}

}
