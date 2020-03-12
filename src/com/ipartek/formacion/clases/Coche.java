package com.ipartek.formacion.clases;

public class Coche {

	// 1.Atributos

	private String color;
	private String matricula;
	private String marca;
	private String modelo;
	private float potencia; // cv
	private int cilindrada;

	// 2.Constructores

	public Coche() {
		super();
		this.color = "";
		this.matricula = "";
		this.marca = "";
		this.modelo = "";
		this.potencia = 0;
		this.cilindrada = 0;
	}

	// 3.Getters y Setters

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

//4.toString
	// Sobreescritura del metodo del padre

	@Override
	public String toString() {
		return "Coche [color=" + color + ", matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo
				+ ", potencia=" + potencia + ", cilindrada=" + cilindrada + "]";
	}

//5.Resto de [ metodos || funciones || comportamientos ] si hiciesen falta

}
