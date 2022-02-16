package edu.ifma.lbd.modelo;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "parametro")
public class Parametro implements Entidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_frete")
	private Integer id;
	
	@Column(name = "calor_km_rodado")
	private float valorKmRodado;
	
	public Integer getId() {
		return id;
	}

	public float getValorKmRodado() {
		return valorKmRodado;
	}

	public void setValorKmRodado(float valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
	}
	
	@Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
