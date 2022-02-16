package edu.ifma.lbd.modelo;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "filial")
public class Filial implements Entidade{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_filial")
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "endereco")
	private String endereco;
	
	@Column(name = "telefone")
	private String telefone;
	
	@OneToMany(mappedBy = "filial", cascade = CascadeType.ALL)
	@Column(name = "funcionario")
	private Set<Funcionario> funcionario = new LinkedHashSet<>();
	
	@OneToMany(mappedBy = "filial", cascade = CascadeType.ALL)
	@Column(name = "veiculo")
	private Set<Veiculo> veiculo = new LinkedHashSet<>();
	
	public Integer getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
    public int hashCode() {
        return Objects.hash(id);
    }
	
	public void adiciona(Funcionario e) {
        funcionario.add(e);
    }
	
	public void adiciona(Veiculo e) {
        veiculo.add(e);
    }
}
