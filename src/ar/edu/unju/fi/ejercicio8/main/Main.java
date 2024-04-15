package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("|| CALCULADORA ESPECIAL ||" );
		 // Crear una instancia de CalculadoraEspecial con un valor de n específico
        CalculadoraEspecial calculadora = new CalculadoraEspecial();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte numero: " );
        double n = scanner.nextDouble();
        scanner.nextLine();
        calculadora.setN(n);
        
        // Calcular la sumatoria y mostrar el resultado
        double sumatoria = calculadora.calcularSumatoria();
        System.out.println("El resultado de la sumatoria es: " + sumatoria);
        System.out.println("El resultado de la productoria es: " + calculadora.calcularProductoria());
        

	}

}
