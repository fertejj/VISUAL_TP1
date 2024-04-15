package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("|| CREAR NUEVO EMPLEADO ||");
		System.out.println("Introduzca nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("Introduzca legajo: ");
		int legajo = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Introduzca salario: ");
		double salario = scanner.nextDouble();
		scanner.nextLine();

		Empleado newEmpleado = new Empleado (nombre, legajo, salario);
		
		newEmpleado.mostrarDatos();
		
		
		System.out.println("Aplicando aumento");
		newEmpleado.aumentarPorMerito();
		System.out.println("Aumento aplicado");	
		newEmpleado.mostrarDatos();
	}

}
