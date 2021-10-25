package com.unab.apijava41.controllers;


import com.unab.apijava41.models.peticiones.UsuarioRegistrarRequestModel;
import com.unab.apijava41.models.respuestas.UsuarioRestModel;
import com.unab.apijava41.services.IUsuarioService;
import com.unab.apijava41.shared.UsuarioCrearDto;
import com.unab.apijava41.shared.UsuarioDto;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControllers {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IUsuarioService iUsuarioService;

    @GetMapping(produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
    public UsuarioRestModel obtenerUsuario() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        String userName = authentication.getPrincipal().toString();
        
        UsuarioDto usuarioDto = iUsuarioService.obtenerUsuario(userName);

        UsuarioRestModel usuarioRestModel = modelMapper.map(usuarioDto, UsuarioRestModel.class);
        
        return usuarioRestModel;
    }

    @PostMapping
    public UsuarioRestModel crearUsuario(@RequestBody @Validated UsuarioRegistrarRequestModel usuarioRegistroRequestModel) {

        UsuarioCrearDto usuarioCrearDto = modelMapper.map(usuarioRegistroRequestModel, UsuarioCrearDto.class);

        UsuarioDto usuarioDto = iUsuarioService.crearUsuario(usuarioCrearDto);

        UsuarioRestModel UsuarioRestModel = modelMapper.map(usuarioDto, UsuarioRestModel.class);

        return UsuarioRestModel;
    }

}
