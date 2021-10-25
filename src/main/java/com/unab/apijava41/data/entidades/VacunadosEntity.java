package com.unab.apijava41.data.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity(name="vacunados")
@EntityListeners(AuditingEntityListener.class)

@Table(indexes={

    @Index(columnList="vacunadosId", name="index_vacunadosId", unique=true)
})

public class VacunadosEntity implements Serializable{

    private static final long serialVersionUID =1L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String vacunadosId;

    @Column(nullable = false)
    private Date fecha;

    @Column(nullable = false)
    private String dosis;

    @CreatedDate
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name="user_id")
    private UsuarioEntity usuarioEntity;

    @ManyToOne
    @JoinColumn(name="vacunas_id")
    private VacunasEntity vacunasEntity;

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

    public UsuarioEntity getUsuarioEntity() {
        return usuarioEntity;
    }

    public void setUsuarioEntity(UsuarioEntity usuarioEntity) {
        this.usuarioEntity = usuarioEntity;
    }

    public VacunasEntity getVacunasEntity() {
        return vacunasEntity;
    }

    public void setVacunasEntity(VacunasEntity vacunasEntity) {
        this.vacunasEntity = vacunasEntity;
    }

   
    
    
    


    

    
}
