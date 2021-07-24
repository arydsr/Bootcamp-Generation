package generationatividades;

import java.util.Scanner;

public class EXERCICIO4 {

	public static void main(String[] args) {
		
		double A , B , C , D;
		double R , S;
		
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o valor de A:");
		A  = ler.nextDouble();

		System.out.println("Digite o valor de B:");
		B  = ler.nextDouble();

		System.out.println("Digite o valor de C:");
		C  = ler.nextDouble();

		//D = R + S / 2
		//R = (A+B)²
		//S = (B+C)²

		R = Math.pow((A+B),2);
		S = Math.pow((B+C),2);
		D = R + S / 2;

				System.out.println("O resultado da expressão é de " + D);
		
	}

}
