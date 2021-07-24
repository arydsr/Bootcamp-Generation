package aula2;

import java.util.Scanner;

public class ordemnumero {
	
public static void main(String[] args) {
		
		int a = 0, b = 0, c = 0 , maior = 0, menor = 0, domeio = 0;
		
		Scanner entrada = new Scanner(System.in);
	
		
		System.out.println("Digite o 1º número: ");
		a = entrada.nextInt();
		
		System.out.println("Digite o 2º número: ");
		b = entrada.nextInt();
		
		System.out.println("Digite o 3º número: ");
		c = entrada.nextInt();

	    if(a >= b && a >= c)
	        maior = a;

	    else if(b >= a && b >= c)
	        maior = b;

	    else if(c >= a && c >= b)
	        maior = c;
	    
	    if(a <= b && a <= c)
	        menor = a;

	    else if(b <= a && b <= c)
	        menor = b;

	    else if(c >= a && c >= b)
	        menor = c;
	    
	    if(a > b && a < c)
	        domeio = domeio + a;

	    else if(b > a && b < c)
	        domeio = domeio + b;

	    else if(c > a && c < b)
	        domeio = c;
	  
	    
	    System.out.println("A ordem crescente dos números inseridos é de " + menor + " " + domeio + " " + maior);
	    
	
	
	    
}

}
