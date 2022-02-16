package edu.ifma.lbd.modelo;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "dependente")
public class Dependente implements Entidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_dependente")
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "data_nascimento")
	private Date dataNascimento;
	
	@ManyToOne
	@JoinColumn(name = "funcionario")
	private Funcionario funcionario;

	@Override
	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
}
