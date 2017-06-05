package sistema.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import sistema.modelos.Campeonato;
import sistema.service.CampService;

@FacesConverter("converterCampeonato")
public class CampeonatoConverter implements Converter{
	
	
	CampService service = new CampService();
	
	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {

		
		if (value != null && !value.isEmpty()) {			
			  for(Campeonato c : service.getCampeonatos())
				 if(c.getNome().equals(value))
				 {
					 System.out.println(c.getClass());
				  	return c;
				 }
		}
		return null;
	}
	
	
	@Override
	public String getAsString(FacesContext fc, UIComponent uic,
			Object camp) {
		if (camp == null || camp.equals("")) {
			return null;
		} else {
			return ((Campeonato) camp).getNome();

		}
	}

}
