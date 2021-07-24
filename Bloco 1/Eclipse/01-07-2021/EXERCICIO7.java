package generationatividades;

import java.util.Scanner;

public class EXERCICIO7 {
	
	public static void main(String[] args) {
	
		double a , b , c , d , e , f, x , y;
		
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o valor de a: ");
		a = ler.nextDouble();

		System.out.println("Digite o valor de b: ");
		b = ler.nextDouble();

		System.out.println("Digite o valor de c: ");
		c = ler.nextDouble();
		
		System.out.println("Digite o valor de d: ");
		d = ler.nextDouble();

		System.out.println("Digite o valor de ee: ");
		e = ler.nextDouble();

		System.out.println("Digite o valor de f: ");
		f = ler.nextDouble();

		x = ((c*e)-(b*f)) / ((a*e)-(b*d));
		
		y = ((a*f)-(c*d)) / ((a*e)-(b*d));

		System.out.println("Os valores são x= " + x + " e o de y= " + y);

	}
}
