package edu.ifma.lbd.modelo;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "frete")
public class Frete implements Entidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_frete")
	private Integer id;
	
	@Column(name = "valor")
	private float valor;
	
	@Column(name = "numero_nota_fiscal")
	private float numeroNotaFiscal;
	
	@Column(name = "parametro")
	private Parametro parametro;
	
	@ManyToOne
	@JoinColumn(name = "veiculo")
	private Veiculo veiculo;
	
	@ManyToOne
	@JoinColumn(name = "cliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "categoria_frete")
	private CategoriaFrete categoriaFrete;
	
	@ManyToOne
	@JoinColumn(name = "cidade_origem")
	private Cidade cidade_origem;
	
	@ManyToOne
	@JoinColumn(name = "cidade_destino")
	private Cidade cidade_destino;
	
	@OneToMany(mappedBy = "frete", cascade = CascadeType.ALL)
	@Column(name = "item_frete")
	private Set<ItemFrete> itemFrete = new LinkedHashSet<>();
	
	public Integer getId() {
		return id;
	}
	
	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float getNumeroNotaFiscal() {
		return numeroNotaFiscal;
	}

	public void setNumeroNotaFiscal(float numeroNotaFiscal) {
		this.numeroNotaFiscal = numeroNotaFiscal;
	}

	public Parametro getParametro() {
		return parametro;
	}

	public void setParametro(Parametro parametro) {
		this.parametro = parametro;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public CategoriaFrete getCategoriaFrete() {
		return categoriaFrete;
	}

	public void setCategoriaFrete(CategoriaFrete categoriaFrete) {
		this.categoriaFrete = categoriaFrete;
	}

	public Cidade getCidadeOrigem() {
		return cidadeOrigem;
	}

	public void setCidadeOrigem(Cidade cidadeOrigem) {
		this.cidadeOrigem = cidadeOrigem;
	}

	public Cidade getCidadeDestino() {
		return cidadeDestino;
	}

	public void setCidadeDestino(Cidade cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}

	@Override
    public int hashCode() {
        return Objects.hash(id);
    }
	
	public void adiciona(ItemFrete e) {
		itemFrete.add(e);
    }
}
