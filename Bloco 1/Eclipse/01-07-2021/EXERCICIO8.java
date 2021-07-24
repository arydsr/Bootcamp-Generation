package generationatividades;

import java.util.Scanner;

public class EXERCICIO8 {

	public static void main(String[] args) {

		double custoFabrica, custoFinal;

		Scanner ler = new Scanner(System.in);

		System.out.println("Qual o custo de fábrica do produto: ");
		custoFabrica = ler.nextDouble();

		custoFinal = custoFabrica * 1.73;

		System.out.println("O valor total com impostos é de R$" + custoFinal);

	}
}
