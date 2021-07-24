package br.com.generation.exerciciospolimorfismo;

public class Cavalo implements Animal{

	public void som() {
		System.out.println("NHIEEEHHEHEHE");
		
	}

	@Override
	public void correr() {
		System.out.println("OXI! Correu o cavalin...");
		
	}

	@Override
	public void idade() {
		System.out.println("ele tem 12 anos");		
	}

	@Override
	public void nome() {
		System.out.println("O nome do cavalo é Arthur Morgan");
		
	}

}
