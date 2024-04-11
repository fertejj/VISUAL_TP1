package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("|| CALCULAR FACTORIAL ||");
		//TOMA DE DATOS
		System.out.println("Introduzca numero: ");
		int numero = scanner.nextInt();
		scanner.close();
		System.out.println("Has introducido el número: " + numero);
		//LOGICA QUE CALCULA EL FACTORIAL
		int contador = 1;
		int factorial = 1;
		while (contador <= numero) {
			factorial = factorial * contador;
			contador++;
		}
		//IMPRIMO RESULTADO
		System.out.println("El factorial de " + numero + " es: " + factorial);
	}

}
