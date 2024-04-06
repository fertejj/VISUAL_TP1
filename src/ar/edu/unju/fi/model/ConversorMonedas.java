package ar.edu.unju.fi.model;

import ar.edu.unju.fi.model.ctes.TipoCambio;

public class ConversorMonedas {

	public static double convertirDolarAPeso(double valorEnDolar) {
		return valorEnDolar * TipoCambio.PESO_DOLAR;
	}
	
	public static double convertirPesoADolar(double valorEnPeso) {
		return valorEnPeso / TipoCambio.PESO_DOLAR;
	}
	
}
