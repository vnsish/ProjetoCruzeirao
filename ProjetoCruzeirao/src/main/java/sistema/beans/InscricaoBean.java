package sistema.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;

import org.springframework.security.core.context.SecurityContextHolder;

import sistema.modelos.Campeonato;
import sistema.modelos.Categoria;
import sistema.modelos.Inscricao;
import sistema.modelos.Time;
import sistema.security.UsuarioSistema;
import sistema.service.CampService;
import sistema.service.TimeService;

@ManagedBean
@SessionScoped
public class InscricaoBean {
	
	private Inscricao inscricao;
	private Time time;
	private TimeService tservice = new TimeService();
	private CampService campservice = new CampService(); 
	private Campeonato campselect = new Campeonato();
	private List<Categoria> categorias;
	
	
	public Inscricao getInscricao() {
		return inscricao;
	}

	public void setInscricao(Inscricao inscricao) {
		this.inscricao = inscricao;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Campeonato getCampselect() {
		return campselect;
	}

	public void setCampselect(Campeonato campselect) {
		this.campselect = campselect;
	}

	public InscricaoBean() {
		
		inscricao = new Inscricao();
	}

	public List<Time> getTimes()
	{
		
		UsuarioSistema usr = (UsuarioSistema)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		List<Time> temp = tservice.getTimes();
		List<Time> remove = new ArrayList<Time>();
		
		for (Time t: temp)
		{
			if(t.getDiretor().getCPF() == usr.getUsername())
				remove.add(t);
		}
		
		temp.removeAll(remove);
		
		return temp;
		
	}
	
	public void changeCampeonato(AjaxBehaviorEvent event)
	{
		categorias = campselect.getCategorias();
		System.out.println(categorias.toString());
	}
	
	public List<Campeonato> getCampeonatos()
	{
		return campservice.getCampeonatos();
	}
	
	public List<Categoria> getCategorias()
	{
		
		return categorias;
		
	}
	
}
