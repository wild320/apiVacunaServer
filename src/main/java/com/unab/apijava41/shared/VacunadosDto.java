package com.unab.apijava41.shared;

import java.io.Serializable;
import java.util.Date;

public class VacunadosDto implements Serializable{

    private static final long serialVersionUID =1L;

    private long id;
    private String vacunadosId;
    private Date fecha;
    private String dosis;
    private Date createdAt;
    private UsuarioDto usuarioDto;
    private VacunasDto vacunasDto;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getVacunadosId() {
        return vacunadosId;
    }
    public void setVacunadosId(String vacunadosId) {
        this.vacunadosId = vacunadosId;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getDosis() {
        return dosis;
    }
    public void setDosis(String dosis) {
        this.dosis = dosis;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public UsuarioDto getUsuarioDto() {
        return usuarioDto;
    }
    public void setUsuarioDto(UsuarioDto usuarioDto) {
        this.usuarioDto = usuarioDto;
    }
    public VacunasDto getVacunasDto() {
        return vacunasDto;
    }
    public void setVacunasDto(VacunasDto vacunasDto) {
        this.vacunasDto = vacunasDto;
    }

    

    
}
