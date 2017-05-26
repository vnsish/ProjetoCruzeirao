package sistema.modelos;
import java.util.HashSet;

import javax.persistence.ManyToOne;

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
	
	class Endereco
	{
		private String End1;
		private String End2;
		private int CEP;
		private int Tel;
		public String getEnd1() {
			return End1;
		}
		public void setEnd1(String end1) {
			End1 = end1;
		}
		public String getEnd2() {
			return End2;
		}
		public void setEnd2(String end2) {
			End2 = end2;
		}
		public int getCEP() {
			return CEP;
		}
		public void setCEP(int cEP) {
			CEP = cEP;
		}
		public int getTel() {
			return Tel;
		}
		public void setTel(int tel) {
			Tel = tel;
		}
	
		
	}

	public Time() {
		// Start of user code constructor for Time)
		super();
		// End of user code
	}
	
	
	private Usuario Diretor;
	
		
	
	public Usuario getDiretor() {
		return Diretor;
	}

	public void setDiretor(Usuario diretor) {
		Diretor = diretor;
	}

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


}
