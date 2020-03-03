package com.ipartek.formacion;

public class Persona {

// Atributos, siempre son private para que no se puedan maniopualr fuera de esta clase
// para poder manipular los atributos hay que crear métodos publicos getters y setters. ha esto se le llama encapsulación

	private String nombre;
	private int edad;

	// constructores pq se llama igual que la clase
	public Persona() {
		super();
		this.nombre = "Anonimo";
		this.edad = 18;

		// TODO Auto-generated constructor stub
	}

	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

// Constructor pq se llama igual que la clase
}
