package Ejerciciosbasicos;

public class Alumno extends Persona {

	private String email;
	private String github;
	private double nota;

	public Alumno() {
		super();
		this.email = "joluferre";
		this.github = "josegit";
		this.nota = 5.5;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;

	}

	@Override
	public String toString() {
		return "Alumno [email=" + email + ", github=" + github + ", nota=" + nota + "]";
	}

}
