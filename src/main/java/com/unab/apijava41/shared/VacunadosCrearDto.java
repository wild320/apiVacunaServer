package com.unab.apijava41.shared;

import java.io.Serializable;
import java.util.Date;

public class VacunadosCrearDto implements Serializable{

    private static final long serialVersionUID =1L;

    private Date fecha;
    private long vacunas;
    private String UserName;
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public long getVacunas() {
        return vacunas;
    }
    public void setVacunas(long vacunas) {
        this.vacunas = vacunas;
    }
    public String getUserName() {
        return UserName;
    }
    public void setUserName(String userName) {
        UserName = userName;
    }

    

    

}
