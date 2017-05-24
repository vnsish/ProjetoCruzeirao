package sistema.service;

import sistema.modelos.Usuario;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

public class UsuarioService extends Service<Usuario> {
	
	
	
	public void Salvar(Usuario u)
	{
		em = emf.createEntityManager();
		em.getTransaction().begin();
			em.persist(u);
			System.out.println("p");
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
	
	
	public Usuario getByCPF(String cpf)
	{
		Usuario resultado = null;
		
		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("CPF", cpf);
		
		System.out.println(cpf);
		System.out.println(parametros.toString());
		
				Query query = em.createNamedQuery(Usuario.PesquisarPorCPF);
				if (parametros != null && !parametros.isEmpty()) {
					for(Map.Entry<String, Object> parametro : parametros.entrySet())
					{
						query.setParameter(parametro.getKey(), parametro.getValue());
					}
				}
				
				resultado = (Usuario) query.setMaxResults(1).getSingleResult();
			
		return resultado;
		
	}
	

}
