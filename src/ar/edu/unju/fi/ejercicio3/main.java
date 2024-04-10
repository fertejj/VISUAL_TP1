package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// Declaracion de variables:
		int numero;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Introduzca un numero: ");
		numero = scanner.nextInt();
		
		if (numero % 2 == 0) {
			int par = numero * 3;
			System.out.print(par);
		} else {
			int impar = numero * 2;
			System.out.print(impar);
		}
		
	}

}
