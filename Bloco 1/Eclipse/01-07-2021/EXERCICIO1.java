package generationatividades;

import java.util.Scanner;

public class EXERCICIO1 {

	
	public static void main(String[] args) {
		
		int idade_anos , idade_meses , idade_dias , total_dias;
		
		Scanner ler = new Scanner(System.in);

			System.out.println("Digite a sua idade em anos? ");
		idade_anos = ler.nextInt();

			System.out.println("Digite a sua idade em meses? ");
		idade_meses = ler.nextInt();

			System.out.println("Digite a sua idade em dias? ");
		idade_dias = ler.nextInt();

			System.out.println("A idade dos anos em dias é " + ((idade_anos * 365) + (idade_meses * 30) + idade_dias));
	}

}
