package edu.ifma.lbd.modelo;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "tipo_veiculo")
public class TipoVeiculo implements Entidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_tipoVeiculo")
	private Integer id;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "peso_maximo")
	private float pesoMaximo;
	
	@OneToMany(mappedBy = "tipo_veiculo", cascade = CascadeType.ALL)
	@Column(name = "veiculo")
	private Set<Veiculo> veiculo = new LinkedHashSet<>();
	
	public Integer getId() {
		return id;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(float pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	@Override
    public int hashCode() {
        return Objects.hash(id);
    }
	
	public void adiciona(Veiculo e) {
        veiculo.add(e);
    }
	
}
