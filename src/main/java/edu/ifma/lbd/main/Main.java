package edu.ifma.lbd.main;

import javax.persistence.*;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("lab05_jpa");
		EntityManager manager = factory.createEntityManager();
		
		manager.close();
        factory.close();
	}
}
