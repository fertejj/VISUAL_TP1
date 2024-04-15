package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;

public class Persona {
	// Definicion de variables y tipos de datos
	private int dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	// Constructores:

	public Persona() {
		
	}
	public Persona(int dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}
	
	public Persona(int dni, String nombre, LocalDate fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = "Jujuy";
	}
	
	// Metodos accesores
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
	// Metodos funcionales
	
	public int calcularEdad () {
		// Obtener fecha actual
		LocalDate fechaActual = LocalDate.now();
		// Calcular diferencia entre fecha actual y fecha de nacimiento
		// Calcular diferencia anual
		int edad = fechaActual.getYear() - fechaNacimiento.getYear();
		// Verificar si ya cumplio años ese año
		if (fechaNacimiento.getMonthValue() > fechaActual.getMonthValue() ||
	            (fechaNacimiento.getMonthValue() == fechaActual.getMonthValue() &&
	             fechaNacimiento.getDayOfMonth() > fechaActual.getDayOfMonth())) {
	            edad--;
	        }
		return edad;
	}
	
	public boolean mayoriaEdad () {
			if(calcularEdad() >= 18) {
				return true;
			} else {
				return false;
			}

	}
	
	public void mostrarDatos() {
		System.out.println("DNI: " + this.dni);
		System.out.println("NOMBRE: " + this.nombre);
		System.out.println("FECHA NACIMIENTO: " + this.fechaNacimiento);
		System.out.println("PROVINCIA: " + this.provincia);
		System.out.println("EDAD: " + this.calcularEdad());
		System.out.println("MAYOR DE EDAD: " + this.mayoriaEdad());
	}
	
	@Override
	public String toString() {
		return "Persona: [DNI=" + dni + ", Nombre=" + nombre + ", Fecha de Nacimiento=" + fechaNacimiento + ", Provincia="
				+ provincia + "]";
	}
	
	
}
