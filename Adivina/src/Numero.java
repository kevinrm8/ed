import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num=0,aleatorio,i,contador=0;
		
		System.out.println("Intenta acertar el numero entre [1-10]");
			
		
		aleatorio=(int) (Math.random()*10); //Creo numero aleatorio
		
		if(num != aleatorio) { //Primera vez que intento acertar numero
			System.out.println("Prueba suerte: ");
			num = scanner.nextInt();
					
			for(i=1;i<=10;i++) {
					if (num != aleatorio) {
						System.out.println("Has fallado! Vuelve a intentarlo: ");
						num = scanner.nextInt();
											}
						if(num==aleatorio) {
							i=11;
											}
							else {
								System.out.println("Enhrabuena! Has acertado!");
								}
								}
							}
		
	}
}
