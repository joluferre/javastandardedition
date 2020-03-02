package uf2404;
/*
 * Esto es un comentario de bloque
 * podemos escribir varias lineas de codigo
 */

/*
* JavaDoc es para documentar el codigo fuente o src
* @author ur00
*
*/

public class HolaMundo {

	// Las Clases empiezan con Mayuscula
	// las variables empiezan con minuscula y PascalCase

	// todo nuestro codigo para ejecutar debe estar dentro del MAIN
	public static void main(String[] args) {

		// String: es el tipo de variable
		// persona: nombre de la variable
		// "Jose": es el valor que asignamos a la variable
		String nombre = "Jose";
		int edad = 35;
		float altura = 1.88f; // hay que poner una f al final o (float) por delante
		// float otraAltura = (float) 1.88;
		boolean isGoodDay = false;

		System.out.println(" Hello " + nombre);
		System.out.println("Mi edad es " + edad);
		System.out.println("Mi altura es " + altura + " cm");

		if (isGoodDay) {
			System.out.println("Hoy tengo un dia bueno");
		} else {
			System.out.println("Hoy es un dia de mierda");
		}

	} // final metodo main

} // final de la clase
