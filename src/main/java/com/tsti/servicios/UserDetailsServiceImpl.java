package com.tsti.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.tsti.accesoADatos.UsuarioDAO;

/**
 * Servicio utilizado por Spring Security para obtener el usuario que está requiriendo acceder a nuestros recursos.
 * Luego con ese usuario chequeaá si está autenticado y si está autorizado 
 * @author dardo
 *
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    private UsuarioDAO usuarioDao;
    
    @Override
    public UserDetails loadUserByUsername(String username){
    	return usuarioDao.findByUsername(username);

    }
    
    
}