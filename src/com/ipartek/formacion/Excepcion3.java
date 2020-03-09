package com.ipartek.formacion;

import java.util.Scanner;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

//*Realice un programa que nos solicite por teclado dos números, y leerlos usando la clase Scanner mediante la función nextLine(). 
//Transformar ambos strings a números enteros usando la siguiente sentencia Integer.parseInt(numeroLeido). 
//Agrupar el código entre un bloque try catch y procesar para que no se produzca una interrupción 
//y finalización del programa si alguno de los números leídos no puede convertirse, retomando el control en el punto del fallo, 
//hasta que se solucione

public class Excepcion3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		String linea = "";
		boolean repetir = true;
		
		do {
			
		try {
		System.out.println("1er numero");
		linea = sc.nextLine();
		a = Integer.parseInt(linea);
		
		System.out.println("2o numero");
		linea = sc.nextLine();
		a = Integer.parseInt(linea);
		
		System.out.println("1er numero= " + a + "2º numero" + b);
		repetir = false;
			
		} catch (Exception e) {
		System.out.println("Introduce 2 numeros validos");
		}
		

	}
}