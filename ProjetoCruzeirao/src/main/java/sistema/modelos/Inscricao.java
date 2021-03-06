package sistema.modelos;
/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/

import java.util.ArrayList;
import java.util.List;
// Start of user code (user defined imports)

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

// End of user code

/**
 * Description of Inscricao.
 * 
 * @author v
 */
@Entity
public class Inscricao
{
	/**
	 * Description of the property Jogadores.
	 */
	@OneToMany(mappedBy="inscricao")
	private List<InscricaoJogador> Jogadores;
	
	/**
	 * Description of the property Comissao.
	 */
	
	private List<Usuario> Comissao;

	/**
	 * Description of the property Time.
	 */
	public Time Time = null;

	/**
	 * Description of the property Categoria.
	 */
	@ManyToOne
	@JoinColumn(name="CAT_ID")
	public Categoria Categoria = null;


	/**
	 * Description of the property ID.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;

	
	private boolean Paga = false;
	
	public boolean isPaga() {
		return Paga;
	}

	public void setPaga(boolean paga) {
		Paga = paga;
	}

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
	public List<InscricaoJogador> getJogadores() {
		return this.Jogadores;
	}

	public void addJogador(Usuario usuario){
		InscricaoJogador insc = new InscricaoJogador();
		insc.setInscricao(this);
		insc.setUsuario(usuario);
		insc.setConfirmado(false);
		if(this.Jogadores == null)
			this.Jogadores = new ArrayList<>();
		
		Jogadores.add(insc);
	}
	
	/**
	 * Returns Comissao.
	 * @return Comissao 
	 */
	public List<Usuario> getComissao() {
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

	public void setJogadores(List<InscricaoJogador> jogadores) {
		Jogadores = jogadores;
	}

	
	
}
