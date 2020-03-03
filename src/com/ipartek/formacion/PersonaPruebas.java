package com.ipartek.formacion;

public class PersonaPruebas {

	public static void main(String[] args) {

		// usamos la palabra new patra crear un objeto o instanciar
		Persona adam = new Persona();

		// no podemos acceder pq los atributos son privados
		// adam.nombre = "Adam";
		// adam.edad = -45;

		adam.setNombre("Adam");
		adam.setEdad(45);

		Persona eva = new Persona();
		eva.setEdad(30);
		eva.setNombre("Eva");

		System.out.println("Mi nombre es " + adam.getNombre()); // el syso hace un .toString() automatico
		System.out.println("EVA: " + eva);

	}

}
