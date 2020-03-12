package Ejerciciosbasicos;

public class PersonaPruebas {

	public static void main(String[] args) {

		Profesor profesor = new Profesor();
		profesor.setNombre("Jose");
		profesor.setMateria("Matematicas");

		Alumno[] alumnos = new Alumno[3];

		Alumno jaimito = new Alumno();
		jaimito.setNombre("Jaimito");
		jaimito.setNota(Alumno.NOTA_MAX);
		jaimito.setGenero(Persona.GENERO_MASCULINO);

		Alumno marta = new Alumno();
		marta.setNombre("Marta");
		marta.setGenero(Persona.GENERO_FEMENINO);
		marta.setNota(9);

		Alumno pepito = new Alumno();
		pepito.setNombre("pepito");
		pepito.setGenero(Persona.GENERO_INDEFINIDO);
		pepito.setNota(7);

		alumnos[0] = jaimito;
		alumnos[1] = marta;
		alumnos[2] = pepito;

		System.out.println("El profesor " + profesor.getNombre() + " imparte la materia de: " + profesor.getMateria());
		System.out.println("Sus alumnos son:");
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre() + " nota: " + alumno.getNota());
			// System.out.println(alumno.toString());
		}

		// TODO mostrar Alumno con Nota maxima
		String alumnoNotaMaxima = "";
		int notaMaxima = -1;
		int totalNotas = 0;
		// TODO mostrar media de las notas

	}

}
