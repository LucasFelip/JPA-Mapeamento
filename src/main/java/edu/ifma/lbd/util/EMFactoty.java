package edu.ifma.lbd.util;

import javax.persistence.*;

public class EMFactoty {
	private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("lab_jpa");

	public EntityManager getEntityManager() {
		return factory.createEntityManager();
	}

	public void close() {
		factory.close();
	}
}
