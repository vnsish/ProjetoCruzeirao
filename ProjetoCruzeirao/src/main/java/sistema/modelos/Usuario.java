package sistema.modelos;

import java.util.Date;
import java.util.List;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Usuario.
 * 
 * @author v
 */
public class Usuario
{
	/**
	 * Description of the property Email.
	 */
	private String Email = "";


	/**
	 * Description of the property CPF.
	 */
	private Integer CPF = Integer.valueOf(0);

	/**
	 * Description of the property Roles.
	 */
	private List<String> Roles;

	/**
	 * Description of the property DataNascimento.
	 */
	private Date DataNascimento = null;

	// Start of user code (user defined attributes for Usuario)

	// End of user code

	/**
	 * The constructor.
	 */
	public Usuario() {
		// Start of user code constructor for Usuario)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Usuario)

	// End of user code
	/**
	 * Returns Email.
	 * @return Email 
	 */
	public String getEmail() {
		return this.Email;
	}

	/**
	 * Sets a value to attribute Email. 
	 * @param newEmail 
	 */
	public void setEmail(String newEmail) {
		this.Email = newEmail;
	}

	/**
	 * Returns CPF.
	 * @return CPF 
	 */
	public Integer getCPF() {
		return this.CPF;
	}

	/**
	 * Sets a value to attribute CPF. 
	 * @param newCPF 
	 */
	public void setCPF(Integer newCPF) {
		this.CPF = newCPF;
	}

	/**
	 * Returns Roles.
	 * @return Roles 
	 */
	public List<String> getRoles() {
		return this.Roles;
	}

	/**
	 * Returns DataNascimento.
	 * @return DataNascimento 
	 */
	public Date getDataNascimento() {
		return this.DataNascimento;
	}

	/**
	 * Sets a value to attribute DataNascimento. 
	 * @param newDataNascimento 
	 */
	public void setDataNascimento(Date newDataNascimento) {
		this.DataNascimento = newDataNascimento;
	}

}
