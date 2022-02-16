package edu.ifma.lbd.modelo;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "cidade")
public class Cidade implements Entidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_frete")
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn(name = "distancia_origem")
	private Distancia distanciaOrigem;
	
	@ManyToOne
	@JoinColumn(name = "distancia_destino")
	private Distancia distanciaDestino;
	
	@OneToMany(mappedBy = "cidade", cascade = CascadeType.ALL)
	@Column(name = "cidade_destino")
	private Set<Frete> cidade_destino = new LinkedHashSet<>();
	
	@OneToMany(mappedBy = "cidade", cascade = CascadeType.ALL)
	@Column(name = "cidade_origem")
	private Set<Frete> cidade_origem = new LinkedHashSet<>();
	
	public Integer getId() {
		return id;
	}
	
	@Override
    public int hashCode() {
        return Objects.hash(id);
    }
	
	public void adicionaOrigem(Frete e) {
		cidade_origem.add(e);
    }
	
	public void adicionaDestino(Frete e) {
		cidade_destino.add(e);
    }
	
	
}
