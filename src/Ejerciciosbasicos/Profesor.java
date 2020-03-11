package Ejerciciosbasicos;

public class Profesor extends Persona {

	private double sueldo;
	private String materia;

	public Profesor() {
		super();
		this.sueldo = 200.8;
		this.materia = "Ingles";

	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "profesor [sueldo=" + sueldo + ", materia=" + materia + "]";
	}

}
