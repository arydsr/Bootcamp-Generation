package br.com.generation.exerciciospolimorfismo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ImprimeAnimal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		TestaAnimal anml = new TestaAnimal();
		
		anml.nomeAnimal(new Cachorro());
		anml.idadeAnimal(new Cachorro());
		anml.fazerAnimalCorrer(new Cachorro());
		anml.somAnimal(new Cachorro());
		
		System.out.println("\n\n");
		
		anml.nomeAnimal(new Cavalo());
		anml.idadeAnimal(new Cavalo());
		anml.fazerAnimalCorrer(new Cavalo());
		anml.somAnimal(new Cavalo());
		
		System.out.println("\n\n");
		
		anml.nomeAnimal(new Preguica());
		anml.idadeAnimal(new Preguica());
		anml.fazerAnimalCorrer(new Preguica());
		anml.somAnimal(new Preguica());
		
		System.out.println("\n\n");

				
		entrada.close();

	}

}
