package sistema.service;

import sistema.modelos.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class UsuarioService extends Service {
	
	public void Salvar(Usuario u)
	{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
			em.persist(u);
		em.getTransaction().commit();
		em.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Usuario> getUsuarios()
	{
		List<Usuario> usuarios;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From Usuario a");
		usuarios = q.getResultList();
		
		em.close();
		
		return usuarios;
	}
	

}
