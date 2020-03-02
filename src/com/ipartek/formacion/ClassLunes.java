package com.ipartek.formacion;

public class ClassLunes {

	public static void main(String[] args) {

		// booleanos
		boolean tienesCoronavirus = true; // valor por defecto false

		// enteros
		byte bite = 0; // 1byte = 8 bits
		short corto = 0; // 2 bytes
		int entero = 0; // 4 bytes
		long largo = 0; // 8 bytes

		// reales o numeros con coma
		float numeroReal = 2f; // es necesario poner una f al final o poner delante (float)
		double todaviaMasGrande = 6; // no hace falta castear o poner el tipo

		// caracteres
		char letra = 'a'; // se usa comillas simples
		char letraA = 65;

		// caracteres
		char letra =  'a'; se usa comillas simples
		char letraA = 65;
		
		/**
		 * Wrappers: Son clases que nos ayudan a trabajar con las variables primitivas,
		 * estas empiezan siempre por Mayusculas <br>
		 * 
		 * int > Integer <br>
		 * 
		 * 
		 */
		
		System.out.println("Un int ocupa " + Integer.SIZE + "bits ");
		System.out.println("valor minimo ") + Integer.MIN_VALUE + " valor maximo" + Integer.MAX_VALUE);
		
		String numeroEnFormatoTexto = "23";
		int numero2 = 2;
		
		int total = numero 2 + Integer.parseInt(numeroEnFormatoTexto);
	    System.out.println(numero2 + "+" + numeroEnFormatoTexto + "=" + Total);
	} // main

}// Clase
