package sistema.modelos;
import java.util.HashSet;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Entity
public class Time {
	/**
	 * Description of the property Nome.
	 */
	private String Nome = "";

	/**
	 * Description of the property ID.
	 */
	@Id
	private Integer ID = Integer.valueOf(0);

	/**
	 * Description of the property Inscricoes.
	 */
	
	@Embeddable
	public static class Endereco
	{
		private String End1;
		private String End2;
		private String CEP;
		private String Tel;
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
		public String getCEP() {
			return CEP;
		}
		public void setCEP(String cEP) {
			CEP = cEP;
		}
		public String getTel() {
			return Tel;
		}
		public void setTel(String tel) {
			Tel = tel;
		}
		
		
	}
	
	Endereco end;
	
	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}

	public Time() {
		// Start of user code constructor for Time)
		super();
		end = new Endereco();
		// End of user code
	}
	
	
	@ManyToOne
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
