package sistema.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

public abstract class GenericDAO <T, I extends Serializable> {

	private static EntityManagerFactory emf;
	private EntityManager em;
	
	public GenericDAO(){
		
		emf = Persistence.createEntityManagerFactory("ProjetoCruzeirao");
		
	}
	
	public T Save(T entity)
	{
		T new_ = null;
		getEntityManager().getTransaction().begin();
		new_ = getEntityManager().merge(entity);
		getEntityManager().getTransaction().commit();
		
		return new_;
		
	}
	
	public void Remove(T entity)
	{
		getEntityManager().getTransaction().begin();
		getEntityManager().remove(entity);
		getEntityManager().getTransaction().commit();
	}
	
	public T getById(Class<T> classe, I pk) {

		try {
			T t = getEntityManager().find(classe, pk);
			getEntityManager().refresh(t);
			return t;
		} catch (NoResultException e) {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<T> getAll(Class<T> classe) {

		return getEntityManager().createQuery("select o from " + classe.getSimpleName() + " o").getResultList();
	}
	
	private EntityManager getEntityManager() {
		if(em == null)
			em = emf.createEntityManager();
		return em;
	}
		
	public void closeEntityManager(){
			
			if(em != null)
				em.close();
			em = null;
		}
	
}
