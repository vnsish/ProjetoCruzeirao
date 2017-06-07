package sistema.beans;

import sistema.modelos.Roles;
import sistema.modelos.Usuario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.security.core.context.SecurityContextHolder;

import java.io.IOException;
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
		usuario.setRole(Roles.USR);
		service.Salvar(usuario);

		if(usuarios != null)
			usuarios.add(usuario);
		
		usuario = new Usuario();
		
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("/Cruzeirao/pages/inicio.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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