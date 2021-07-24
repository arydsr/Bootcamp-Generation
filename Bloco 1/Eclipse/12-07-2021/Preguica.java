package br.com.generation.exerciciospolimorfismo;

public class Preguica implements Animal{

	public void som() {
		System.out.println("......zzzRROONC");
		
	}

	@Override
	public void correr() {
		System.out.println("~ s l o w   m o t i o n ~");
		
	}

	@Override
	public void idade() {
		System.out.println("tem 8 anos");		
	}

	@Override
	public void nome() {
		System.out.println("Araci, a preguiça");
		
	}
}
