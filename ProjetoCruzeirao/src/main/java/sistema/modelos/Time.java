package sistema.modelos;
import java.util.HashSet;

/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Time.
 * 
 * @author v
 */
public class Time {
	/**
	 * Description of the property Nome.
	 */
	private String Nome = "";

	/**
	 * Description of the property ID.
	 */
	private Integer ID = Integer.valueOf(0);

	/**
	 * Description of the property Inscricoes.
	 */
	public HashSet<Inscricao> Inscricoes = new HashSet<Inscricao>();
	
	// Start of user code (user defined attributes for Time)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public Time() {
		// Start of user code constructor for Time)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Time)

	// End of user code
	/**
	 * Returns Nome.
	 * @return Nome 
	 */
	public String getNome() {
		return this.Nome;
	}

	/**
	 * Sets a value to attribute Nome. 
	 * @param newNome 
	 */
	public void setNome(String newNome) {
		this.Nome = newNome;
	}

	/**
	 * Returns ID.
	 * @return ID 
	 */
	public Integer getID() {
		return this.ID;
	}

	/**
	 * Sets a value to attribute ID. 
	 * @param newID 
	 */
	public void setID(Integer newID) {
		this.ID = newID;
	}

	/**
	 * Returns Inscricoes.
	 * @return Inscricoes 
	 */
	public HashSet<Inscricao> getInscricoes() {
		return this.Inscricoes;
	}

}
