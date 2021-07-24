package br.com.generation.lacosderepeticao;

import java.util.Scanner;

public class exercicio5 {
	
	public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int numero, armazenagem = 0;

        do {
            System.out.print("Informe um nº para a soma (quando desejar finalizar a soma digite 0): ");
            numero = reader.nextInt();
            armazenagem += numero;
        }
        while(numero != 0);

        System.out.println("A soma dos números digitados é: " + armazenagem);

        reader.close();
    }

}


