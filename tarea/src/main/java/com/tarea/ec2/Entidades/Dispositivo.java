package com.tarea.ec2.Entidades;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "TB_DISPOSITIVO")
public class Dispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdDispositivo;
    private String brand;
    private String model;
    private String serial;
    private String osVersion;
    @Temporal(TemporalType.DATE)
    private Date dateCreate;
    private boolean active;

    public Long getIdDispositivo() {
        return IdDispositivo;
    }

    public void setIdDispositivo(Long idDispositivo) {
        IdDispositivo = idDispositivo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
