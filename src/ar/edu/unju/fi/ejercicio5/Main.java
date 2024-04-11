package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("|| MOSTRAR TABLA DE MULTIPLICAR ||");
		//TOMA DE DATOS
		System.out.println("Introduzca numero entre 1 y 9 para mostrar su tabla: ");
		int numero = scanner.nextInt();
		scanner.close();
		System.out.println("Introdujo el numero " + numero);
		System.out.println("MOSTRANDO TABLA");
		int contador = 10;
		int multiplo;
		
		//LOGICA DEL BUCLE FOR
		for (int i = 1; i <= contador; i++) {
			multiplo = i * numero;
			System.out.println(numero + "x" + i + "=" + multiplo);

		}
		
	}

}
