package aula2;

import java.util.Scanner;

public class parouimpar {

	public static void main(String[] args) {

	double x;
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite um número: ");
	x = entrada.nextInt();
	
	

	if(x%2==0) {
		System.out.println("O número informado é par");
		System.out.println("Sua raiz quadrada é: " + Math.sqrt(x));
	}
	else {
		System.out.println("O número informado é impar");
		System.out.println("Seu quadrado é: " + Math.pow(x,2.0) );
	}
	
	}
}
