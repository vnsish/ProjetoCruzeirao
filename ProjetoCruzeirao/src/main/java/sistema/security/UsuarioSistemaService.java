package sistema.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import sistema.service.UsuarioService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import sistema.modelos.Usuario;


/**
 * Service dedicado para fazer o meio de campo entre
 * JSF e o Spring Security 
 * 
 *
 * 
 */

public class UsuarioSistemaService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(final String cpf) throws UsernameNotFoundException {
		
		UsuarioService usuarioService = new UsuarioService();
				
		//Pesquisar o usuário no banco
		Usuario usuario = usuarioService.getUsuario(cpf);
		
		
		if (usuario != null) {
			return new UsuarioSistema(usuario, obtemGruposdoUsuario(usuario));
		}

		throw new UsernameNotFoundException("Usuario nao encontrado");
	}

	private Collection<? extends GrantedAuthority> obtemGruposdoUsuario(Usuario usuario) {
		List<GrantedAuthority> papeis = new ArrayList<>();
		
		
		papeis.add(new SimpleGrantedAuthority("ROLE_" + usuario.getRole()));

		return papeis;
	}

}
