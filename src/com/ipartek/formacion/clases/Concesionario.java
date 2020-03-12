package com.ipartek.formacion.clases;

public class Concesionario extends Coche {

	public static void main(String[] args) {

		Coche[] concesionario = new Coche[3];

		Coche ford = new Coche();
		ford.setMarca("Ford");
		ford.setColor("Rojo");
		ford.setMatricula("8012GCS");
		ford.setModelo("Kuga");
		ford.setPotencia(85);
		ford.setCilindrada(1500);

		Coche ferrari = new Coche();
		ferrari.setMarca("Ferrari");
		ferrari.setColor("Amarillo");
		ferrari.setMatricula("1208SCG");
		ferrari.setModelo("Spider");
		ferrari.setPotencia(120);
		ferrari.setCilindrada(1800);

		Coche porsche = new Coche();
		porsche.setMarca("Porsche");
		porsche.setColor("Azul");
		porsche.setMatricula("1228STG");
		porsche.setModelo("Panamera");
		porsche.setPotencia(110);
		porsche.setCilindrada(1600);

		// guardar coches en array
		concesionario[0] = ford;
		concesionario[1] = ferrari;
		concesionario[2] = porsche;

		// for para pintar todos los coches del array

		for (Coche coche : concesionario) {
			System.out.println(coche.getMarca() + " color: " + coche.getColor() + " matricula: " + coche.getMatricula()
					+ " modelo: " + coche.getModelo() + " potencia: " + coche.getPotencia() + " cilindrada: "
					+ coche.getCilindrada());
		}

	}

}
