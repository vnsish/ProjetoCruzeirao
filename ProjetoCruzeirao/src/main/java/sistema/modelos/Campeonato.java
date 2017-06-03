package sistema.modelos;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
@Entity
public class Campeonato {
	
	public Campeonato()
	{
		Categorias = new ArrayList<Categoria>();
	}
	/**
	 * Description of the property CadastroTermino.
	 */
	private Date CadastroTermino = null;

	/**
	 * Description of the property Categorias.
	 */
	@OneToMany(mappedBy="Campeonato")
	public List<Categoria> Categorias;

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
	@Id
	@GeneratedValue
	private Integer ID = Integer.valueOf(0);

	/**
	 * Description of the property Ano.
	 */
	private Date Ano = null;

	/**
	 * Description of the property DataInicio.
	 */
	private Date DataInicio = null;


	// Start of user code (user defined methods for Campeonato)

	// End of user code
	/**
	 * Returns CadastroTermino.
	 * @return CadastroTermino 
	 */
	public Date getCadastroTermino() {
		return this.CadastroTermino;
	}
	
	private String Nome;
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
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
	public List<Categoria> getCategorias() {
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
