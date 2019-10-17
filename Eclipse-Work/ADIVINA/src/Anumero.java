import java.util.Scanner;

public class Anumero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int num,aleatorio,contador,i,j,intentos=3,n=1,partida=1;
		int[] cad=new int[10]; // Creo cadena de tamaño 10
		
		for(i=0;i<10;i++) {
		cad[i]=i;
		System.out.print("["+cad[i]+"]");
							}
		System.out.println("");
		while (n != 0){
			for(i=0;i<10;i++) {
				cad[i]=i;
			aleatorio = (int) (Math.random()*10+1);
			contador=1;
			do { 
				System.out.println("Adivina el numero entre [1-10]");
				num= scanner.nextInt();
				
					if(num != aleatorio) {
						System.out.println("Has fallado!");
							if(num>aleatorio){
							System.out.println("Te has pasado! El numero que buscas es menor que "+num);
							for(j=num;j<10;j++)
									cad[j]= 0;
											}
							}
							else System.out.println("Te has quedado corto! El numero que buscas es mayor que "+num);
								for(j=num;j>0;j--)
									cad[j]= 0;	
					contador++;
										
								
				} while (num != aleatorio);
					if ( num == aleatorio);
					System.out.println("Has acertado!Te ha costado un total de "+contador+" intentos.");

			
							System.out.println("Quieres jugar otra partida? (No=0/Si=1)");
							n = scanner.nextInt();
							if(n==1)
								partida ++;
						
							}
		System.out.println("Has jugado un total de "+partida+" partidas");
	}
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
