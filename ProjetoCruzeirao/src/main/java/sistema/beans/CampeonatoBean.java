package sistema.beans;

import javax.faces.bean.ManagedBean;

import sistema.modelos.Campeonato;
import sistema.service.CampService;

@ManagedBean
public class CampeonatoBean {

	private Campeonato campeonato;
	private CampService service;

	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	
	public CampeonatoBean()
	{
		campeonato = new Campeonato();
		service = new CampService();
	}
	
	public void Salvar()
	{
		service.Salvar(campeonato);
	}
}
