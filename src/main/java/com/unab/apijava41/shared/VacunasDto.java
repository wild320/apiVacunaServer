package com.unab.apijava41.shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class VacunasDto implements Serializable{

    private static final long serialVersionUID =1L;

    private long id;
    private String nombre;
    private List<VacunadosDto> vacunadosDtoList = new ArrayList<>();
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<VacunadosDto> getVacunadosDtoList() {
        return vacunadosDtoList;
    }
    public void setVacunadosDtoList(List<VacunadosDto> vacunadosDtoList) {
        this.vacunadosDtoList = vacunadosDtoList;
    }
   
    
    
}
