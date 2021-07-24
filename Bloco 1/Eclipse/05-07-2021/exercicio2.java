package br.com.generation.lacosderepeticao;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] argss) {

		Scanner escreva = new Scanner(System.in);

		int num, contadorPar = 0, contadorImpar = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º número");

			num = escreva.nextInt();

			if (num % 2 == 0) {
				contadorPar++;
			}
			else {
				contadorImpar++;
			}

		}
		System.out.println("\nForam digitados " + contadorPar + " números pares.");
		System.out.println("Foram digitados " + contadorImpar + " números ímpares.");
	}
}
