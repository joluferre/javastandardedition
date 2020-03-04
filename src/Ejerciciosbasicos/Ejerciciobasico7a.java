package Ejerciciosbasicos;

public class Ejerciciobasico7a {

	public static void main(String[] args) {
		int c = 10;
		System.out.println(c + (c >= 0 ? " es positivo" : " es negativo"));
		System.out.println(c + (c % 2 == 0 ? " es par" : " es impar"));
		System.out.println(c + (c % 5 == 0 ? " es mult" : " no es mult"));
		System.out.println(c + (c % 10 == 0 ? " es mult" : " no es mult"));
		System.out.println(c + (c < 100 ? " es menor q" : " es mayor q"));
	}

}
