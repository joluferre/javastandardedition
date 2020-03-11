package com.ipartek.formacion;

public class Coche extends Vehiculo {

	private boolean radio;

	public Coche() {
		super();
		// this.numeroRuedas = 5; cambiar en Vehículo a 'protected' para que sea
		// visible.
		this.setNumeroPuertas(5);
		this.setNumeroRuedas(4);
		this.radio = false;

	}

	public boolean isRadio() {
		return radio;
	}

	public void setRadio(boolean radio) {
		this.radio = radio;
	}

}
