package sistema.beans;

import sistema.modelos.Usuario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;
import sistema.service.UsuarioService;

@ManagedBean
@SessionScoped
public class UsuarioManagedBean {

	private Usuario usuario = new Usuario();
	private List<Usuario> usuarios;
	private UsuarioService service = new UsuarioService();
	
	public void Salvar()
	{
		usuario.getRoles().add("user");
		service.Salvar(usuario);
		
		if(usuarios != null)
			usuarios.add(usuario);
		
		usuario = new Usuario();
	}
	
	


	public Usuario getUsuario() {
		return usuario;
	}




	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}




	public List<Usuario> getUsuarios()
	{
		if(usuarios == null)
			usuarios = service.getUsuarios();
		return usuarios;
	}
	
	

}