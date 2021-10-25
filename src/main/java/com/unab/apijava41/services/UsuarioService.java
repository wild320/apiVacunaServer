package com.unab.apijava41.services;

import java.util.ArrayList;
import java.util.UUID;

import com.unab.apijava41.data.entidades.UsuarioEntity;
import com.unab.apijava41.data.repositorios.IUsuarioRepository;
import com.unab.apijava41.shared.UsuarioCrearDto;
import com.unab.apijava41.shared.UsuarioDto;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;



@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    ModelMapper modelmapper;

    @Autowired
    IUsuarioRepository iUsuarioRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UsuarioDto crearUsuario(UsuarioCrearDto usuarioCrearDto) {

        if(iUsuarioRepository.findByCorreo(usuarioCrearDto.getCorreo())!=null) {
            throw new RuntimeException("Este Correo Ya Se Encuentra Registrado");
        }

        if(iUsuarioRepository.findByUserName(usuarioCrearDto.getUserName())!=null) {
            throw new RuntimeException("Este Nombre De Usuario Ya Esta En Uso");
        }

        UsuarioEntity usuarioEntityDto = modelmapper.map(usuarioCrearDto,UsuarioEntity.class);
        usuarioEntityDto.setUserId(UUID.randomUUID().toString());
        usuarioEntityDto.setEncryptedPassword(bCryptPasswordEncoder.encode(usuarioCrearDto.getPassword()));

        UsuarioEntity usuarioEntitySave=iUsuarioRepository.save(usuarioEntityDto);

        UsuarioDto usuarioDto = modelmapper.map(usuarioEntitySave,UsuarioDto.class);
        
        return usuarioDto;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
       
        UsuarioEntity usuarioEntity=iUsuarioRepository.findByUserName(userName);

        if(usuarioEntity==null){
            throw new UsernameNotFoundException(userName);
        }

        return new User(usuarioEntity.getUserName(),usuarioEntity.getEncryptedPassword(),new ArrayList<>());
    }
    @Override  
    public UsuarioDto obtenerUsuario(String userName){
        UsuarioEntity usuarioEntity=iUsuarioRepository.findByUserName(userName);

        if(usuarioEntity==null){
            throw new UsernameNotFoundException(userName);
        }
        UsuarioDto usuarioDtoObtenido = modelmapper.map(usuarioEntity,UsuarioDto.class);
        return usuarioDtoObtenido;

    }
}
