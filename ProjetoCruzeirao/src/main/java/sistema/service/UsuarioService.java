package sistema.service;

import java.util.List;

import sistema.dao.UsuarioDAO;
import sistema.modelos.Usuario;

public class UsuarioService {
	
	UsuarioDAO dao = new UsuarioDAO();
	
	public Usuario Salvar(Usuario u){
		
		u = dao.Save(u);
		dao.closeEntityManager();
		return u;
		
	}
	
	public void Alterar(Usuario u)
	{
		dao.Save(u);
		dao.closeEntityManager();
	}
	
	public void Remover(Usuario u)
	{
		u = dao.getById(Usuario.class, u.getCPF());
		dao.Remove(u);
		dao.closeEntityManager();
		
	}
	
	public Usuario getUsuario(String id)
	{
		return dao.getById(Usuario.class, id);
	}

	public List<Usuario> getUsuarios()
	{
		List<Usuario> lista = dao.getAll(Usuario.class);
		
		return lista;
	}
}
