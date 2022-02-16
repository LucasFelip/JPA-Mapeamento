package edu.ifma.lbd.modelo;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "veiculo")
public class Veiculo implements Entidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_veiculo")
	private Integer id;
	
	@Column(name = "numero_placa")
	private String numeroPlaca;
	
	@ManyToOne
	@Column(name = "filial")
	private Filial filial;
	
	@ManyToOne
	@Column(name = "tipo_veiculo")
	private TipoVeiculo tipoVeiculo;
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	@Column(name = "frete")
	private Set<Frete> fretes = new LinkedHashSet<>();
	
	public Integer getId() {
		return id;
	}
	
	public String getNumeroPlaca() {
		return numeroPlaca;
	}

	public void setNumeroPlaca(String numeroPlaca) {
		this.numeroPlaca = numeroPlaca;
	}

	public Filial getFilial() {
		return filial;
	}

	public void setFilial(Filial filial) {
		this.filial = filial;
	}

	public TipoVeiculo getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	@Override
    public int hashCode() {
        return Objects.hash(id);
    }
	
	public void adiciona(Frete e) {
        fretes.add(e);
    }
}
