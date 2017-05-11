package sistema.modelos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
// Start of user code (user defined imports)
import javax.persistence.Table;

// End of user code


@Entity
public class Usuario
{
	private String Email = "";
	private String Nome = "";
	private String Senha = "";

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
	private List<String> Roles;
	private Date DataNascimento = null;

	public Usuario() {
		// Start of user code constructor for Usuario)
		super();
		Roles = new ArrayList<String>();
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

	public List<String> getRoles() {
		return this.Roles;
	}

	
	
	public Date getDataNascimento() {
		return this.DataNascimento;
	}

	public void setDataNascimento(Date newDataNascimento) {
		this.DataNascimento = newDataNascimento;
	}

}
