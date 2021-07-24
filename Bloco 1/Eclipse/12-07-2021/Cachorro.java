package br.com.generation.exerciciospolimorfismo;

public class Cachorro implements Animal {
	
	@Override
	public void som() {
		System.out.println("AU AU AU");
		
	}

	@Override
	public void correr() {
		System.out.println("OPA! O Doguinho correu!!");
		
	}

	@Override
	public void idade() {
		System.out.println("ele tem 5 anos");		
	}

	@Override
	public void nome() {
		System.out.println("O nome do cachorro é Spike");
		
	}
}
