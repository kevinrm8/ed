
import java.util.Scanner;

public class anonimoprueba {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int num=0,aleatorio,contador,i,j,intentos,n=1,partida=1,longitud;
		
		while (n != 0){
			System.out.println("Dime el tamaño para adivinar( Max.9999)");
			longitud = scanner.nextInt();
			
			String[] cad=new String[longitud]; // Creo cadena de tamaño longitud
			
			for(i=0;i<longitud;i++) {
				cad[i]=(i+1)+"";
				System.out.print("["+cad[i]+"]");
							}
			System.out.println("");
			aleatorio = (int) (Math.random()*longitud+1);
			contador=1;
			do { 
				System.out.println("Adivina el numero entre [1-"+longitud+"]");
				num= scanner.nextInt();
					if(num != aleatorio) {
						System.out.println("Has fallado!");
							if(num>aleatorio){
							System.out.println("Te has pasado! El numero que buscas es menor que "+num);
							
							for(j=num;j<=longitud;j++) {
									cad[(j-1)]= "";
							}
							for(i=0;i<longitud;i++)
							System.out.print("["+cad[(i)]+"]");
							System.out.println("");

											}
							
											else 
												{System.out.println("Te has quedado corto! El numero que buscas es mayor que "+num);
												for(j=0;j<num;j++)
													cad[j]= "";	
													contador++;
												for(i=0;i<longitud;i++)
													System.out.print("["+cad[i]+"]");
													System.out.println("");							
										}
									} 
				
				} while (num != aleatorio );
			
					if ( num == aleatorio);
					System.out.println("Has acertado!Te ha costado un total de "+contador+" intentos.");
					
							System.out.println("Quieres jugar otra partida? (No=0/Si=1)");
							n = scanner.nextInt();
							if(n==1)
								partida ++;
						
							}
			if (n==0)
			System.out.printf("Has jugado un total de %s partida/s",partida);
	}
	}
