package com.joanmoncho.tiendavintage.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo seccion", schema = "futbolvintage", catalog = "")
public class TipoSeccionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idtipo seccion", nullable = false)
    private int idtipoSeccion;
    @Basic
    @Column(name = "nombre", nullable = true, length = 45)
    private String nombre;
    @Basic
    @Column(name = "producto_idproducto", nullable = false)
    private int productoIdproducto;

    public int getIdtipoSeccion() {
        return idtipoSeccion;
    }

    public void setIdtipoSeccion(int idtipoSeccion) {
        this.idtipoSeccion = idtipoSeccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProductoIdproducto() {
        return productoIdproducto;
    }

    public void setProductoIdproducto(int productoIdproducto) {
        this.productoIdproducto = productoIdproducto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipoSeccionEntity that = (TipoSeccionEntity) o;

        if (idtipoSeccion != that.idtipoSeccion) return false;
        if (productoIdproducto != that.productoIdproducto) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idtipoSeccion;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + productoIdproducto;
        return result;
    }
}
