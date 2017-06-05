package sistema.beans;

import javax.faces.bean.ManagedBean;

import org.springframework.security.core.context.SecurityContextHolder;

import sistema.modelos.Usuario;
import sistema.service.UsuarioService;

@ManagedBean
public class LoginBean {
	
	UsuarioService service = new UsuarioService();
	
	public String str = (String)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	
	/*public Usuario getCurrentUser() {
		
		return (Usuario)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
	}*/
	
	public String getUserName()
	{
		Usuario usr = service.getUsuario(str);
		
		return usr.getNome();
	}

}
