package sistema.modelos;
/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

import java.util.HashSet;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Inscricao.
 * 
 * @author v
 */
public class Inscricao
{
	/**
	 * Description of the property Jogadores.
	 */
	private HashSet<Usuario> Jogadores = new HashSet<Usuario>();
	
	/**
	 * Description of the property Comissao.
	 */
	private HashSet<Usuario> Comissao = new HashSet<Usuario>();

	/**
	 * Description of the property Time.
	 */
	public Time Time = null;

	/**
	 * Description of the property partidas.
	 */
	public HashSet<Partida> partidas = new HashSet<Partida>();

	/**
	 * Description of the property Categoria.
	 */
	public Categoria Categoria = null;

	/**
	 * Description of the property Diretor.
	 */
	private Usuario Diretor = null;

	/**
	 * Description of the property ID.
	 */
	private Integer ID = Integer.valueOf(0);

	/**
	 * Description of the property usuarios.
	 */
	public HashSet<Usuario> usuarios = new HashSet<Usuario>();
	
	// Start of user code (user defined attributes for Inscrição)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public Inscricao() {
		// Start of user code constructor for Inscrição)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Inscrição)

	// End of user code
	/**
	 * Returns Jogadores.
	 * @return Jogadores 
	 */
	public HashSet<Usuario> getJogadores() {
		return this.Jogadores;
	}

	/**
	 * Returns Comissao.
	 * @return Comissao 
	 */
	public HashSet<Usuario> getComissao() {
		return this.Comissao;
	}

	/**
	 * Returns Time.
	 * @return Time 
	 */
	public Time getTime() {
		return this.Time;
	}

	/**
	 * Sets a value to attribute Time. 
	 * @param newTime 
	 */
	public void setTime(Time newTime) {
		this.Time = newTime;
	}

	/**
	 * Returns partidas.
	 * @return partidas 
	 */
	public HashSet<Partida> getPartidas() {
		return this.partidas;
	}

	/**
	 * Returns Categoria.
	 * @return Categoria 
	 */
	public Categoria getCategoria() {
		return this.Categoria;
	}

	/**
	 * Sets a value to attribute Categoria. 
	 * @param newCategoria 
	 */
	public void setCategoria(Categoria newCategoria) {
		this.Categoria = newCategoria;
	}

	/**
	 * Returns Diretor.
	 * @return Diretor 
	 */
	public Usuario getDiretor() {
		return this.Diretor;
	}

	/**
	 * Sets a value to attribute Diretor. 
	 * @param newDiretor 
	 */
	public void setDiretor(Usuario newDiretor) {
	    this.Diretor = newDiretor;
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
	 * Returns usuarios.
	 * @return usuarios 
	 */
	public HashSet<Usuario> getUsuarios() {
		return this.usuarios;
	}

}
