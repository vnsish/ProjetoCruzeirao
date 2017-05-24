package sistema.modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
// Start of user code (user defined imports)
import javax.persistence.Table;

// End of user code


@NamedQuery (name = "Usuario.procurarPorCPF", query = "select u from Usuario u where u.CPF = :CPF")
@Entity
public class Usuario implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5700336660670490930L;
	
	private String Email = "";
	private String Nome = "";
	private String Senha = "";

	public static final String PesquisarPorCPF = "Usuario.procurarPorCPF";
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}
	
	@Id
	private String CPF = "";
	private Roles Role;
	private Date DataNascimento = null;

	public Usuario() {
		// Start of user code constructor for Usuario)
		super();
		// End of user code
	}

	public String getEmail() {
		return this.Email;
	}

	public void setEmail(String newEmail) {
		this.Email = newEmail;
	}

	public String getCPF() {
		return this.CPF;
	}

	public void setCPF(String newCPF) {
		this.CPF = newCPF;
	}

	public Roles getRole() {
		return this.Role;
	}

	public void setRole(Roles Role)
	{
		this.Role = Role;
	}
	
	
	public Date getDataNascimento() {
		return this.DataNascimento;
	}

	public void setDataNascimento(Date newDataNascimento) {
		this.DataNascimento = newDataNascimento;
	}

}
