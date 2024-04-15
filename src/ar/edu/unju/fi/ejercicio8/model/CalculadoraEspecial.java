package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private double n;

	public CalculadoraEspecial() {
	}

	public double getN() {
		return n;
	}

	public void setN(double n) {
		this.n = n;
	}
	
	public double calcularSumatoria () {
		double resultado = 0;
		
		for (int k = 1; k <= n; k++) {
			double termino = ((k *(k + 1))/2)^2 ;
			resultado += termino;
		}
		return resultado;
	}
	
	public double calcularProductoria () {
		double resultado = 0;		
		
		for (int k = 1; k <= n; k++) {
			double termino = k * (k + 4);
			resultado =+ termino;
		}
		return resultado;
	}
	
}
