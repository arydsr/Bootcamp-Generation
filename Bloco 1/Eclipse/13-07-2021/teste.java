package br.com.generation.collection2;

import java.util.ArrayList;
import java.util.Scanner;

public class teste {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			ArrayList<Estoque> estoque = new ArrayList<>();

			System.out.print("Quantos itens você deseja acrescentar no estoque: ");
			int numeroEstoque = sc.nextInt();

			for (int i = 0; i < numeroEstoque; i++) {
				System.out.print("Descrição do Item: ");
				String descricao = sc.next();

				System.out.print("SKU do Item:");
				String sku = sc.next();

				System.out.print("Quantidade: ");
				int quantidade = sc.nextInt();

				System.out.print("Valor unidatario: ");
				double valorUni = sc.nextDouble();

				estoque.add(new Estoque(sku, descricao, quantidade, valorUni));
			}
			System.out.println("");
			for (int c= 0; c < estoque.size(); c++) {
				System.out.print("Linha - " + c);
				System.out.println(estoque.get(c));
			}
			System.out.println("Para remover algum intem digite o numero da linha do mesmo ou digite -1 para encerar ");
			int remov = sc.nextInt();

			if (remov != -1) {
				estoque.remove(remov);
				System.out.println("");
				for (Estoque i : estoque) {
					System.out.println(i);
				}
			} else {
				System.out.println("Programa encerrado"); 
			}
			sc.close();
		}

	}
