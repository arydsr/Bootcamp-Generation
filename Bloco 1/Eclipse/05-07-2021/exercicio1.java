package br.com.generation.lacosderepeticao;

public class exercicio1 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos
		 * resto = 5. (FOR)
		 */

		for (int i = 1000; i <= 1999; i++) {
			if (i % 11 == 5) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
	}
}