package com.ipartek.formacion;

import java.util.Scanner;

/**
 * 
 * Ejercicio para pedir 3 numeros
 *
 */
public class MediaNumerosBucle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean terminar = true;
		float numero, total = 0;
		float contador = 0;

		do {

			System.out.println("Dime un numero");
			numero = Float.parseFloat(sc.nextLine());
			total += numero;

			// preguntar si quieres terminar o 'SI' o 'si' o 'si'
			String linea = sc.nextLine();
			if (linea.equalsIgnoreCase("si")) {
				terminar = false;
			}

			// contador = contador + 1;
			contador++;

		} while (terminar);

		System.out.println("El total es " + total);
		System.out.println("La media es " + (total / contador));

		sc.close();
	}
}