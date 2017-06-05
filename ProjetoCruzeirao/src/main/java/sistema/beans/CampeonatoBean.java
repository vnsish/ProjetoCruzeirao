package sistema.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Campeonato;
import sistema.service.CampService;

@ManagedBean
@SessionScoped
public class CampeonatoBean {

	private Campeonato campeonato = new Campeonato();
	private CampService service = new CampService();

	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	
	public void Salvar()
	{
		System.out.println("s");
		service.Salvar(campeonato);
		campeonato = new Campeonato();
	}
}
