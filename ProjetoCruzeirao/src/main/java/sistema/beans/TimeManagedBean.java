package sistema.beans;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.security.core.context.SecurityContextHolder;

import sistema.modelos.Time;
import sistema.modelos.Usuario;
import sistema.security.UsuarioSistema;
import sistema.service.TimeService;

@ManagedBean
@SessionScoped
public class TimeManagedBean {
	
	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	private Time time = new Time();
	private TimeService service = new TimeService();

	public void saveTime(){
		
		time.setDiretor(((UsuarioSistema)SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsuario());
	
		service.Salvar(time);
	
		time = new Time();
		
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("/Cruzeirao/pages/inicio.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
