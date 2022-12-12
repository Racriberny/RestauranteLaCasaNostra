package com.joanmoncho.tiendavintage.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "equipo", schema = "futbolvintage", catalog = "")
public class EquipoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idequipo", nullable = false)
    private int idequipo;
    @Basic
    @Column(name = "nombre", nullable = true, length = 45)
    private String nombre;
    @Basic
    @Column(name = "nacionalidad", nullable = true)
    private Byte nacionalidad;
    @Basic
    @Column(name = "liga_idliga", nullable = false)
    private int ligaIdliga;

    public int getIdequipo() {
        return idequipo;
    }

    public void setIdequipo(int idequipo) {
        this.idequipo = idequipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Byte getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Byte nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getLigaIdliga() {
        return ligaIdliga;
    }

    public void setLigaIdliga(int ligaIdliga) {
        this.ligaIdliga = ligaIdliga;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EquipoEntity that = (EquipoEntity) o;

        if (idequipo != that.idequipo) return false;
        if (ligaIdliga != that.ligaIdliga) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (nacionalidad != null ? !nacionalidad.equals(that.nacionalidad) : that.nacionalidad != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idequipo;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (nacionalidad != null ? nacionalidad.hashCode() : 0);
        result = 31 * result + ligaIdliga;
        return result;
    }
}
