package edu.ifma.lbd.modelo;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "funcionario")
public class Funcionario extends PessoaFisica implements Entidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_funcionario")
	private Integer id;
	
	@Column(name = "matricula")
	private String matricula;
	
	@ManyToOne
	@Column(name = "filial")
	private Filial filial;
	
	@OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL)
	@Column(name = "dependente")
	private Set<Dependente> dependente = new LinkedHashSet<>();
	
	public Integer getId() {
		return id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public Filial getFilial() {
		return filial;
	}

	public void setFilial(Filial filial) {
		this.filial = filial;
	}

	public void adiciona(Dependente e) {
        dependente.add(e);
    }
}
