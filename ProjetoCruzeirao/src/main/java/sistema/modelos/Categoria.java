package sistema.modelos;
/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Categoria.
 * 
 * @author v
 */
@Entity
public class Categoria {
	/**
	 * Description of the property IdadeMinima.
	 */
	private Integer IdadeMinima = Integer.valueOf(0);

	/**
	 * Description of the property Inscricoes.
	 */
	private List<Inscricao> Inscricoes;

	/**
	/**
	 * Description of the property partidas.
	 */
	public List<Partida> partidas;

	/**
	 * Description of the property Genero.
	 */
	private char Genero;

	/**
	 * Description of the property Campeonato.
	 */
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="Camp_ID")
	public Campeonato Campeonato = null;

	/**
	 * Description of the property Partidas.
	 */
	private List<Partida> Partidas;

	/**
	 * Description of the property ID.
	 */
	@Id
	@GeneratedValue
	private Integer ID;

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
		partidas = new ArrayList<Partida>();
		Inscricoes = new ArrayList<Inscricao>();
	}

	/**
	 * Description of the method AddInscricao.
	 * @param ins 
	 */
	public void AddInscricao(Inscricao ins) {
		
		Inscricoes.add(ins);
		
	}


	private int JogadoresMin;
	private int JogadoresMax;
	
	
	public int getJogadoresMin() {
		return JogadoresMin;
	}

	public void setJogadoresMin(int jogadoresMin) {
		JogadoresMin = jogadoresMin;
	}

	public int getJogadoresMax() {
		return JogadoresMax;
	}
	
	public void setJogadoresMax(int jogadoresMax) {
		JogadoresMax = jogadoresMax;
	}

	private String Nome;
	
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

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
	@OneToMany(mappedBy="Categoria")
	public List<Inscricao> getInscricoes() {
		return this.Inscricoes;
	}


	/**
	 * Returns partidas.
	 * @return partidas 
	 */
	public List<Partida> getPartidas() {
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
	 * Returns EnableInscr.
	 * @return EnableInscr 
	 */
	public Boolean isEnableInscr() {
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
