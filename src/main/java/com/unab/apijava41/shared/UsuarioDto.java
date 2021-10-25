package com.unab.apijava41.shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDto implements Serializable{

    private static final long serialVersionUID =1L;

    private long id;
    private String userId;
    private String nombre;
    private String correo;
    private String userName;
    private String password;
    private String encryptedPassword;
    private List<VacunadosDto> vacunadosDtoList = new ArrayList<>();

    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEncryptedPassword() {
        return encryptedPassword;
    }
    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }
    public List<VacunadosDto> getVacunadosDtoList() {
        return vacunadosDtoList;
    }
    public void setVacunadosDtoList(List<VacunadosDto> vacunadosDtoList) {
        this.vacunadosDtoList = vacunadosDtoList;
    }

    
    
    
}
