package AB;

import java.util.Scanner;

public class PreguntarNumero {

	public static void main(String[] args) {
		System.out.println("Dime un numero");

		Scanner teclado = new Scanner(System.in);

		int numero = teclado.nextInt(); // lee un numero
		System.out.println("has escrito" + numero);

		teclado.close(); // cerramos el teclado
	}

}
