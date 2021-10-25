package com.unab.apijava41.controllers;

import com.unab.apijava41.models.peticiones.VacunadosCrearRequestModel;
import com.unab.apijava41.models.respuestas.VacunadosRestModel;
import com.unab.apijava41.services.IVacunadosService;
import com.unab.apijava41.shared.VacunadosCrearDto;
import com.unab.apijava41.shared.VacunadosDto;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vacunados")
public class vacunadosControllers {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IVacunadosService ivacunadosService;

    @PostMapping
    public VacunadosRestModel crearVacunas(@RequestBody VacunadosCrearRequestModel vacunadosCrearRequestModel){


        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        
        String userName = authentication.getPrincipal().toString();

        VacunadosCrearDto vacunadosCrearDto = modelMapper.map(vacunadosCrearRequestModel, VacunadosCrearDto.class);

        vacunadosCrearDto.setUserName(userName);

        VacunadosDto vacunadosDto=ivacunadosService.crearVacunados(vacunadosCrearDto);
        
        VacunadosRestModel vacunadosRestModel = modelMapper.map(vacunadosDto,VacunadosRestModel.class);

        return vacunadosRestModel;

    }
    
}
