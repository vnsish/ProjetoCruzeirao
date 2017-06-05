package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.dao.InscricaoDAO;
import sistema.modelos.Inscricao;
import sistema.modelos.InscricaoJogador;
import sistema.modelos.Usuario;

public class InscricaoService {
InscricaoDAO dao = new InscricaoDAO();
	
	public Inscricao Salvar(Inscricao u){
		
		u = dao.Save(u);
		dao.closeEntityManager();
		return u;
		
	}
	
	public void Alterar(Inscricao u)
	{
		dao.Save(u);
		dao.closeEntityManager();
	}
	
	public void Remover(Inscricao u)
	{
		u = dao.getById(Inscricao.class, u.getID());
		dao.Remove(u);
		dao.closeEntityManager();
		
	}
	
	public Inscricao getInscricao(int id)
	{
		return dao.getById(Inscricao.class, id);
	}

	public List<Inscricao> getInscricoes()
	{
		List<Inscricao> lista = dao.getAll(Inscricao.class);
		
		return lista;
	}
	
	public List<Usuario> getInscritos(Inscricao u)
	{
		List<Usuario> list = new ArrayList<Usuario>();
		for (InscricaoJogador i : u.getJogadores())
		{
			if(i.isConfirmado())
				list.add(i.getUsuario());
		}
		return list;
	}
	
	
}
