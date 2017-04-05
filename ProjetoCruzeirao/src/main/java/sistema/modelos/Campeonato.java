package sistema.modelos;
import java.util.Date;
import java.util.HashSet;

/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Campeonato.
 * 
 * @author v
 */
public class Campeonato {
	/**
	 * Description of the property CadastroTermino.
	 */
	private Date CadastroTermino = null;

	/**
	 * Description of the property Categorias.
	 */
	public HashSet<Categoria> Categorias = new HashSet<Categoria>();

	/**
	 * Description of the property CadastroInicio.
	 */
	private Date CadastroInicio = null;

	/**
	 * Description of the property DataTermino.
	 */
	private Date DataTermino = null;

	/**
	 * Description of the property ID.
	 */
	private Integer ID = Integer.valueOf(0);

	/**
	 * Description of the property Ano.
	 */
	private Date Ano = null;

	/**
	 * Description of the property DataInicio.
	 */
	private Date DataInicio = null;

	// Start of user code (user defined attributes for Campeonato)

	// End of user code

	/**
	 * The constructor.
	 */
	public Campeonato() {
		// Start of user code constructor for Campeonato)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Campeonato)

	// End of user code
	/**
	 * Returns CadastroTermino.
	 * @return CadastroTermino 
	 */
	public Date getCadastroTermino() {
		return this.CadastroTermino;
	}

	/**
	 * Sets a value to attribute CadastroTermino. 
	 * @param newCadastroTermino 
	 */
	public void setCadastroTermino(Date newCadastroTermino) {
		this.CadastroTermino = newCadastroTermino;
	}

	/**
	 * Returns Categorias.
	 * @return Categorias 
	 */
	public HashSet<Categoria> getCategorias() {
		return this.Categorias;
	}

	/**
	 * Returns CadastroInicio.
	 * @return CadastroInicio 
	 */
	public Date getCadastroInicio() {
		return this.CadastroInicio;
	}

	/**
	 * Sets a value to attribute CadastroInicio. 
	 * @param newCadastroInicio 
	 */
	public void setCadastroInicio(Date newCadastroInicio) {
		this.CadastroInicio = newCadastroInicio;
	}

	/**
	 * Returns DataTermino.
	 * @return DataTermino 
	 */
	public Date getDataTermino() {
		return this.DataTermino;
	}

	/**
	 * Sets a value to attribute DataTermino. 
	 * @param newDataTermino 
	 */
	public void setDataTermino(Date newDataTermino) {
		this.DataTermino = newDataTermino;
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
	 * Returns Ano.
	 * @return Ano 
	 */
	public Date getAno() {
		return this.Ano;
	}

	/**
	 * Sets a value to attribute Ano. 
	 * @param newAno 
	 */
	public void setAno(Date newAno) {
		this.Ano = newAno;
	}

	/**
	 * Returns DataInicio.
	 * @return DataInicio 
	 */
	public Date getDataInicio() {
		return this.DataInicio;
	}

	/**
	 * Sets a value to attribute DataInicio. 
	 * @param newDataInicio 
	 */
	public void setDataInicio(Date newDataInicio) {
		this.DataInicio = newDataInicio;
	}

}
