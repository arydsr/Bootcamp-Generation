package generationatividades;

import java.util.Scanner;

public class EXERCICIO5 {

	public static void main(String[] args) {

		double nota1, nota2, nota3, media;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o valor da primeira nota:");
		nota1 = ler.nextDouble();

		System.out.println("Digite o valor da segunda nota:");
		nota2 = ler.nextDouble();

		System.out.println("Digite o valor do terceira nota:");
		nota3 = ler.nextDouble();

		media = ((nota1 * 2 + nota2 * 3 + nota3 * 5) / 10);

		System.out.println("A média final do aluno é de " + media);

	}
}
