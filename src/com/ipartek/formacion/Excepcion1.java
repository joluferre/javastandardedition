package com.ipartek.formacion;

import java.util.Scanner;

public class Excepcion1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Introduce el primer n�mero:");
			String linea = sc.nextLine();
			int a = Integer.parseInt(linea);

			System.out.println("Introduce el segundo n�mero:");
			linea = sc.nextLine();
			int b = Integer.parseInt(linea);
			System.out.println("La divisi�n es " + (a / b));

		} catch (Exception e) {
			System.out.println("Houston- Tenemos un problema");
		}

		sc.close();
	}
}
