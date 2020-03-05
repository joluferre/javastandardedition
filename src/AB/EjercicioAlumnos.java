package AB;

public class EjercicioAlumnos {

	public static void main(String[] args) {

		System.out.println("Hola que tal");

		System.out.println("Chachi Piruli");

		String nombre = "JoseLu";
		System.out.println("Mi nombre es " + nombre);

		String[] alumnos = { "guillermo", "jose", "joserra", "ariel" };
		double[] notas = { 5.5, 6.5, 7.5, 8.5 };

		// System.out.println("posicionx " + "alumnoy")

		for (int i = 0; i < alumnos.length; i++) {
			System.out.println("posicion " + i + " alumno " + alumnos[i] + "nota " + notas[i]);

		} // Cierre for

	}// Cierre llave

}// Cierre clase
