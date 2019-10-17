import java.util.Scanner;

public class Anumero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int num,aleatorio,contador=1,i,intentos=3;
		
		aleatorio = (int) (Math.random()*10+1);
		
		
		
		do { 
			System.out.println("Adivina el numero entre [1-10]");
			num= scanner.nextInt();
			
				if(num != aleatorio) {
					System.out.println("Has fallado!");
						if(num>aleatorio){
						System.out.println("Te has pasado! El numero que buscas es menor que "+num);
						}
						else System.out.println("Te has quedado corto! El numero que buscas es mayor que "+num);
					contador++;
									}
							
			} while (num != aleatorio);
				if ( num == aleatorio);
				System.out.println("Has acertado!Solo te ha costado "+contador+" intentos.");

				}
}
	





// COPIA DE CODIGO DE SEGURIDAD

//int num,aleatorio,contador=1,i,intentos=3;
//
//aleatorio = (int) (Math.random()*10+1);
//
//do { 
//	System.out.println("Adivina el numero entre [1-10]");
//	num= scanner.nextInt();
//	
//		if(num != aleatorio) {
//			System.out.println("Has fallado!");
//				if(num>aleatorio){
//				System.out.println("Te has pasado! El numero que buscas es menor que "+num);
//				}
//				else System.out.println("Te has quedado corto! El numero que buscas es mayor que "+num);
//			contador++;
//							}
//					
//	} while (num != aleatorio);
//		if ( num == aleatorio);
//		System.out.println("Has acertado!Solo te ha costado "+contador+" intentos.");
//
//		}
//}
