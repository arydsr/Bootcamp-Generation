package br.com.generation.lacosderepeticao;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] argss) {

		Scanner escreva = new Scanner(System.in);

		int idade = 0, menores = 0, maiores = 0;

		while (idade != -99) {
			
			System.out.println("Digite sua idade:\n");
			idade = escreva.nextInt();

			if (idade > 0 && idade < 21) 
				menores++;
				System.out.println("O total de pessoas com menos de 21 anos foram: " + menores);

			if (idade > 50)
				maiores++;
				System.out.println("O total de pessoas com mais de 50 anos foram: " + maiores);		
		}
	}
}
