package com.ipartek.formacion;

import java.util.Scanner;

public class Excepcion2 {

	public static void main(String[] args) {

		float numero1 = 0;
		float numero2 = 0;
		float resultado;
		Scanner reader = new Scanner(System.in);

		System.out.println("Introduce el primer n�mero:");
		numero1 = reader.nextFloat();

		System.out.println("Introduce el segundo n�mero:");
		numero2 = reader.nextFloat();

		resultado = numero1 / numero2;
		System.out.println("La divisi�n es " + numero1 + " / " + numero2 + " = " + resultado);
	}
}
