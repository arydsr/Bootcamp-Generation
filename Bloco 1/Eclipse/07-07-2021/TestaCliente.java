package br.com.generation.classeobjeto;

public class TestaCliente {

	public static void main(String[] args) {
		
		//Instancia
		
		Cliente cliente = new Cliente();
		
		//Métodos e Objetos
		
		cliente.nome = "Guilherme Balieiro";
		cliente.idade = 31;
		cliente.estadoCivil = "Casado";
		cliente.email = "guilherme.balieiro@generation.com";
		cliente.telefone = "11 98650-4356";
		cliente.endereço = "Avenida Paula Ferreira, 45";
		
		System.out.println("Nome do Cliente: " + cliente.nome);
		System.out.println("Sua Idade: " + cliente.idade);
		System.out.println("Estado Civil: " + cliente.estadoCivil);
		System.out.println("Email: " + cliente.email);
		System.out.println("Seu telefone: " + cliente.telefone);	
		System.out.println("Seu endereço: " + cliente.endereço);
		
		System.out.println("\nParabéns, cadastro realiado com sucesso!!");
	}

}
