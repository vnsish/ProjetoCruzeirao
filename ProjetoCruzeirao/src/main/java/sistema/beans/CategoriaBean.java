package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

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
		System.out.println("faasdf");
		service.Salvar(categoria);
		categoria = new Categoria();
	}

}
