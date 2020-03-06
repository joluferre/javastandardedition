package prueba;

import java.util.Scanner;

/**
 * Comentar la jugada....
 * 
 * @author ur00
 *
 */
public class UF2404EjercicioB {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion = 0;

		boolean continuar = true;

		do {
			pintarMenu();
			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1:
				calcularDNI();
				break;

			case 2:
				convertirMetrosApies();
				break;

			case 3:
				System.out.println("Hasta pronto");
				continuar = false;
				break;

			default:
				System.out.println("Por favor selecciona una opcion valida");
				break;

			}// switch

		} while (continuar);

		sc.close();
	}// main

	private static void pintarMenu() {
		System.out.println("1. Calcular letra DNI");
		System.out.println("2. Convertir de pies a metros");
		System.out.println("3. salir");
		System.out.println("Por favor selecciona una opcion del 1 al 3");

	}

	private static void convertirMetrosApies() {

		System.out.println("¿Cuantos pulgadas son 1 metro?");
		String linea = sc.nextLine();
		double pulgadas = Double.parseDouble(linea);
		double metros = 0;

		System.out.println("la equivalencia de 1 metro son" + " 39.3701" + " pulgadas \n \n ");

	}

	private static void calcularDNI() {
		System.out.println("Dime tu dni");
		String dniTexto = sc.nextLine();

		System.out.println(dniTexto);

		final char LETRA_DNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
				'V', 'H', 'L', 'C', 'K', 'E' };

		String dni = "72402909";
		int numeroDni = Integer.parseInt(dniTexto);

		int restoDivision = numeroDni % 23;

		System.out.println("La letra es " + LETRA_DNI[restoDivision]);

	}

}// clase