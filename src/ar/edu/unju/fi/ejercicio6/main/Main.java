package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//RECOLECCION DE DATOS
		System.out.println("Creacion de clase Persona con constructor vacio");
		Scanner scanner = new Scanner(System.in);
		Persona nuevaPersona = new Persona ();
		System.out.println("Ingrese DNI: ");
		int dni = scanner.nextInt();
		nuevaPersona.setDni(dni);
		scanner.nextLine();
		System.out.println("Ingrese nombre: ");
		nuevaPersona.setNombre(scanner.nextLine());
		System.out.println("Ingrese fecha nacimiento: (yyyy-MM-dd)");
		nuevaPersona.setFechaNacimiento(LocalDate.parse(scanner.nextLine()));
		System.out.println("Ingrese provincia: ");
		nuevaPersona.setProvincia(scanner.nextLine());
		
		//MOSTRAR DE DATOS
		System.out.println("|| DATOS RECIBIDOS ||");
		nuevaPersona.mostrarDatos(); 

		//RECOLECCION DE DATOS
		System.out.println("Creacion de clase Persona con constructor parametrizado");
		System.out.println("Ingrese DNI: ");
		int dniP = (scanner.nextInt());
		scanner.nextLine();
		System.out.println("Ingrese nombre: ");
		String nombreP = scanner.nextLine();
		System.out.println("Ingrese fecha nacimiento: (yyyy-MM-dd)");
		LocalDate fechaNacP = LocalDate.parse(scanner.nextLine());
		System.out.println("Ingrese provincia: ");
		String provinciaP = (scanner.nextLine());
		Persona nuevaPersonaP = new Persona (dniP, nombreP, fechaNacP, provinciaP);
		
		
		//MOSTRAR DE DATOS
		System.out.println("|| DATOS RECIBIDOS ||");
		nuevaPersonaP.mostrarDatos(); 
		
		//RECOLECCION DE DATOS
		System.out.println("Creacion de clase Persona con constructor semi parametrizado");
		System.out.println("Ingrese DNI: ");
		int dniSP = (scanner.nextInt());
		scanner.nextLine();
		System.out.println("Ingrese nombre: ");
		String nombreSP = scanner.nextLine();
		System.out.println("Ingrese fecha nacimiento: (yyyy-MM-dd)");
		LocalDate fechaNacSP = LocalDate.parse(scanner.nextLine());
		Persona nuevaPersonaSP = new Persona (dniSP, nombreSP, fechaNacSP );
		
		//MOSTRAR DATOS
		nuevaPersonaSP.mostrarDatos();
	}

}
