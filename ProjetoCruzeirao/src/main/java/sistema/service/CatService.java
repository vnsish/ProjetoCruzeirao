package sistema.service;

import java.util.List;

import sistema.dao.CatDAO;
import sistema.modelos.Categoria;

public class CatService extends Service<Categoria>{
	
CatDAO dao = new CatDAO();
	
	public Categoria Salvar(Categoria u){
		
		u = dao.Save(u);
		dao.closeEntityManager();
		return u;
		
	}
	
	public void Alterar(Categoria u)
	{
		dao.Save(u);
		dao.closeEntityManager();
	}
	
	public void Remover(Categoria u)
	{
		u = dao.getById(Categoria.class, u.getID());
		dao.Remove(u);
		dao.closeEntityManager();
		
	}
	
	public Categoria getCategoria(int id)
	{
		return dao.getById(Categoria.class, id);
	}

	public List<Categoria> getCategorias()
	{
		List<Categoria> lista = dao.getAll(Categoria.class);
		
		return lista;
	}
	
	

}
