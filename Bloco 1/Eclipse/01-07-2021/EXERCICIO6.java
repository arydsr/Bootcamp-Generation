package generationatividades;

import java.util.Scanner;

public class EXERCICIO6 {
	
	public static void main(String[] args) {
	
	double x1, x2, y1, y2, p1, p2, d;
	
	Scanner ler = new Scanner(System.in);

	System.out.println("Digite o valor de X do Primeiro PONTO: ");
	x1 = ler.nextDouble();

	System.out.println("Digite o valor de Y do Primeiro PONTO: ");
	y1 = ler.nextDouble();
	
	System.out.println("Digite o valor de X do Segundo PONTO: ");
	x2 = ler.nextDouble();

	System.out.println("Digite o valor de Y do Segundo PONTO: ");
	y2 = ler.nextDouble();

	p1 = Math.pow((x2-x1),2); // p1 = (x2-x1) * (x2-x1)
	p2 = Math.pow((y2-y1),2);
	
	d = Math.sqrt(p1 + p2);

	System.out.println("A distancia de P1 para P2 é: " + d);

	}
}
