package sistema.beans;

import javax.faces.bean.ManagedBean;

import sistema.modelos.Roles;
import sistema.modelos.Usuario;
import sistema.service.UsuarioService;

@ManagedBean
public class RoleBean {
	
	private Usuario u;
	private String cpf;
	private Roles role;
	private UsuarioService service = new UsuarioService();
	
	public Roles[] getRoles()
	{
		return Roles.values();
	}
	
	public void alteraPermissao(){
		
		u = service.getByCPF(cpf);
		u.setRole(role);
		service.atualizar(u);
		
	}

}
