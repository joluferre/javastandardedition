package AB;

import java.util.Scanner;

public class PreguntaNumero1 {

	public static void main(String[] args) {
		System.out.println("Hola, �Qu� tal?");

		Scanner teclado = new Scanner(System.in);

		int numero = teclado.nextInt();
		System.out.println("has escrito " + numero);

		teclado.close();

	}
}
