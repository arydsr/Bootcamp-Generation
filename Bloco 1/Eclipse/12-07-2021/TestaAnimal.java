package br.com.generation.exerciciospolimorfismo;

public class TestaAnimal {
	
	//Método --> usa um parâmetro, neste caso 'animal'
	public void fazerAnimalCorrer(Animal animal) {
		animal.correr();
	}
	public void somAnimal(Animal animal) {
		animal.som();
	}
	public void nomeAnimal(Animal animal) {
		animal.nome();
	}
	public void idadeAnimal(Animal animal) {
		animal.idade();
	}

}
