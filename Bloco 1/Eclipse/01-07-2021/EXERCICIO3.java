package generationatividades;

import java.util.Scanner;

public class EXERCICIO3 {

	public static void main(String[] args) {

		int segundos, minutos, horas, horasresto;

		Scanner ler = new Scanner(System.in);

		System.out.println("Insira o tempo total, em segundos, do evento: ");
		segundos = ler.nextInt();

		horas = segundos / 3600;
		horasresto = segundos % 3600;
		minutos = horasresto / 60;
		segundos = horasresto % 60;

		System.out.println("O evento durou " + horas + " horas " + minutos + " minutos " + segundos + " segundos");
	}

}
