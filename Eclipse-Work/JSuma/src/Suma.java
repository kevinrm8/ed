import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = 1;
		
		while (numero <= 5) {
			System.out.println("numero = "+numero);
			numero = numero +1;
			}
		System.out.println("Fin del programa");
		
//	El programa de arriba es equivalente al de abajo. 
		
			for ( int contador=1; contador<=5;contador++)
		System.out.println("contador = "+contador);
		System.out.println("Fin del programa");
	}
}
