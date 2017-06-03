package sistema.service;

import java.util.List;

import sistema.dao.TimeDAO;
import sistema.modelos.Time;

public class TimeService extends Service<Time>{
	
TimeDAO dao = new TimeDAO();
	
	public Time Salvar(Time u){
		
		u = dao.Save(u);
		dao.closeEntityManager();
		return u;
		
	}
	
	public void Alterar(Time u)
	{
		dao.Save(u);
		dao.closeEntityManager();
	}
	
	public void Remover(Time u)
	{
		u = dao.getById(Time.class, u.getID());
		dao.Remove(u);
		dao.closeEntityManager();
		
	}
	
	public Time getTime(int id)
	{
		return dao.getById(Time.class, id);
	}

	public List<Time> getTimes()
	{
		List<Time> lista = dao.getAll(Time.class);
		
		return lista;
	}
	
	

}
