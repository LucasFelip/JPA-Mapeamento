package edu.ifma.lbd.modelo;

import javax.persistence.*;

@Entity
@Table(name = "item_frete")
public class ItemFrete implements Entidade{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_frete")
	private Integer id;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "peso")
	private float peso;
	
	@ManyToOne
	@Column(name = "frete")
	private Frete frete;
	
	public Integer getId() {
		return id;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public Frete getFrete() {
		return frete;
	}

	public void setFrete(Frete frete) {
		this.frete = frete;
	}
}
