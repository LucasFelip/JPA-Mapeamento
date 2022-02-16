package edu.ifma.lbd.modelo;

import java.util.*;

import javax.persistence.*;

@Entity
public class Funcionario extends PessoaFisica implements Entidade {
	
	@Column(name = "matricula")
	private String matricula;
	
	@ManyToOne
	@JoinColumn(name = "filial")
	private Filial filial;
	
	@OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL)
	@Column(name = "dependente")
	private Set<Dependente> dependente = new LinkedHashSet<>();

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void adiciona(Dependente e) {
        dependente.add(e);
    }
}
