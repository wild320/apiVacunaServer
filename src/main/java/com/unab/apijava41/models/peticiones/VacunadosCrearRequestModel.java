package com.unab.apijava41.models.peticiones;

import java.util.Date;

public class VacunadosCrearRequestModel {

    private Date fecha;
    private String vacunas;
    
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getVacunas() {
        return vacunas;
    }
    public void setVacunas(String vacunas) {
        this.vacunas = vacunas;
    }


    
    
    
}
