package com.ipartek.formacion;

public class Reemplazar {

	public static void main(String[] args) {

		String textoCodificado = "h0la m1 n=mbre e4 Ma8ol9";
		String textodesCodificado = "h0la m1 n=mbre e4 Ma8ol9";

		textodesCodificado = textodesCodificado.replace('0', 'o');
		textodesCodificado = textodesCodificado.replace('1', 'i');
		textodesCodificado = textodesCodificado.replace('=', 'o');
		textodesCodificado = textodesCodificado.replace('4', 's');
		textodesCodificado = textodesCodificado.replace('8', 'n');
		textodesCodificado = textodesCodificado.replace('9', 'o');

		System.out.println(textoCodificado);
		System.out.println(textodesCodificado);

	}

}
