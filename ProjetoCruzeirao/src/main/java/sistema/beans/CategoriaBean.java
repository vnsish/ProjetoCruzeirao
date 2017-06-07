package sistema.beans;

import java.io.IOException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import sistema.modelos.Campeonato;
import sistema.modelos.Categoria;
import sistema.service.CampService;
import sistema.service.CatService;

@ManagedBean
@SessionScoped
public class CategoriaBean {
	
	Categoria categoria;
	Campeonato campeonato;
	CampService cservice;
	CatService service;
	
	
	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public Campeonato getCampeonato() {
		return campeonato;
	}


	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}


	public CategoriaBean()
	{
		categoria = new Categoria();
		cservice = new CampService();
		service = new CatService();
	}
	
	public List<Campeonato> getCampeonatos()
	{
		return cservice.getCampeonatos();
	}
	
	public void Salvar()
	{
		categoria.setCampeonato(campeonato);
		service.Salvar(categoria);
		categoria = new Categoria();
		
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("/Cruzeirao/pages/inicio.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
