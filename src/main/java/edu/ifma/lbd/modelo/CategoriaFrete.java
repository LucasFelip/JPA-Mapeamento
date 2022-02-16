package edu.ifma.lbd.modelo;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "categoria_frete")
public class CategoriaFrete implements Entidade{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_categoria_frete")
	private Integer id;
	
	@Column(name = "desconto")
	private float desconto;
	
	@Column(name = "percentual")
	private float percentual;
	
	@OneToMany(mappedBy = "categoria_frete", cascade = CascadeType.ALL)
	@Column(name = "frete")
	private Set<Frete> frete = new LinkedHashSet<>();
	
	public Integer getId() {
		return id;
	}
	
	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}

	public float getPercentual() {
		return percentual;
	}

	public void setPercentual(float percentual) {
		this.percentual = percentual;
	}

	@Override
    public int hashCode() {
        return Objects.hash(id);
    }
	
	public void adiciona(Frete e) {
		frete.add(e);
    }
}
