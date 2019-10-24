package iesserpis.ed;

import java.util.Scanner;

public class Vector {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tamanyo;
		
		int i,suma=0;
		int[] v ={17,12,15,9,14}; // Crea el vector v. Con el new int le damos los valores.
		String[] L = {"H","O","L","A"};
		
		System.out.println("Primer elemento ="+v[0]);
		
		for(i=0;i<v.length;i++) {
			suma = suma+v[i];
		System.out.println("la suma vale:" +suma);
								}
				System.out.println("Tamaño");
				tamanyo = scanner.nextInt();

				
										
				
		int[] v2 = new int[tamanyo];
		
		for(i=0;i<tamanyo;i++) {
			v2[i]=i+1;
			System.out.println("valores "+v2[i]);
								}
		for(i=0;i<L.length;i++) {
			System.out.print(L[i]);
							}
		
		
	}
}


