package br.org.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.blogpessoal.model.Postagem;

/**
 * 
 * /@Repository: Annotation (Anotação), que indica que a Classe é uma Repository,
 * ou seja, é responsável pela comunicação com o Banco de dados através dos métodos
 * padrão e das Method Queries, que são consultas personalizadas através de palavras
 * chave que representam as instruções da linguagem SQL
 * 
 */

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> { //JPA L maiusculo pega o primitivo long e encapsula, cria uma classe e objeto

	/**
	 * Esta method Query é equivalente a: select * from tb_postagem where titulo like "%titulo%";
	 */
	public List <Postagem> findAllByTituloContainingIgnoreCase(String titulo);
	//Select * from tb_postagens  where titulo like "%titulo%"; ignore se é maisculo e minusculo
	//Colocar tudo em letra maiuscula se não da erro
	//List mesma familia que ArrayList
	//Passando List porque pode ter mais de um post com a palavra que digitar depois da string
	
	// interface pq só assina o metodo, só diz o formato e não incrementa nada, usa na controller
}