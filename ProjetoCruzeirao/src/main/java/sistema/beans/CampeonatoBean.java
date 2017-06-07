package sistema.beans;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

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
		service.Salvar(campeonato);
		campeonato = new Campeonato();
		
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("/Cruzeirao/pages/inicio.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
