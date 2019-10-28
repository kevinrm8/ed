package iesserpis.ed;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Busqueda {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int v[] = new int[10];	
		int x=0,index,numero=0;
		
		// Para poner los numeros del vector manualmene:
//		for(int i=0;i<v.length;i++) {
//			System.out.println("Dime el valor de la posicion " +(i+1));
//			v[i]=scanner.nextInt();
//			}
		
		//Para poner los numeros de forma automatica
		for (int i=0;i<v.length;i++) {
			v[i] = ThreadLocalRandom.current().nextInt(1,10);
			System.out.print(" "+v[i]);
									}
		
		System.out.println();
		
		System.out.println("Dime el numero que buscas: ");
		numero = scanner.nextInt();
		
		
		index = indexOf(v, numero);
		
		if(index ==-1)
			System.out.println("El numero que buscas no esta en el vector");
		else
		System.out.println("El numero que buscas esta en la posicion = " +index);
		
		
	}
	
	public static int indexOf(int[]vector, int posicion) {
		
		for(int i=0;i<vector.length;i++) 
			if(posicion == vector[i]) {
				posicion=i;
					return posicion;}	
		return -1;
	}

}
