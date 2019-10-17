import java.util.Scanner;

public class Anumero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num,aleatorio,contador=1,i;
		
		aleatorio = (int) (Math.random()*10+1);
		
		do { 
			System.out.println("Adivina el numero entre [1-10]");
			num= scanner.nextInt();
			
				if(num != aleatorio) {
					System.out.println("Has fallado!");
					contador++;}
							
			} while (num != aleatorio);
			System.out.println("Has acertado!Solo te ha costado "+contador+" intentos.");
		
		
		}
	}