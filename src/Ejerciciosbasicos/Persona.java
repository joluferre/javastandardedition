package Ejerciciosbasicos;

public class Persona {

// Atributos, siempre son private para que no se puedan maniopualr fuera de esta clase
// para poder manipular los atributos hay que crear métodos publicos getters y setters. ha esto se le llama encapsulación

	private String nombre;
	private double altura;
	private int edad;
	private String genero;
	private String raza;

	// constructores pq se llama igual que la clase

	public Persona() {
		super();
		this.nombre = "Anonimo";
		this.altura = 1.8;
		this.edad = 30;
		this.genero = "masculino";
		this.raza = "blanco";

		// TODO Auto-generated constructor stub
	}

	// GETTERS Y SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "persona [nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + ", genero=" + genero + ", raza="
				+ raza + "]";
	}

// Constructor pq se llama igual que la clase
}
