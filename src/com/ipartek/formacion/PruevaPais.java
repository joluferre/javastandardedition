package com.ipartek.formacion;

public class PruevaPais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// crear dos objetos de tipo Pais

		// España con 120 casos

		Pais p1 = new Pais();
		p1.setNombre("España");
		p1.numerocasos(120);

		// Francia con 300 casos
		Pais p2 = new Pais();
		p2.setNombre("Francia");
		p2.numerocasos(300);

		// mostrar por consola los datos

		System.out.println("El nombre es " + p1.getNombre()); // el syso hace un .toString() automatico

		System.out.println("Cuantos casos " + p1.getNumerocasos());

	}

}
