package sistema.beans;

import javax.faces.bean.ManagedBean;

import org.springframework.security.core.context.SecurityContextHolder;

import sistema.modelos.Usuario;

@ManagedBean
public class LoginBean {
	
	public Usuario usr =  (Usuario)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	
	/*public Usuario getCurrentUser() {
		
		return (Usuario)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
	}*/
	
	public String getUserName()
	{
		System.out.println(usr.getNome());
		return usr.getNome();
	}

}
