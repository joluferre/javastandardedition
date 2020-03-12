package com.ipartek.formacion.clases;

import java.util.Scanner;

public class Concesionario1 {

	public static void main(String[] args) {

		Coche p = new Coche();
		String marca = "";
		String color;
		String matricula;
		String modelo;
		float potencia; // cv
		int cilindrada;

		Scanner sc = new Scanner(System.in);

		// Pedir datos por consola
		System.out.println("Vamos a dar de alta un coche nuevo, necesito los siguientes datos");
		System.out.println("marca:");
		marca = sc.nextLine();

		System.out.println("introduce color:");
		color = sc.nextLine();

		System.out.println("introduce matricula:");
		matricula = sc.nextLine();

		System.out.println("¿modelo?");
		modelo = sc.nextLine();

		System.out.println("introduce potencia:");
		potencia = Float.parseFloat(sc.nextLine());

		System.out.println("¿cilindrada?");
		cilindrada = Integer.parseInt(sc.nextLine());

		// rellenar el objeto
		p.setMarca(marca);
		p.setColor(color);
		p.setMatricula(matricula);
		p.setModelo(modelo);
		p.setPotencia(potencia);
		p.setCilindrada(cilindrada);

		// mostrar por pantalla
		System.out.println("Gracias por la informacion, hemos dado de alta el siguiente coche");
		System.out.println(p);

		sc.close();

	}

}