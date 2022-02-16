package edu.ifma.lbd.modelo;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "distancia")
public class Distancia implements Entidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_cliente")
	private Integer id;
	
	@Column(name = "quilometros")
	private String quilometros;
	
	public Integer getId() {
		return id;
	}
	
	@Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
