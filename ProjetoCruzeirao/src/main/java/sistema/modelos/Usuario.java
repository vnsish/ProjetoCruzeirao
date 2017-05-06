package sistema.modelos;

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
	private Integer CPF = Integer.valueOf(0);
	private List<String> Roles;
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

	public Integer getCPF() {
		return this.CPF;
	}

	public void setCPF(Integer newCPF) {
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
