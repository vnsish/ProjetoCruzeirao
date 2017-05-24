package sistema.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class Service<T> {

    protected static EntityManagerFactory emf;
    protected EntityManager em;
    private Class<T> classeEntidade;
    
	public Service()
	{
	      emf = Persistence.createEntityManagerFactory("ProjetoCruzeirao");
	      em = emf.createEntityManager();
	}
	
}
