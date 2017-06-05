package sistema.service;

import java.util.List;

import sistema.dao.CampDAO;
import sistema.modelos.Campeonato;

public class CampService{
	
CampDAO dao = new CampDAO();
	
	public Campeonato Salvar(Campeonato u){
		
		u = dao.Save(u);
		dao.closeEntityManager();
		return u;
		
	}
	
	public void Alterar(Campeonato u)
	{
		dao.Save(u);
		dao.closeEntityManager();
	}
	
	public void Remover(Campeonato u)
	{
		u = dao.getById(Campeonato.class, u.getID());
		dao.Remove(u);
		dao.closeEntityManager();
		
	}
	
	public Campeonato getCampeonato(int id)
	{
		return dao.getById(Campeonato.class, id);
	}

	public List<Campeonato> getCampeonatos()
	{
		List<Campeonato> lista = dao.getAll(Campeonato.class);
		
		return lista;
	}
	
	

}
