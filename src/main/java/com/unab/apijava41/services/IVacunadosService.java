package com.unab.apijava41.services;

import com.unab.apijava41.shared.VacunadosCrearDto;
import com.unab.apijava41.shared.VacunadosDto;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface IVacunadosService extends UserDetailsService {

    public VacunadosDto crearVacunados(VacunadosCrearDto vacunadosCrearDto);
    
    
}
