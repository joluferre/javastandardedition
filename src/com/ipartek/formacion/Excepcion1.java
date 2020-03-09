package com.ipartek.formacion;

import java.util.Scanner;

public class Excepcion1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Introduce el primer número:");
			String linea = sc.nextLine();
			int a = Integer.parseInt(linea);

			System.out.println("Introduce el segundo número:");
			linea = sc.nextLine();
			int b = Integer.parseInt(linea);
			System.out.println("La división es " + (a / b));

		} catch (Exception e) {
			System.out.println("Houston- Tenemos un problema");
		}

		sc.close();
	}
}
