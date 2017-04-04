package sistema.modelos;
/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

import java.util.HashSet;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Categoria.
 * 
 * @author v
 */
public class Categoria {
	/**
	 * Description of the property IdadeMinima.
	 */
	private Integer IdadeMinima = Integer.valueOf(0);

	/**
	 * Description of the property Inscricoes.
	 */
	private HashSet<Inscricao>Inscricoes=new HashSet<Inscricao>();

	/**
	/**
	 * Description of the property partidas.
	 */
	public HashSet<Partida> partidas = new HashSet<Partida>();

	/**
	 * Description of the property Genero.
	 */
	private char Genero;

	/**
	 * Description of the property Campeonato.
	 */
	public Campeonato Campeonato = null;

	/**
	 * Description of the property Partidas.
	 */
	private HashSet<Partida> Partidas = new HashSet<Partida>();

	/**
	 * Description of the property ID.
	 */
	private Integer ID = Integer.valueOf(0);

	/**
	 * Description of the property EnableInscr.
	 */
	private Boolean EnableInscr = Boolean.FALSE;

	// Start of user code (user defined attributes for Categoria)

	// End of user code

	/**
	 * The constructor.
	 */
	public Categoria() {
		// Start of user code constructor for Categoria)
		super();
		// End of user code
	}

	/**
	 * Description of the method AddInscricao.
	 * @param ins 
	 */
	public void AddInscricao(Inscricao ins) {
		// Start of user code for method AddInscricao
		// End of user code
	}

	// Start of user code (user defined methods for Categoria)

	// End of user code
	/**
	 * Returns IdadeMinima.
	 * @return IdadeMinima 
	 */
	public Integer getIdadeMinima() {
		return this.IdadeMinima;
	}

	/**
	 * Sets a value to attribute IdadeMinima. 
	 * @param newIdadeMinima 
	 */
	public void setIdadeMinima(Integer newIdadeMinima) {
		this.IdadeMinima = newIdadeMinima;
	}

	/**
	 * Returns Inscricoes.
	 * @return Inscricoes 
	 */
	public HashSet<Inscricao> getInscricoes() {
		return this.Inscricoes;
	}


	/**
	 * Returns partidas.
	 * @return partidas 
	 */
	public HashSet<Partida> getPartidas() {
		return this.partidas;
	}

	/**
	 * Returns Genero.
	 * @return Genero 
	 */
	public char getGenero() {
		return this.Genero;
	}

	/**
	 * Sets a value to attribute Genero. 
	 * @param newGenero 
	 */
	public void setGenero(char newGenero) {
		this.Genero = newGenero;
	}

	/**
	 * Returns Campeonato.
	 * @return Campeonato 
	 */
	public Campeonato getCampeonato() {
		return this.Campeonato;
	}

	/**
	 * Sets a value to attribute Campeonato. 
	 * @param newCampeonato 
	 */
	public void setCampeonato(Campeonato newCampeonato) {
		this.Campeonato = newCampeonato;
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
	 * Returns EnableInscr.
	 * @return EnableInscr 
	 */
	public Boolean getEnableInscr() {
		return this.EnableInscr;
	}

	/**
	 * Sets a value to attribute EnableInscr. 
	 * @param newEnableInscr 
	 */
	public void setEnableInscr(Boolean newEnableInscr) {
		this.EnableInscr = newEnableInscr;
	}

}
