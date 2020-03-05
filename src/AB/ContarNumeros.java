package AB;

public class ContarNumeros {

	public static void main(String[] args) {

		String cadena = "hola hoy es 13 de febrero";
		int suma = 0;

		for (int i = 0; i < cadena.length(); i++) {

			System.out.println(i);
			char caracter = cadena.charAt(i);
			System.out.println(caracter);
			System.out.println("i=0, caracter = h");
			System.out.println("en la posicion " + i + " se encuentra el caracter " + cadena.charAt(i));
		} // Cierre for

		System.out.println("suma de los numeros " + suma);

	}// CIERRA MAIN

}// cierra clase
