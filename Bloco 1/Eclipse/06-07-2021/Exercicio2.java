package br.com.generation.exerciciosvetorematriz;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[] n = new double[10];
		double maiorNumero = 0.0, media = 0.0, soma = 0.0;
		int cont = 0;

		for (int i = 0; i < n.length; i++) {
			System.out.print("\nDigite os valores do dado: \n");
			n[i] = entrada.nextInt();
			soma = soma + n[i];
			media = soma / 10;

			if (n[i] > maiorNumero) {
				maiorNumero = n[i];
				cont = 0;
			}
			if (n[i] == maiorNumero) {
			}
			cont++;
		}
		System.out.println("O maior número é: " + maiorNumero + "\n");
		System.out.println("A média é de: " + media);
		System.out.println("\nO maior número se repetiu: " + cont + " vezes.");
	}
}