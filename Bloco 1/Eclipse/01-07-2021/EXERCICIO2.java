package generationatividades;

import java.util.Scanner;

public class EXERCICIO2 {

	public static void main(String[] args) {

		int idadeAnos, idadeMeses, idadeDias1, idadeDias;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digita os dias: ");
		idadeDias = ler.nextInt();

		idadeAnos = (idadeDias / 365);
		idadeMeses = (idadeDias % 365) / 30;
		idadeDias1 = (idadeDias % 365) % 30;

		System.out.println("A idade é de " + idadeAnos + " anos, " + idadeMeses + " meses e " + idadeDias1 + " dias ");

	}
}