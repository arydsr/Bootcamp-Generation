package br.org.generation.lojagames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@NotNull(message = "O atributo tipo não pode ser nulo!")
	private String tipo;
	
	@OneToMany(mappedBy = "tb_categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("tb_categoria")
	
	private List<Produto> tb_produtos;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Produto> getTb_produtos() {
		return tb_produtos;
	}

	public void setTb_produtos(List<Produto> tb_produtos) {
		this.tb_produtos = tb_produtos;
	}
	
}