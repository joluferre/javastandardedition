package com.ipartek.formacion;

import java.util.Scanner;

public class ConfigVeh {

	public static void main(String[] args) {

		// preguntar por consola como quiere el vehiculo
		System.out.println("�C�mo quieres el veh�culo?");
		Scanner teclado = new Scanner(System.in);
		String nombre = teclado.nextLine();

		// preguntar color
		System.out.println("�De qu� color es el coche?");
		String color = teclado.nextLine();

		// preguntar matricula

		System.out.println("�Numero de matricula?");
		String matricula = teclado.nextLine();

		// preguntar puertas y resto de atributos
		System.out.println("�Cu�ntas puertas tenemos?");
		String puertas = teclado.nextLine();

		// mostrar uno a uno todos los atributos por consola
		System.out.println(nombre + ", " + color + ", " + matricula + "" + puertas);

		teclado.close();

	}

}
