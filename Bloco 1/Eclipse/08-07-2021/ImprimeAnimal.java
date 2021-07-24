package br.com.generation.heranca;

import java.util.Scanner;

public class ImprimeAnimal {
	
	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	
	Cachorro ca1 = new Cachorro();
	
	System.out.print("Qual nome do cachorro? ");
	
	ca1.setNome(entrada.nextLine());
	
	System.out.println("Nome: " + ca1.getNome());

	}
}


