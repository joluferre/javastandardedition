package com.ipartek.formacion;

import java.util.Scanner;

/**
 * 
 * Pedir al ususario la temperatura de los dias de la semana, comenzando por el
 * lunes <br>
 * 
 *
 */
public class MediaNumerosBucle2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;
		float numero, total = 0;
		float contador = 0;

		do {

			System.out.println("Dime un numero");
			numero = Float.parseFloat(sc.nextLine());
			total += numero;

			// preguntar si quieres terminar o 'SI' o 'si' o 'si'
			String linea = sc.nextLine();
			if (linea.equalsIgnoreCase("si")) {
				continuar = false;
			}

			// contador = contador + 1;
			contador++;

		} while (continuar);

		System.out.println("El total es " + total);
		System.out.println("La media es " + (total / contador));

		sc.close();
	}
}