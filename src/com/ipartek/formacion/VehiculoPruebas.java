package com.ipartek.formacion;

public class VehiculoPruebas {

	public static void main(String[] args) {
		Vehiculo v1 = new Vehiculo();
		Vehiculo v2 = new Vehiculo("negro", "4444 GPS");
		Vehiculo v3 = new Vehiculo("blanco", "1111 XRS", 5);

		System.out.println(v1.toString());
		System.out.println(v2); // No es necesario llamar a toString en un Syso
		System.out.println(v3);

		// vamos a pintar el coche v1
		v1.setColor("rojo");

		// vamos a matricularlo v1
		v1.setMatricula("1234 FGT");

		System.out.println("Despues de pintar y matricular v1");
		System.out.println("v1: " + v1);
	}

}
