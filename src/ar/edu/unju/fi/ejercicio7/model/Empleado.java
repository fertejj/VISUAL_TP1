package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private int legajo;
	private double salario;
	static private double salMin =  210000;
	static private double aumentoMerito = 20000;
	
		
	
	public Empleado(String nombre, int legajo, double salario) {
		//ASIGNACION DE PARAMETROS
		this.nombre = nombre;
		this.legajo = legajo;
		//LOGICA DE SALARIOS
		if (salario >= salMin) {
			this.salario = salario;
		} else {
			this.salario = salMin;
		}
	}
	
	public void mostrarDatos() {
		System.out.println("|| DATOS DEL EMPLEADO ||");
		System.out.println("Nombre del empleado: " + this.nombre);
		System.out.println("Legajo: " + this.legajo);
		System.out.println("Salario $: " + this.salario);

	}
	
	public void aumentarPorMerito () {
		this.salario += aumentoMerito;
	}
}
