package com.unab.apijava41.services;

import com.unab.apijava41.shared.UsuarioCrearDto;
import com.unab.apijava41.shared.UsuarioDto;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUsuarioService extends UserDetailsService {

    public UsuarioDto crearUsuario(UsuarioCrearDto usuarioCrearDto);
    
    public UsuarioDto obtenerUsuario(String userName);

   
    
    
}
