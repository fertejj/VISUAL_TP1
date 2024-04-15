package ar.edu.unju.fi.main;

import ar.edu.unju.fi.model.ConversorMonedas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double montoAconvertir = 100;
		
		double montoConvertido = ConversorMonedas.convertirDolarAPeso(montoAconvertir);
		
		double montoConvertido1 = ConversorMonedas.convertirPesoADolar(montoConvertido);
		
		System.out.println(montoConvertido);
		System.out.println(montoConvertido1);
		 	
	}

}
