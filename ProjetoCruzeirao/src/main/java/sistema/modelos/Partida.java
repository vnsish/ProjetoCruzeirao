package sistema.modelos;
import java.util.Date;
import java.util.HashSet;

/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Partida.
 * 
 * @author v
 */
public class Partida {
	/**
	 * Description of the property categorias.
	 */
	public HashSet<Categoria> categorias = new HashSet<Categoria>();

	/**
	 * Description of the property inscricaos.
	 */
	public HashSet<Inscricao>inscricaos=new HashSet<Inscricao>();

	/**
	 * Description of the property ID.
	 */
	private Integer ID = Integer.valueOf(0);

	/**
	 * Description of the property TimeA.
	 */
	private Inscricao TimeA = null;

	/**
	 * Description of the property DataHora.
	 */
	private Date DataHora = null;

	/**
	 * Description of the property Local.
	 */
	private String Local = "";

	/**
	 * Description of the property TimeB.
	 */
	private Inscricao TimeB = null;

	/**
	 * Description of the property Rodada.
	 */
	private Integer Rodada = Integer.valueOf(0);

	// Start of user code (user defined attributes for Partida)

	// End of user code

	/**
	 * The constructor.
	 */
	public Partida() {
		// Start of user code constructor for Partida)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Partida)

	// End of user code
	/**
	 * Returns categorias.
	 * @return categorias 
	 */
	public HashSet<Categoria> getCategorias() {
		return this.categorias;
	}

	/**
	 * Returns inscricaos.
	 * @return inscricaos 
	 */
	public HashSet<Inscricao> getInscricaos() {
		return this.inscricaos;
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
	 * Returns TimeA.
	 * @return TimeA 
	 */
	public Inscricao getTimeA() {
		return this.TimeA;
	}

	/**
	 * Sets a value to attribute TimeA. 
	 * @param newTimeA 
	 */
	public void setTimeA(Inscricao newTimeA) {
	    this.TimeA = newTimeA;
	}

	/**
	 * Returns DataHora.
	 * @return DataHora 
	 */
	public Date getDataHora() {
		return this.DataHora;
	}

	/**
	 * Sets a value to attribute DataHora. 
	 * @param newDataHora 
	 */
	public void setDataHora(Date newDataHora) {
		this.DataHora = newDataHora;
	}

	/**
	 * Returns Local.
	 * @return Local 
	 */
	public String getLocal() {
		return this.Local;
	}

	/**
	 * Sets a value to attribute Local. 
	 * @param newLocal 
	 */
	public void setLocal(String newLocal) {
		this.Local = newLocal;
	}

	/**
	 * Returns TimeB.
	 * @return TimeB 
	 */
	public Inscricao getTimeB() {
		return this.TimeB;
	}

	/**
	 * Sets a value to attribute TimeB. 
	 * @param newTimeB 
	 */
	public void setTimeB(Inscricao newTimeB) {
	    this.TimeB = newTimeB;
	}

	/**
	 * Returns Rodada.
	 * @return Rodada 
	 */
	public Integer getRodada() {
		return this.Rodada;
	}

	/**
	 * Sets a value to attribute Rodada. 
	 * @param newRodada 
	 */
	public void setRodada(Integer newRodada) {
		this.Rodada = newRodada;
	}

}
