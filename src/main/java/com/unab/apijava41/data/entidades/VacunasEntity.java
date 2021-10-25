package com.unab.apijava41.data.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="vacunas")
public class VacunasEntity implements Serializable{
    
    private static final long serialVersionUID =1L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable= false,length=20)
    private String nombre;

    @OneToMany(cascade=CascadeType.ALL,mappedBy="vacunasEntity")
    private List<VacunadosEntity> vacunadosEntity=new ArrayList<>();

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

    public List<VacunadosEntity> getVacunadosEntity() {
        return vacunadosEntity;
    }

    public void setVacunadosEntity(List<VacunadosEntity> vacunadosEntity) {
        this.vacunadosEntity = vacunadosEntity;
    }


}
