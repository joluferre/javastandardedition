package com.ipartek.formacion;

public class Pais {
// atributos

	// cuando se construye un país su nombre es "" y numero de casos 0

	private String nombre;
	private int numerocasos;

	public Pais() {
		super();
		this.nombre = "Anonimo";
		this.numerocasos = 20;
	}

	// crear getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumerocasos() {
		return numerocasos;
	}

	public void setNumerocasos(int numerocasos) {
		this.numerocasos = numerocasos;
	}

	@Override
	public String toString() {
		return "Paise [nombre=" + nombre + ", numerocasos=" + numerocasos + ", getNombre()=" + getNombre()
				+ ", getNumerocasos()=" + getNumerocasos() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public void numerocasos(int i) {
		// TODO Auto-generated method stub

	}

	// crear to String
}
