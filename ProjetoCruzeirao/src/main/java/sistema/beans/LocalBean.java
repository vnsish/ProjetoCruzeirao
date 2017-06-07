package sistema.beans;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import sistema.modelos.Local;
import sistema.service.LocalService;

@ManagedBean
@SessionScoped
public class LocalBean {
	
	private Local local;
	private LocalService service;
	
	public LocalBean()
	{
		local = new Local();
		service = new LocalService();
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}
	
	public void Salvar()
	{
		service.Salvar(local);
		local = new Local();
		
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("/Cruzeirao/pages/inicio.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
