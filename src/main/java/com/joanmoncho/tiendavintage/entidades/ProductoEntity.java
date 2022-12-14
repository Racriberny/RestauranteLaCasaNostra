package com.joanmoncho.tiendavintage.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "producto", schema = "futbolvintage", catalog = "")
public class ProductoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idproducto", nullable = false)
    private int idproducto;
    @Basic
    @Column(name = "nombre", nullable = true, length = 45)
    private String nombre;
    @Basic
    @Column(name = "talla", nullable = true, length = 1)
    private String talla;
    @Basic
    @Column(name = "materiales", nullable = true, length = 45)
    private String materiales;
    @Basic
    @Column(name = "equipo_idequipo", nullable = false)
    private int equipoIdequipo;
    @Basic
    @Column(name = "marca_idmarca", nullable = false)
    private int marcaIdmarca;
    @Basic
    @Column(name = "idtipo seccion", nullable = false)
    private int idtipoSeccion;
    @Basic
    @Column(name = "idtalla", nullable = false)
    private int idtalla;
    @Basic
    @Column(name = "idtipo producto", nullable = false)
    private int idtipoProducto;

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public int getEquipoIdequipo() {
        return equipoIdequipo;
    }

    public void setEquipoIdequipo(int equipoIdequipo) {
        this.equipoIdequipo = equipoIdequipo;
    }

    public int getMarcaIdmarca() {
        return marcaIdmarca;
    }

    public void setMarcaIdmarca(int marcaIdmarca) {
        this.marcaIdmarca = marcaIdmarca;
    }

    public int getIdtipoSeccion() {
        return idtipoSeccion;
    }

    public void setIdtipoSeccion(int idtipoSeccion) {
        this.idtipoSeccion = idtipoSeccion;
    }

    public int getIdtalla() {
        return idtalla;
    }

    public void setIdtalla(int idtalla) {
        this.idtalla = idtalla;
    }

    public int getIdtipoProducto() {
        return idtipoProducto;
    }

    public void setIdtipoProducto(int idtipoProducto) {
        this.idtipoProducto = idtipoProducto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductoEntity that = (ProductoEntity) o;

        if (idproducto != that.idproducto) return false;
        if (equipoIdequipo != that.equipoIdequipo) return false;
        if (marcaIdmarca != that.marcaIdmarca) return false;
        if (idtipoSeccion != that.idtipoSeccion) return false;
        if (idtalla != that.idtalla) return false;
        if (idtipoProducto != that.idtipoProducto) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (talla != null ? !talla.equals(that.talla) : that.talla != null) return false;
        if (materiales != null ? !materiales.equals(that.materiales) : that.materiales != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idproducto;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (talla != null ? talla.hashCode() : 0);
        result = 31 * result + (materiales != null ? materiales.hashCode() : 0);
        result = 31 * result + equipoIdequipo;
        result = 31 * result + marcaIdmarca;
        result = 31 * result + idtipoSeccion;
        result = 31 * result + idtalla;
        result = 31 * result + idtipoProducto;
        return result;
    }
}
