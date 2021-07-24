package br.com.generation.lacosderepeticao;

import java.util.Scanner;

public class exercicio6 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = 1, soma = 0, qtdeMultiplo = 0;
		
		do {
			System.out.println("Digite um número: ");
			x = input.nextInt();
			
			if(x % 3 == 0 && x != 0) {
				qtdeMultiplo++;
				soma += x;
			}
		}
		while(x != 0);
		
		System.out.println("Media Multiplo de 3: " + soma / qtdeMultiplo);
	}

}


