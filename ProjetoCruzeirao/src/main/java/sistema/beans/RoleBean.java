package sistema.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Roles;
import sistema.modelos.Usuario;
import sistema.service.UsuarioService;

@ManagedBean
@SessionScoped
public class RoleBean {
	
	private Usuario u;
	private String cpf;
	private Roles role;
	private UsuarioService service = new UsuarioService();
	public List<String> lista = new ArrayList<String>();
	
	public RoleBean()
	{
		lista.add("teste1");
		lista.add("teste2");
		lista.add("teste3");
		
		System.out.println(getRoles());
	}
	
	public Roles[] getRoles()
	{
		return Roles.values();
	}
	
	
	public void alteraPermissao(){
		
		u = service.getUsuario(cpf);
		u.setRole(role);
		service.Alterar(u);
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Roles getRole() {
		return role;
	}

	public void setRole(Roles role) {
		this.role = role;
	}

}
