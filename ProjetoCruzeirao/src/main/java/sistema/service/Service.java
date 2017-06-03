package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import sistema.modelos.Usuario;

public abstract class Service<T> {

    protected static EntityManagerFactory emf;
    protected EntityManager em;
    private Class<T> classeEntidade;
    
	public Service()
	{
	      emf = Persistence.createEntityManagerFactory("ProjetoCruzeirao");
	      em = emf.createEntityManager();
	}
	
	public void salvar(T entidade) {
		em.getTransaction().begin();
			em.persist(entidade);
			System.out.println("persistindo " + entidade.getClass());
		em.getTransaction().commit();
	}
	
	@SuppressWarnings("unchecked")
	public List<?> pesquisarTodos() {
		CriteriaQuery<Object> cq = em.getCriteriaBuilder().createQuery();
		cq.select(cq.from(classeEntidade));
		return em.createQuery(cq).getResultList();
	}
	
}
