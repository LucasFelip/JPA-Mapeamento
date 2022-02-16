package edu.ifma.lbd.modelo;

import java.util.*;
import javax.persistence.*;

@Entity
public class Cliente extends PessoaFisica implements Entidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_cliente")
	private Integer id;
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	@Column(name = "frete")
	private Set<Frete> fretes = new LinkedHashSet<>();
	
	public Integer getId() {
		return id;
	}
	
	@Override
    public int hashCode() {
        return Objects.hash(id);
    }
	
	public void adiciona(Frete e) {
        fretes.add(e);
    }
}
