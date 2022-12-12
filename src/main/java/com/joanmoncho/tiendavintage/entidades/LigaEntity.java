package com.joanmoncho.tiendavintage.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "liga", schema = "futbolvintage", catalog = "")
public class LigaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idliga", nullable = false)
    private int idliga;
    @Basic
    @Column(name = "nombre", nullable = true, length = 45)
    private String nombre;

    public int getIdliga() {
        return idliga;
    }

    public void setIdliga(int idliga) {
        this.idliga = idliga;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LigaEntity that = (LigaEntity) o;

        if (idliga != that.idliga) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idliga;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        return result;
    }
}
