package uf2404;

public class PruebaTecnica {

	public static void main(String[] args) {
		System.out.println("Prueba tecnica");

		for (int i = 0; i < 3; i++) {
			System.out.println("Esta la Iteracion numero " + i);

			if (i == 0) {
				System.out.println("0 es 0");
			} else {
				if (i % 2 == 0) {
					System.out.println(i + " Es Par");
				} else {
					System.out.println(i + " Es Impar");

				}

			} // for
			System.out.println("** Terminamos el bucle");
		} // main
	}
}
