package sistema.dao;

import java.util.List;

import sistema.modelos.Time;

public class TimeDAO extends GenericDAO<Time, Integer> {

	public List<Time> getByDiretor(String cpf)
	{
		getEntityManager().getTransaction().begin();
			List<Time> list = em.createQuery("select t from Time t where t.Diretor.CPF = :cpf").setParameter("cpf", cpf).getResultList();
		getEntityManager().getTransaction().commit();
		
		return list;
	}
	
}
