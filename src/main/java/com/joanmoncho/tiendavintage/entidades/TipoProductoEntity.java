package com.joanmoncho.tiendavintage.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo producto", schema = "futbolvintage", catalog = "")
public class TipoProductoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idtipo producto", nullable = false)
    private int idtipoProducto;
    @Basic
    @Column(name = "nombre", nullable = true, length = 45)
    private String nombre;

    public int getIdtipoProducto() {
        return idtipoProducto;
    }

    public void setIdtipoProducto(int idtipoProducto) {
        this.idtipoProducto = idtipoProducto;
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

        TipoProductoEntity that = (TipoProductoEntity) o;

        if (idtipoProducto != that.idtipoProducto) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idtipoProducto;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        return result;
    }
}
