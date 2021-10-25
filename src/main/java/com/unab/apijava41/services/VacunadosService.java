package com.unab.apijava41.services;

import java.util.UUID;

import com.unab.apijava41.data.entidades.UsuarioEntity;
import com.unab.apijava41.data.entidades.VacunadosEntity;
import com.unab.apijava41.data.entidades.VacunasEntity;
import com.unab.apijava41.data.repositorios.IUsuarioRepository;
import com.unab.apijava41.data.repositorios.IVacunadosRepository;
import com.unab.apijava41.data.repositorios.IVacunasRepository;
import com.unab.apijava41.shared.VacunadosCrearDto;
import com.unab.apijava41.shared.VacunadosDto;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class VacunadosService implements IVacunadosService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IUsuarioRepository iUsuarioRepository;

    @Autowired
    IVacunasRepository iVacunasRepository;

    @Autowired
    IVacunadosRepository iVacunadosRepository;



    @Override
    public VacunadosDto crearVacunados(VacunadosCrearDto vacunadosCrearDto){

        UsuarioEntity usuarioEntity =iUsuarioRepository.findByUserName(vacunadosCrearDto.getUserName());

        VacunasEntity vacunasEntity=iVacunasRepository.findById(vacunadosCrearDto.getVacunas());

        VacunadosEntity vacunadosEntity = new VacunadosEntity();

        vacunadosEntity.setVacunadosId(UUID.randomUUID().toString());
        
        vacunadosEntity.setFecha(vacunadosCrearDto.getFecha());

        vacunadosEntity.setDosis("0");

        vacunadosEntity.setUsuarioEntity(usuarioEntity);

        vacunadosEntity.setVacunasEntity(vacunasEntity);

        VacunadosEntity vacunadosCreado = iVacunasRepository.save(vacunadosEntity);

        VacunadosDto vacunadosDto = modelMapper.map(vacunadosCreado,VacunadosDto.class);

        return vacunadosDto;
    }



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        return null;
    }
    
}
