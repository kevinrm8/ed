package iesserpis.ed;

import java.util.Scanner;

public class Clase031019 {

	public static void main(String[] args) {
		String nombre="";
		int edad =0;
		
		System.out.println(" Dime tu nombre");
		Scanner scanner= new Scanner(System.in);
		nombre=scanner.nextLine();
		System.out.println("Dime tu edad");
		edad =scanner.nextInt();
		
		System.out.println("Su nombre es "+ nombre + " el año que viene tu edad sera de "+(edad+1));
	}
}
