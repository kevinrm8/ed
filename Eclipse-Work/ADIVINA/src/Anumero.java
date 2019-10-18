import java.util.Scanner;

public class Anumero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int num,aleatorio,contador,i,j,intentos=3,n=1,partida=1;
		String[] cad=new String[10]; // Creo cadena de tamaño 10
		
		
		
		while (n != 0){
			for(i=0;i<10;i++) {
				cad[i]=(i+1)+"";
				System.out.print("["+cad[i]+"]");
							}
			System.out.println("");
			aleatorio = (int) (Math.random()*10+1);
			contador=1;
			do { 
				System.out.println("Adivina el numero entre [1-10]");
				num= scanner.nextInt();
				
					if(num != aleatorio) {
						System.out.println("Has fallado!");
							if(num>aleatorio){
							System.out.println("Te has pasado! El numero que buscas es menor que "+num);
							
							for(j=num;j<=10;j++) {
									cad[(j-1)]= "";
							}
							for(i=0;i<10;i++)
							System.out.print("["+cad[(i)]+"]");
							System.out.println("");

											}
							
											else 
												{System.out.println("Te has quedado corto! El numero que buscas es mayor que "+num);
												for(j=0;j<num;j++)
													cad[j]= "";	
													contador++;
												for(i=0;i<10;i++)
													System.out.print("["+cad[i]+"]");
													System.out.println("");

												}
										}
								
				} while (num != aleatorio);
			
					if ( num == aleatorio);
					System.out.println("Has acertado!Te ha costado un total de "+contador+" intentos.");

			
							System.out.println("Quieres jugar otra partida? (No=0/Si=1)");
							n = scanner.nextInt();
							if(n==1)
								partida ++;
						
							}
			if (n==0)
			System.out.println("Has jugado un total de "+partida+" partidas");
	}
	}
	
	
