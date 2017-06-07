package sistema.service;

import java.util.List;

import sistema.dao.LocalDAO;
import sistema.modelos.Local;

public class LocalService {
LocalDAO dao = new LocalDAO();
	
	public Local Salvar(Local u){
		
		u = dao.Save(u);
		dao.closeEntityManager();
		return u;
		
	}
	
	public void Alterar(Local u)
	{
		dao.Save(u);
		dao.closeEntityManager();
	}
	
	public void Remover(Local u)
	{
		u = dao.getById(Local.class, u.getID());
		dao.Remove(u);
		dao.closeEntityManager();
		
	}
	
	public Local getLocal(int id)
	{
		return dao.getById(Local.class, id);
	}

	public List<Local> getLocais()
	{
		List<Local> lista = dao.getAll(Local.class);
		
		return lista;
	}

	
	
}
