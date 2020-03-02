package com.ipartek.formacion;

import java.util.Scanner;

public class Paises {

	public static void main(String[] args) {

		final String[] PAISES = { "Noruega", "Alemania", "Republica Checa", "Italia" };
		boolean[] paisesInfectados = { false, false, false, false };
		int[] numeroInfectados = { 0, 0, 0, 0 };

		// recorrer paises y preguntar si existe algun caso corona virus
		// en caso afirmativo, preguntar numero de infectados

		paisesInfectados[1] = true;
		numeroInfectados[1] = 5;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < numeroInfectados.length; i++) {
			if (paisesInfectados[i] == true) {
				System.out.println(PAISES[i] + " esta infectado");
				System.out.println("¿cuantos infectados hay?");
				numeroInfectados[i] = sc.nextInt();
			} else {
				paisesInfectados[i] = false;
				{
					System.out.println("¿Qué pais?" + PAISES[i]);

				}

			}
			// finalmente
			// 1:mostrar paises libres de coronavirus
			// 2:mostrar pasises infectados junto con su numero de casos
			// 3:total numero de personas infectadas
		}
	}
}
