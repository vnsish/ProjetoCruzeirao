package sistema.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class InscricaoJogador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="Inscricao_ID")
	private Inscricao inscricao;
	
	@ManyToOne
	@JoinColumn(name="Jogador_ID")
	private Usuario usuario;

	private boolean Confirmado;
	

	public Inscricao getInscricao() {
		return inscricao;
	}

	public void setInscricao(Inscricao inscricao) {
		this.inscricao = inscricao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public boolean isConfirmado() {
		return Confirmado;
	}

	public void setConfirmado(boolean confirmado) {
		Confirmado = confirmado;
	}

}
