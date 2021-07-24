package aula2;

import java.util.Scanner;

public class categoriaidade {
	
public static void main(String[] args) {
		
		int idade;
		char infantil, juvenil , adulto;
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Digite a idade: ");
		idade = entrada.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("A pessoa pertence a Categorial Infantil");
			
		}
		else if(idade>=15 && idade<=17) {
			System.out.println("A pessoa pertence a Categorial Juvenil");
		
		}
		else if(idade>=18 && idade<=25) 
			System.out.println("A pessoa pertence a Categorial Adulto");	
	}
}
		
		
			
			
		



