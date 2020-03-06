package prueba;

/**
 * Realizar un programa en java que realice la siguiente función: Crear un array
 * de 5 notas que almacenara en formato double. Una vez creado dicho array se
 * rellenaran dichos elementos leyéndolo desde el teclado. Una vez creado el
 * contenido, se calculara la media de las notas así como se mostraran las notas
 * más altas y más bajas de dicho array
 * 
 * @author ur00
 *
 */
public class UF2404EjercicioA {

	public static void main(String[] args) {

		System.out.println("¿Hola q tal?");

		String nombre = "Nota";
		System.out.println("Mi nota es " + nombre);

		// declarar variables : arrayNotas, media, maxima, minima

		double[] notas = { 9.5, 8.5, 7.5, 6.5, 5.5 };
		double sumaNotas = 0;
		double maxima = -100;
		double minima = 100;

		// hacer un for con la longitud del array

		for (int i = 0; i < notas.length; i++) {
			System.out.println("nota " + i + " numero" + " nota " + notas[i]);
			sumaNotas = sumaNotas + notas[i];

			if (notas[i] > maxima) {
				maxima = notas[i];

			}

			if (notas[i] < minima) {
				minima = notas[i];

			}

			System.out.println("media es " + (sumaNotas / 5));// Abrir Scanner
			System.out.println("maxima" + maxima);
			System.out.println("minima" + minima);

			// preguntar por pantalla la nota

			// guardar en el array la nota

			// sumar la nota en la variable media

			// comprobar si es la nota maxima para guardarla en la variable 'maxima'
			// lo mismo con la minima

			// end for

			// usar la variable media para conseguir la 'media' de notas

			// Cerrar Scanner

		}
	}
}
