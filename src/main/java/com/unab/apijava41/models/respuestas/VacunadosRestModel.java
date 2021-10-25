package com.unab.apijava41.models.respuestas;

import java.sql.Date;

public class VacunadosRestModel {


    
    private String vacunadosId;
    private Date fecha;
    private String dosis;
    private Date createdAt;
    private UsuarioRestModel usuarioRestModel;
    private VacunasRestModel VacunasRestModel;
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
    public UsuarioRestModel getUsuarioRestModel() {
        return usuarioRestModel;
    }
    public void setUsuarioRestModel(UsuarioRestModel usuarioRestModel) {
        this.usuarioRestModel = usuarioRestModel;
    }
    public VacunasRestModel getVacunasRestModel() {
        return VacunasRestModel;
    }
    public void setVacunasRestModel(VacunasRestModel vacunasRestModel) {
        VacunasRestModel = vacunasRestModel;
    }

    

    


    
    
}
