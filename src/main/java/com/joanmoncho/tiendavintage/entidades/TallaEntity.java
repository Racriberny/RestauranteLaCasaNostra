package com.joanmoncho.tiendavintage.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "talla", schema = "futbolvintage", catalog = "")
public class TallaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idtalla", nullable = false)
    private int idtalla;
    @Basic
    @Column(name = "nombre", nullable = true, length = 1)
    private String nombre;

    public int getIdtalla() {
        return idtalla;
    }

    public void setIdtalla(int idtalla) {
        this.idtalla = idtalla;
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

        TallaEntity that = (TallaEntity) o;

        if (idtalla != that.idtalla) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idtalla;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        return result;
    }
}
